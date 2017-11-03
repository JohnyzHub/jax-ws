package com.ws.soap.rpc.service;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebParam.Mode;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;
import javax.jws.soap.SOAPBinding.Use;

@WebService(portName = "CreditCardValidator", serviceName = "ValidatorService")
@SOAPBinding(style = Style.RPC, use = Use.LITERAL)
public class CardValidator {

	@WebResult(name = "IsValid")
	@WebMethod(operationName = "ValidateCreditCard")
	public boolean validate(@WebParam(name = "Credit_Card", mode = Mode.IN) CreditCard creditCard) {
		String cardNbr = creditCard.getNumber();
		int cardNumber = Integer.parseInt(cardNbr);
		if (cardNumber % 2 == 0) {
			return true;
		}
		return false;
	}

	@WebResult(name = "IsValid")
	@WebMethod(operationName = "ValidateCreditCardNumber")
	public boolean validate(@WebParam(name = "Credit_Card_Number", mode = Mode.IN) String cardNumber) {
		Integer cardNbr = Integer.parseInt(cardNumber);
		if (cardNbr % 2 == 0) {
			return true;
		}
		return false;
	}

	@WebMethod(exclude = true)
	public void validate(long cardNumber) {
	}

}