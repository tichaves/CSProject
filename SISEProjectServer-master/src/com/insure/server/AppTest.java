package com.insure.server;

import javax.xml.ws.Endpoint;

public class AppTest {

	public static void main(String args[]) throws InterruptedException, ClaimException {
		System.out.println("Project template - server");

		System.out.println("ClaimDataStore Web Service is starting.");

		ClaimDataStore claimDataStore = new ClaimDataStore();
		Endpoint.publish("http://localhost:8090/docstorage", claimDataStore);
	}
}
