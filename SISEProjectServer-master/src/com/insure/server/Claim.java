package com.insure.server;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;

public class Claim {
	private int userId;
	private final int uuid;
	private String description;
	private ConcurrentHashMap<Integer, Object[]> storedDocuments;
	private AtomicInteger docid = new AtomicInteger(0);

	public Claim(int userId, int claimId, String description) {
		this.userId = userId;
		this.uuid = claimId;
		this.description = description;
		this.storedDocuments = new ConcurrentHashMap<Integer, Object[]>();
	}

	@Override
	// This method returns the claim parameters and all its documents as a string
	public String toString() {
		String claimString = "{ClaimID: " + this.uuid + ", Description: " + this.description;
		if (this.storedDocuments.isEmpty()) {
			return claimString + "}";
		}
		int j = 1;
		int i = 1;
		while (i <= this.storedDocuments.size()) {
			if (this.storedDocuments.containsKey(j)) {
				claimString += "\n    " + ((Document) this.storedDocuments.get(j)[0]).docList();
				i++;
			}
			j++;
		}
		return claimString + "}";
	}

	public int getUuid() {
		return this.uuid;
	}

	public String getDescription() {
		return this.description;
	}

	public int getUserId() {
		return this.userId;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public boolean checkDocId(int docId) {
		return this.storedDocuments.containsKey(docId);
	}

	// This method creates a new document and adds it to the hashMap of the
	// correspondent claim. It returns an array with the document at position 0 and
	// the correspondent signature at position 1
	public Object[] addDoc(int userId, String name, String type, String documentContent, String hash) throws Exception {
		Document document = new Document(userId, this.docid.incrementAndGet(), name, type, documentContent);
		Object[] arr = { document, hash };
		this.storedDocuments.put(document.getDocid(), arr);
		return arr;
	}

	// This method deletes the specified document from the hashMap
	public void deleteDoc(int docId) throws DocumentException {
		this.storedDocuments.remove(docId);
	}

	// This method updates the description of the specified document
	public void updateDoc(int userId, int docId, String newDescription, String hash) throws Exception {
		Document document = retrieveDoc(docId);
		document.setDescription(newDescription);
		this.storedDocuments.replace(docId, new Object[] { document, hash });
	}

	// This method returns the specified document as a string
	public String readDoc(int docId) throws DocumentException {
		Document document = retrieveDoc(docId);
		return document.doc2String();
	}

	// This method returns the specified document
	public Document retrieveDoc(int docId) throws DocumentException {
		return (Document) this.storedDocuments.get(docId)[0];
	}

	// This method returns the signature of a specified document
	public String retrieveSignature(int docId) throws DocumentException {
		return (String) this.storedDocuments.get(docId)[1];
	}

	// This method returns true when a valid user is inserted
	public boolean validateInsured(int userId) {
		if (!(userId == this.userId || (userId >= 6 && userId <= 10))) {
			return false;
		}
		return true;
	}
}
