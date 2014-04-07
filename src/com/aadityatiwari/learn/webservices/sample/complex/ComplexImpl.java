package com.aadityatiwari.learn.webservices.sample.complex;
// Import the standard JWS annotation interfaces
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;

@WebService(name="ComplexImplPortType", serviceName="ComplexImplService")
/**
 * This JWS file forms the basis of a WebLogic Web Service.  The Web Services
 * has two public operations:
 *
 *  - echoInt(int)
 *  - echoComplexType(BasicStruct)
 *
 * The Web Service is defined as a "document-literal" service, which means
 * that the SOAP messages have a single part referencing an XML Schema element
 * that defines the entire body.
 */
public class ComplexImpl {
    // Standard JWS annotation that specifies that the method should be exposed
    // as a public operation.  Because the annotation does not include the
    // member-value "operationName", the public name of the operation is the
    // same as the method name: echoInt.
    //
    // The WebResult annotation specifies that the name of the result of the
    // operation in the generated WSDL is "IntegerOutput", rather than the
    // default name "return".   The WebParam annotation specifies that the input
    // parameter name in the WSDL file is "IntegerInput" rather than the Java
    // name of the parameter, "input".

    @WebMethod()
    @WebResult(name = "IntegerOutput",
               targetNamespace = "http://example.org/complex")
    public int echoInt(@WebParam(name = "IntegerInput",
                                 targetNamespace = "http://example.org/complex")
        int input) {
        System.out.println("echoInt '" + input + "' to you too!");
        return input;
    }
    // Standard JWS annotation to expose method "echoStruct" as a public operation
    // called "echoComplexType"
    // The WebResult annotation specifies that the name of the result of the
    // operation in the generated WSDL is "EchoStructReturnMessage",
    // rather than the default name "return".

    @WebMethod(operationName = "echoComplexType")
    @WebResult(name = "EchoStructReturnMessage",
               targetNamespace = "http://example.org/complex")
    public BasicStruct echoStruct(BasicStruct struct) {
        System.out.println("echoComplexType called");
        return struct;
    }
}
