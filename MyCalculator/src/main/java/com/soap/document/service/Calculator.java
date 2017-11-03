package com.soap.document.service;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;
import javax.jws.soap.SOAPBinding.Use;

@WebService
@SOAPBinding(style=Style.DOCUMENT, use=Use.LITERAL)
public interface Calculator {
	@WebMethod(operationName="addition")
	int add(int a, int b);
	@WebMethod(operationName="substract")
	int substraction(int a, int b);
}
