package com.insure.server;

import java.sql.Timestamp;

public class Document {
	private int userId;
	private final int docid;
	private String name;
	private String type;
	private String documentContent;
	private Timestamp timestamp;

	public Document(int userId, int docid, String name, String type, String documentContent) {
		this.userId = userId;
		this.docid = docid;
		this.name = name;
		this.type = type;
		this.documentContent = documentContent;
		this.timestamp = new Timestamp(System.currentTimeMillis());
	}

	public int getUserId() {
		return this.userId;
	}

	public String getName() {
		return this.name;
	}

	public String getType() {
		return this.type;
	}

	public String getDocumentContent() {
		return this.documentContent;
	}

	public int getDocid() {
		return this.docid;
	}

	public Timestamp getTimestamp() {
		return this.timestamp;
	}

	public void setDescription(String documentContent) {
		this.documentContent = documentContent;
	}

	// This method returns all document parameters as a string
	public String doc2String() {
		return "DocID: " + this.docid + "; Name: " + this.name + "; Type: " + this.type + "; Description: "
				+ this.documentContent + "; TimeStamp: " + this.timestamp;
	}

	// This method returns the document ID and name
	public String docList() {
		return "DocID: " + this.docid + "; Name: " + this.name;
	}
}
