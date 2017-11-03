package com.soap.document.service.endpoint;

import javax.xml.ws.Endpoint;

import com.soap.document.service.MyCalculator;

public class CalculatorPublisher {

	public static void main(String[] args) {
		Endpoint.publish("http://localhost:9999/MyCalculator", new MyCalculator());
	}
}
