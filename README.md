           					SOAP WEBSERVICES

	
	      Jax-ws: Defines a set of API and annotations that allow to build and consume webservices with java.

                Package				              Description
              ______________________		_______________________________

              javax.xml.ws              This package contains the core JAX-WS API
              javax.xml.ws.http         Defines API specific to xml/http binding.
              javax.xml.ws.soap         Defines API specific to soap/http binding.
              Javax.xml.ws.handler      Defines API for message handlers.

              Javax.jws                 Contains java to WSDL mapping annotations.
              Javax.jws.soap            API to specify mapping of webservice onto 
                                                      the SOAP message protocol.

        WSDL document is the contract between the consumer and the service.
        Writing WSDL to generate java files is called contract first or top-down approach.
        Metro is the open source reference implementation of  java webservices specification.

        Webservices annotations can be overridden by webservices.xml deployment descriptor.

        @WebService
        @SOAPBinding:  
            Style:  Document – Default
                    RPC
            use:    Literal – Default
                    Encoded
        @WebMethod
        @WebParam
        @WebResult
        @WebFault – For defining custom exception
        @WebServiceRef – Injects to get a reference 
            to the SOAP webservice client proxy.
            (Use @Produces along with @WebServiceRef annotation,
            so can use @Inject directly)
          Eg: 
            @Produces @WebServiceRef
            CardValidatorService service;
          Ref: pg: 482 in BJEE7


        *WebServiceContext – access the environment runtime info

        WEB-INF/webservices.xml – descriptor file Overrides the annotations

