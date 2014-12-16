package com.soap;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService
public class MySOAPWebService {

	public MySOAPWebService() {
		super();
	}

	@WebMethod
	public String sayHello() {
		return "hello";
	}
}
