package com.acc.document;

import javax.xml.ws.Endpoint;

public class CollegeService {
	public static void main(String args[]) {
		Endpoint.publish("http://localhost:6676/ws/hello",new Branch());
	
	}
}
