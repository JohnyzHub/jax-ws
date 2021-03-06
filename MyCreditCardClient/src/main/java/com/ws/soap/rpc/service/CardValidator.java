
package com.ws.soap.rpc.service;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebService(name = "CardValidator", targetNamespace = "http://service.rpc.soap.ws.com/")
@SOAPBinding(style = SOAPBinding.Style.RPC)
@XmlSeeAlso({
    ObjectFactory.class
})
public interface CardValidator {


    /**
     * 
     * @param creditCardNumber
     * @return
     *     returns boolean
     */
    @WebMethod(operationName = "ValidateCreditCardNumber")
    @WebResult(name = "IsValid", partName = "IsValid")
    @Action(input = "http://service.rpc.soap.ws.com/CardValidator/ValidateCreditCardNumberRequest", output = "http://service.rpc.soap.ws.com/CardValidator/ValidateCreditCardNumberResponse")
    public boolean validateCreditCardNumber(
        @WebParam(name = "Credit_Card_Number", partName = "Credit_Card_Number")
        String creditCardNumber);

    /**
     * 
     * @param creditCard
     * @return
     *     returns boolean
     */
    @WebMethod(operationName = "ValidateCreditCard")
    @WebResult(name = "IsValid", partName = "IsValid")
    @Action(input = "http://service.rpc.soap.ws.com/CardValidator/ValidateCreditCardRequest", output = "http://service.rpc.soap.ws.com/CardValidator/ValidateCreditCardResponse")
    public boolean validateCreditCard(
        @WebParam(name = "Credit_Card", partName = "Credit_Card")
        CreditCard creditCard);

}
