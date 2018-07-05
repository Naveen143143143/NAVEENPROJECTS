package com.acc.document;

import javax.jws.WebService;

@WebService(endpointInterface="com.acc.document.College")
public class Branch implements College{

	@Override
	public String getName(String name) {
		// TODO Auto-generated method stub
		return "Hello" +name;
	}

}
