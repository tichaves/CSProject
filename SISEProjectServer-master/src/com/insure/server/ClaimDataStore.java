package com.insure.server;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;

import javax.jws.WebService;

@WebService

public class ClaimDataStore {
	private static int BIGGEST_USER_ID = 10;
	private static int BIGGEST_INSURED_ID = 5;
	private static AtomicInteger uuid = new AtomicInteger(0);
	private ConcurrentHashMap<Integer, Claim> storedClaims = new ConcurrentHashMap<Integer, Claim>();

	public ClaimDataStore() {
	}

	// This method creates a new claim and adds it to the hashMap of the
	// correspondent ClaimDataStore. It returns the claim ID
	public synchronized int createClaim(int insuredID, String description) throws ClaimException {
		if (!(insuredID >= 1 && insuredID <= 5)) {
			throw new ClaimException("AUTHENTICATION ERROR: The specified user can't create a claim.");
		}
		isEmpty(description);
		Claim claim = new Claim(insuredID, this.uuid.incrementAndGet(), description);
		this.storedClaims.put(claim.getUuid(), claim);
		return claim.getUuid();
	}

	// This method returns a claim from a claim ID
	public synchronized Claim retrieveClaim(int userId, int claimId) throws ClaimException {
		return this.storedClaims.get(claimId);
	}

	// This method updates the description of the specified claim
	public synchronized void updateClaim(int userId, int claimId, String newDescription)
			throws ClaimException, DocumentException {
		validateClaimId(claimId);
		validateInsuredId(userId, claimId, "update this claim.");
		isEmpty(newDescription);
		retrieveClaim(userId, claimId).setDescription(newDescription);
	}

	// This method creates a new document and adds it to the hashMap of the
	// correspondent claim. It returns an array with the document at position 0 and
	// the correspondent signature at position 1
	public synchronized int addDocument(int userId, int claimId, String name, String type, String documentInfo,
			String hash) throws Exception {
		validateClaimId(claimId);
		validateInsuredId(userId, claimId, "add this document.");
		validateDocSignature(userId, claimId, documentInfo, hash, "add");
		isEmpty(name);
		isEmpty(type);
		isEmpty(documentInfo);
		Object[] arr = retrieveClaim(userId, claimId).addDoc(userId, name, type, documentInfo, hash);
		int docId = ((Document) arr[0]).getDocid();
		return docId;
	}

	// This method deletes the specified document from the hashMap
	public synchronized boolean deleteDocument(int userId, int claimId, int docId) throws Exception {
		validateClaimId(claimId);
		validateDocId(userId, claimId, docId);
		String content = retrieveClaim(userId, claimId).retrieveDoc(docId).getDocumentContent();
		String hash = retrieveClaim(userId, claimId).retrieveSignature(docId);
		validateDocSignature(userId, claimId, content, hash, "delete");
		retrieveClaim(userId, claimId).deleteDoc(docId);
		return true;
	}

	// This method lists all the documents of a specified claim, returning a string
	public synchronized String listDocuments(int userId, int claimId) throws ClaimException, DocumentException {
		validateClaimId(claimId);
		validateInsuredId(userId, claimId, "list these documents");
		Claim claim = this.storedClaims.get(claimId);
		return claim.toString();
	}

	// This method updates the description of the specified document
	public synchronized boolean updateDocument(int userId, int claimId, int docId, String newContent, String newHash)
			throws Exception {
		validateClaimId(claimId);
		validateDocId(userId, claimId, docId);
		String oldContent = retrieveClaim(userId, claimId).retrieveDoc(docId).getDocumentContent();
		String oldHash = retrieveClaim(userId, claimId).retrieveSignature(docId);
		validateDocSignature(userId, claimId, oldContent, oldHash, "update");
		isEmpty(newContent);
		this.storedClaims.get(claimId).updateDoc(userId, docId, newContent, newHash);
		return true;
	}

	// This method return some document parameters
	public synchronized Object[] readDocument(int userId, int claimId, int docId)
			throws ClaimException, DocumentException {
		validateClaimId(claimId);
		validateDocId(userId, claimId, docId);
		validateInsuredId(userId, claimId, "read this document.");
		int docAuthorID = retrieveClaim(userId, claimId).retrieveDoc(docId).getUserId();
		String name = retrieveClaim(userId, claimId).retrieveDoc(docId).getName();
		String type = retrieveClaim(userId, claimId).retrieveDoc(docId).getType();
		String content = retrieveClaim(userId, claimId).retrieveDoc(docId).getDocumentContent();
		String timestamp = retrieveClaim(userId, claimId).retrieveDoc(docId).getTimestamp().toString();
		String hash = retrieveClaim(userId, claimId).retrieveSignature(docId);
		Object[] arr = { docAuthorID, name, type, timestamp, content, hash };
		return arr;
	}

	// This method validates the document signature
	public void validateDocSignature(int userId, int claimId, String documentInfo, String Hash, String message)
			throws Exception {
		if (!(new Signature()).validateSignature(userId, documentInfo, Hash)) {
			throw new DocumentException("SIGNATURE ERROR: The specified user can't " + message + " this document.");
		}
	}

	// This method validates the user identifier which can be from 1 to 10
	public void validateUser(int userId) throws IdUserException {
		if (!(userId > 0 && userId <= BIGGEST_USER_ID)) {
			throw new IdUserException("Invalide Identification!");
		}
	}

	// This method validates the insured identifier which can be from 1 to 5
	public void isInsured(int userId) throws IdUserException {
		if (!(userId > 0 && userId <= BIGGEST_INSURED_ID)) {
			throw new IdUserException("Invalide Insured Identification!");
		}
	}

	// This method validates the claim ID
	public void validateClaimId(int claimId) throws ClaimException {
		if (!this.storedClaims.containsKey(claimId)) {
			throw new ClaimException("INVALID CLAIM ID: The specified claim ID does not exist.");
		}
	}

	// This method validates the document ID
	public void validateDocId(int userId, int claimId, int docId) throws ClaimException {
		if (!retrieveClaim(userId, claimId).checkDocId(docId)) {
			throw new ClaimException("INVALID DOC ID: The specified document ID does not exist.");
		}
	}

	// This method validates the user ID
	public void validateInsuredId(int userId, int claimId, String message) throws DocumentException, ClaimException {
		if (!retrieveClaim(userId, claimId).validateInsured(userId)) {
			throw new DocumentException("AUTHENTICATION ERROR: The specified user can't " + message);
		}
	}

	// This method validates if the string is empty or not
	public void isEmpty(String value) throws ClaimException {
		if (value.equals("")) {
			throw new ClaimException("The parameter is empty.");
		}
	}
}