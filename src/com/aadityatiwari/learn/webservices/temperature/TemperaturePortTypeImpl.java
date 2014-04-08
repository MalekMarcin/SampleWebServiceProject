package com.aadityatiwari.learn.webservices.temperature;

import javax.jws.WebService;

import weblogic.jws.WLHttpTransport;


/**
 * TemperaturePortTypeImpl class implements web service endpoint interface TemperaturePortType */
@WebService(serviceName = "TemperatureService",
            targetNamespace = "http://www.xmethods.net/sd/TemperatureService.wsdl",
            endpointInterface =
            "com.aadityatiwari.learn.webservices.temperature.TemperaturePortType")
public class TemperaturePortTypeImpl implements TemperaturePortType {

    public TemperaturePortTypeImpl() {

    }

    public float getTemp(java.lang.String zip) {
        return 1.234f;
    }
}
