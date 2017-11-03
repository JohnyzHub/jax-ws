package com.ws.soap.rpc.client;

import com.ws.soap.rpc.service.CardValidator;
import com.ws.soap.rpc.service.CreditCard;
import com.ws.soap.rpc.service.ValidatorService;

public class CardValidatorClient {

	public static void main(String[] args) {

		ValidatorService validatorService = new ValidatorService();
		CardValidator cardValidator  = validatorService.getCreditCardValidator();
		System.out.println("Card - 124: Valid- " + cardValidator.validateCreditCardNumber("124"));
		CreditCard creditCard = new CreditCard();
		creditCard.setNumber("125");
		System.out.println("Card - 125: Valid- " + cardValidator.validateCreditCard(creditCard));
	}
}
