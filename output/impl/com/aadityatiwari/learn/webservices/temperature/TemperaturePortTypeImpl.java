package com.aadityatiwari.learn.webservices.temperature;

import javax.jws.WebService;
import weblogic.jws.*;

/**
 * TemperaturePortTypeImpl class implements web service endpoint interface TemperaturePortType */

@WebService(
  serviceName="TemperatureService",
  targetNamespace="http://www.xmethods.net/sd/TemperatureService.wsdl",
  endpointInterface="com.aadityatiwari.learn.webservices.temperature.TemperaturePortType")
@WLHttpTransport(contextPath="temp",serviceUri="TemperatureService",portName="TemperaturePort")
public class TemperaturePortTypeImpl implements TemperaturePortType {
 
  public TemperaturePortTypeImpl() {
  
  }

  public float getTemp(java.lang.String zip) 
     
  {
    // TODO replace with your impl here
     return 0;     
  }
}  