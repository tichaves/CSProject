package com.insure.client;

import java.io.UnsupportedEncodingException;
import java.nio.file.Paths;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.util.Base64;

public class Signature {

	public Signature() {
	}

	// This method generates an hash from a document
	public String generateHash(String doc) throws NoSuchAlgorithmException, UnsupportedEncodingException {
		MessageDigest digest = MessageDigest.getInstance("SHA-256");
		String hash = Base64.getEncoder().encodeToString(digest.digest(doc.getBytes("UTF-8")));
		return hash;
	}

	// This method encrypts an hash with a private key
	public String encryptHash(String filePrivKeyName, String hash) throws Exception {
		AsymEncryptPriv cipher = new AsymEncryptPriv();
		PrivateKey pKey = cipher
				.getPrivate(Paths.get("").toAbsolutePath() + System.getProperty("file.separator") + filePrivKeyName);
		return cipher.encryptText(hash, pKey);
	}

	// This method decrypts an hash with a public key
	public String decryptHash(String filePubKeyName, String encryptedHash) throws Exception {
		AsymDecryptPub cipher = new AsymDecryptPub();
		PublicKey pKey = cipher
				.getPublic(Paths.get("").toAbsolutePath() + System.getProperty("file.separator") + filePubKeyName);
		try {
			return cipher.decryptText(encryptedHash, pKey);
		} catch (Exception e) {
			return "false";
		}
	}

	// This method allows to sign a document
	public String createSignature(int userId, String doc) throws Exception {
		String hash = generateHash(doc);
		String cipherHash = encryptHash("keys\\user" + userId + "\\user" + userId + "PrivateKey", hash);

		return cipherHash;
	}

	// This method validates the signature of a particular document
	public boolean validateSignature(int userId, String documentInfo, String encryptedHash) throws Exception {
		String decryptedHash = decryptHash("keys\\user" + userId + "\\user" + userId + "PublicKey", encryptedHash);
		String messageToHash = generateHash(documentInfo);

		return messageToHash.equals(decryptedHash);
	}
}
