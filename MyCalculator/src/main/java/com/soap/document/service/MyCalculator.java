package com.soap.document.service;

import javax.jws.WebService;

@WebService(endpointInterface="com.soap.document.service.Calculator")
public class MyCalculator implements Calculator {

	@Override
	public int add(int a, int b) {
		if (a>-1 && b>-1) {
			return a+b;
		}
		return 0;
	}

	@Override
	public int substraction(int a, int b) {
		if (a > b) {
			return a-b;
		} else if (a < b) {
			return b-a;
		}
		return 0;
	}

}
