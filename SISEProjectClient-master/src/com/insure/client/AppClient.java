package com.insure.client;

import java.util.Scanner;

import javax.xml.ws.BindingProvider;

import com.insure.client.gen.ClaimDataStore;
import com.insure.client.gen.ClaimDataStoreService;
import com.insure.client.gen.ClaimException_Exception;
import com.insure.client.gen.IdUserException_Exception;

public class AppClient {

	private static ClaimDataStore docStorage;

	// This method returns all document parameters as a string
	public static void doc2String(int docid, String name, String type, String timestamp, String documentContent) {
		System.out.println("DocID: " + docid + "; Name: " + name + "; Type: " + type + "; TimeStamp: " + timestamp
				+ ";\nDescription: " + documentContent);
	}

	public static void main(String args[]) throws Exception {

		int userID = -1;

		System.out.println("Project template - client");

		String url = "http://localhost:8090/docstorage";
		ClaimDataStoreService dss = new ClaimDataStoreService();
		docStorage = dss.getClaimDataStorePort();
		((BindingProvider) docStorage).getRequestContext().put(BindingProvider.ENDPOINT_ADDRESS_PROPERTY, url);

		Scanner myObj = new Scanner(System.in); // Create a Scanner object

		// User Login
		boolean erro = true;
		while (erro) {
			System.out.println("Enter a valid user Identification: ");

			try {
				userID = Integer.parseInt(myObj.nextLine()); // Read user input
				docStorage.validateUser(userID);
				erro = false;
			} catch (Exception e) {
				System.out.println("Invalid user Identification!");
			}
//			System.exit(0);  // Finish the JVM
		}

		System.out.println("Welcome to Insure Claim Management!");
		LOOP: while (true) {

			System.out.println("Valide Actions: \n" + "		Action '1': Create a Claim;\n"
					+ "		Action '2': Update a Claim;\n" + "		Action '3': Add a Document to a Claim;\n"
					+ "		Action '4': Delete a Document from a Claim;\n"
					+ "		Action '5': List a Claim Documents;\n" + "		Action '6': Update a Claim's Document;\n"
					+ "		Action '7': Read a Claim Document;\n" + "		Action '8': Try to Tampered a Document;\n"
					+ "		Action 'exit': Finish actions.\n" + "Enter a valide action: ");

			String userAction = myObj.nextLine(); // Read user input

			switch (userAction) {

			case "1": // Create a Claim

				int claim_id;
				try {
					docStorage.isInsured(userID);
					System.out.println("Enter a Claim description: ");
					String claimDescription = myObj.nextLine();
					claim_id = docStorage.createClaim(userID, claimDescription);
					System.out.println("Claim created with the ID no" + claim_id + ".");
				} catch (ClaimException_Exception | IdUserException_Exception e1) {
					System.out.println(e1.getMessage());
				}

				continue;

			case "2": // Update a Claim
				int claimID;
				System.out.println("Enter a Claim ID to update: ");

				try {
					claimID = Integer.parseInt(myObj.nextLine());
				} catch (Exception e) {
					System.out.println("Invalid claim Identification!");
					continue;
				}

				try {
					docStorage.validateClaimId(claimID);
					docStorage.validateInsuredId(userID, claimID, "update this claim.");
					System.out.println("Enter the new Claim description: ");
					String newDescription = myObj.nextLine();
					docStorage.updateClaim(userID, claimID, newDescription);
					System.out.println("Claim no" + claimID + " was successfully updated.");
				} catch (Exception e) {
					System.out.println(e.getMessage());
				}

				continue;

			case "3": // Add a Document to a Claim
				int claimIDadd1;

				System.out.println("Add Document: Enter a Claim ID: ");

				try {
					claimIDadd1 = Integer.parseInt(myObj.nextLine());
				} catch (Exception e) {
					System.out.println("Invalid claim Identification!");
					continue;
				}

				try {
					docStorage.validateClaimId(claimIDadd1);
					docStorage.validateInsuredId(userID, claimIDadd1, "add documents to this claim.");

					System.out.println("Enter the document name: ");
					String documentName = myObj.nextLine();
					docStorage.isEmpty(documentName);

					System.out.println("Enter the document type: ");
					String documentType = myObj.nextLine();
					docStorage.isEmpty(documentType);

					System.out.println("Enter the document content: ");
					String documentContent = myObj.nextLine();
					docStorage.isEmpty(documentContent);

					String encryHash = (new Signature()).createSignature(userID, documentContent);

					int docID = docStorage.addDocument(userID, claimIDadd1, documentName, documentType, documentContent,
							encryHash);
					System.out.println("The Document was added with success (Document no" + docID + ") in the Claim no"
							+ claimIDadd1 + ".");
				} catch (Exception e) {
					System.out.println(e.getMessage());
				}

				continue;

			case "4": // Delete a Document from a Claim

				int claimIDadd2;
				int docID;

				System.out.println("Delete Document: Enter a Claim ID: ");

				try {
					claimIDadd2 = Integer.parseInt(myObj.nextLine());
				} catch (Exception e) {
					System.out.println("Invalid claim Identification!");
					continue;
				}

				try {
					docStorage.validateClaimId(claimIDadd2);
					docStorage.validateInsuredId(userID, claimIDadd2, "delete documents from this claim.");
					System.out.println("Enter the doc ID you want to delete: ");
					try {
						docID = Integer.parseInt(myObj.nextLine());
					} catch (Exception e) {
						System.out.println("Invalid claim Identification!");
						continue;
					}
					docStorage.validateDocId(userID, claimIDadd2, docID);
					docStorage.deleteDocument(userID, claimIDadd2, docID);
					System.out.println("The Document no" + docID + " was successfully deleted from the Claim no"
							+ claimIDadd2 + ".");
				} catch (Exception e) {
					System.out.println(e.getMessage());
				}

				continue;

			case "5": // List a Claim Documents

				int claimIDadd3;
				System.out.println("Enter a Claim ID: ");

				try {
					claimIDadd3 = Integer.parseInt(myObj.nextLine());
				} catch (Exception e) {
					System.out.println("Invalid claim Identification!");
					continue;
				}

				try {
					docStorage.validateClaimId(claimIDadd3);
					docStorage.validateInsuredId(userID, claimIDadd3, "list documents from this claim.");
					System.out.println(docStorage.listDocuments(userID, claimIDadd3));
				} catch (Exception e) {
					System.out.println(e.getMessage());
				}

				continue;

			case "6": // Update a Claim Document

				int claimIDadd4;
				int docID2;
				System.out.println("Update Document: Enter a Claim ID: ");

				try {
					claimIDadd4 = Integer.parseInt(myObj.nextLine());
				} catch (Exception e) {
					System.out.println("Invalid claim Identification!");
					continue;
				}

				try {
					docStorage.validateClaimId(claimIDadd4);
					docStorage.validateInsuredId(userID, claimIDadd4, "update documents from this claim.");
					System.out.println("Enter the doc ID you want to update: ");

					try {
						docID2 = Integer.parseInt(myObj.nextLine());
					} catch (Exception e) {
						System.out.println("Invalid Document Identification!");
						continue;
					}

					docStorage.validateDocId(userID, claimIDadd4, docID2);
					System.out.println("Enter the new document content: ");
					String documentNewContent = myObj.nextLine();
					docStorage.isEmpty(documentNewContent);

					String encryNewHash = (new Signature()).createSignature(userID, documentNewContent);

					docStorage.updateDocument(userID, claimIDadd4, docID2, documentNewContent, encryNewHash);
					System.out.println("The Document no" + docID2 + ", from the Claim no" + claimIDadd4
							+ " was successfully updated.");
				} catch (Exception e) {
					System.out.println(e.getMessage());
				}

				continue;

			case "7": // Read a Claim Document

				int claimIDadd5;
				int docID3;

				System.out.println("Read Document: Enter a Claim ID: ");

				try {
					claimIDadd5 = Integer.parseInt(myObj.nextLine());
				} catch (Exception e) {
					System.out.println("Invalid claim Identification!");
					continue;
				}

				try {
					docStorage.validateClaimId(claimIDadd5);
					docStorage.validateInsuredId(userID, claimIDadd5, "read");
					System.out.println("Enter the document ID you want to read: ");

					try {
						docID3 = Integer.parseInt(myObj.nextLine());
					} catch (Exception e) {
						System.out.println("Invalid Document Identification!");
						continue;
					}

					docStorage.validateDocId(userID, claimIDadd5, docID3);

					Object[] obj = docStorage.readDocument(userID, claimIDadd5, docID3).toArray();
					if ((new Signature()).validateSignature((int) obj[0], (String) obj[4], (String) obj[5])) {
						doc2String(docID3, (String) obj[1], (String) obj[2], (String) obj[3], (String) obj[4]);
					}
				} catch (Exception e) {
					System.out.println(e.getMessage());
				}

				continue;

			case "8": // Try to Tamper a Document

				int claimIDadd6;

				System.out.println("Tamper a Document: Enter a Claim ID: ");

				try {
					claimIDadd6 = Integer.parseInt(myObj.nextLine());
				} catch (Exception e) {
					System.out.println("Invalid claim Identification!");
					continue;
				}

				try {
					docStorage.validateClaimId(claimIDadd6);
					docStorage.validateInsuredId(userID, claimIDadd6, "add documents to this claim.");

					System.out.println("Enter the document name: ");
					String documentNameT = myObj.nextLine();
					docStorage.isEmpty(documentNameT);

					System.out.println("Enter the document type: ");
					String documentTypeT = myObj.nextLine();
					docStorage.isEmpty(documentTypeT);

					System.out.println("Enter the document content: ");
					String documentContentT = myObj.nextLine();
					docStorage.isEmpty(documentContentT);

					String encryHashT = (new Signature()).createSignature(userID, documentContentT);

					System.out.println(
							"To change the document content enter 'C', to change the digital signature enter 'S': ");
					String whatChange = myObj.nextLine();

					if (whatChange.equals("c") | whatChange.equals("C")) {
						System.out.println("Change the content ('" + documentContentT + "'): ");
						String documentContentT2 = myObj.nextLine();
						docStorage.isEmpty(documentContentT2);
						docStorage.addDocument(userID, claimIDadd6, documentNameT, documentTypeT, documentContentT2,
								encryHashT);
					} else if (whatChange.equals("s") | whatChange.equals("S")) {
						System.out.println("Change the signature ('" + encryHashT + "'): ");
						String encryHashT2 = myObj.nextLine();
						docStorage.isEmpty(encryHashT2);
						docStorage.addDocument(userID, claimIDadd6, documentNameT, documentTypeT, documentContentT,
								encryHashT2);
					} else {
						System.out.println("Wrong value!");
						continue;
					}

				} catch (Exception e) {
					System.out.println(e.getMessage());
				}

				continue;

			case "exit": // Finish actions
				break LOOP;

			default:
				System.out.println("Invalid action!");
			}
		}
	}

}
