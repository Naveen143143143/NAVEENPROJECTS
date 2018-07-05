package com.acc.rpc;


import java.net.URL;  
import javax.xml.namespace.QName;  
import javax.xml.ws.Service; 

public class Test {
	public static void main(String args[]) throws Exception {
		URL url=new URL("http://localhost:7794/ws/hello?wsdl");
		QName qname=new QName("http://rpc.acc.com/", "RajuService");
		Service service = Service.create(url,qname);  
		Naveen n=service.getPort(Naveen.class);
		System.out.println(n.getHelloWorldAsString("Hello Accentuate Technologies"));
	}
}
