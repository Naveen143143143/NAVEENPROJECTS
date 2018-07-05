package com.acc.rpc;

import javax.jws.WebService;

@WebService(endpointInterface="com.acc.rpc.Naveen")
public class Raju implements Naveen{

	@Override
	public String getHelloWorldAsString(String name) {
		// TODO Auto-generated method stub
		return "Hello" +name;
	}

}
