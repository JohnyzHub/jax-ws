package com.soap.document.client;

import java.net.MalformedURLException;
import java.net.URL;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;

import com.soap.document.client.ws.Calculator;

public class MyCalculatorClient {

	public static void main(String[] args) {
		URL url = null;
		try {
			url = new URL("http://localhost:9191/MyCalculator?wsdl");
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return;
		}

		QName qName = new QName("http://service.document.soap.com/", "MyCalculatorService");
		Service service = Service.create(url, qName);
		Calculator calculator = service.getPort(Calculator.class);
		System.out.println("2+4=" + calculator.addition(2, 4));
	}
}
