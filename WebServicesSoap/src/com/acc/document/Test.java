package com.acc.document;

import java.net.URL;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;



public class Test {
	public static void main(String args[]) throws Exception {
		URL url=new URL("http://localhost:6676/ws/hello?wsdl");
		QName qname=new QName("http://document.acc.com/","BranchService");
		Service service = Service.create(url,qname);  
		College n=service.getPort(College.class);
		System.out.println(n.getName(" Welcome to VRCE "));
	}
}
