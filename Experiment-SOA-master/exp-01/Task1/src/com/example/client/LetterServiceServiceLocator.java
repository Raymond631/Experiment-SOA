/**
 * LetterServiceServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.example.client;

public class LetterServiceServiceLocator extends org.apache.axis.client.Service implements com.example.client.LetterServiceService {

    public LetterServiceServiceLocator() {
    }


    public LetterServiceServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public LetterServiceServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for LetterService
    private java.lang.String LetterService_address = "http://localhost:8080/services/LetterService";

    public java.lang.String getLetterServiceAddress() {
        return LetterService_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String LetterServiceWSDDServiceName = "LetterService";

    public java.lang.String getLetterServiceWSDDServiceName() {
        return LetterServiceWSDDServiceName;
    }

    public void setLetterServiceWSDDServiceName(java.lang.String name) {
        LetterServiceWSDDServiceName = name;
    }

    public com.example.client.LetterService_PortType getLetterService() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(LetterService_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getLetterService(endpoint);
    }

    public com.example.client.LetterService_PortType getLetterService(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            com.example.client.LetterServiceSoapBindingStub _stub = new com.example.client.LetterServiceSoapBindingStub(portAddress, this);
            _stub.setPortName(getLetterServiceWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setLetterServiceEndpointAddress(java.lang.String address) {
        LetterService_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (com.example.client.LetterService_PortType.class.isAssignableFrom(serviceEndpointInterface)) {
                com.example.client.LetterServiceSoapBindingStub _stub = new com.example.client.LetterServiceSoapBindingStub(new java.net.URL(LetterService_address), this);
                _stub.setPortName(getLetterServiceWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("LetterService".equals(inputPortName)) {
            return getLetterService();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://com.example.service", "LetterServiceService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://com.example.service", "LetterService"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("LetterService".equals(portName)) {
            setLetterServiceEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
