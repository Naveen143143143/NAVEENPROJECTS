package com.acc.rpc;


import javax.xml.ws.Endpoint;

public class Service1 {
	public static void main(String args[]) {
		Endpoint.publish("http://localhost:7794/ws/hello",new Raju());
	}

}
