/**
 * DomesticAirlineLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.example.client;

public class DomesticAirlineLocator extends org.apache.axis.client.Service implements com.example.client.DomesticAirline {

/**
 * <a href="http://www.webxml.com.cn/" target="_blank">WebXml.com.cn</a>
 * <strong>国内飞机航班时刻表 WEB 服务</strong>提供：通过出发城市和到达城市查询飞机航班、出发和到达时间、飞行周期、航空公司、机型等信息。国内飞机航班时刻表
 * WEB 服务提供的飞机航班时刻表数据仅供参考，如有异议请以当地飞机场提供的讯息为准。</br>此国内飞机航班时刻表Web Services请不要用于任何商业目的，若有需要请<a
 * href="http://www.webxml.com.cn/zh_cn/contact_us.aspx" target="_blank">联系我们</a>，欢迎技术交流。
 * QQ：8409035<br /><strong>使用本站 WEB 服务请注明或链接本站：http://www.webxml.com.cn/
 * 感谢大家的支持</strong>！<br /><br />&nbsp;
 */

    public DomesticAirlineLocator() {
    }


    public DomesticAirlineLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public DomesticAirlineLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for DomesticAirlineSoap12
    private java.lang.String DomesticAirlineSoap12_address = "http://ws.webxml.com.cn/webservices/DomesticAirline.asmx";

    public java.lang.String getDomesticAirlineSoap12Address() {
        return DomesticAirlineSoap12_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String DomesticAirlineSoap12WSDDServiceName = "DomesticAirlineSoap12";

    public java.lang.String getDomesticAirlineSoap12WSDDServiceName() {
        return DomesticAirlineSoap12WSDDServiceName;
    }

    public void setDomesticAirlineSoap12WSDDServiceName(java.lang.String name) {
        DomesticAirlineSoap12WSDDServiceName = name;
    }

    public com.example.client.DomesticAirlineSoap_PortType getDomesticAirlineSoap12() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(DomesticAirlineSoap12_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getDomesticAirlineSoap12(endpoint);
    }

    public com.example.client.DomesticAirlineSoap_PortType getDomesticAirlineSoap12(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            com.example.client.DomesticAirlineSoap12Stub _stub = new com.example.client.DomesticAirlineSoap12Stub(portAddress, this);
            _stub.setPortName(getDomesticAirlineSoap12WSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setDomesticAirlineSoap12EndpointAddress(java.lang.String address) {
        DomesticAirlineSoap12_address = address;
    }


    // Use to get a proxy class for DomesticAirlineSoap
    private java.lang.String DomesticAirlineSoap_address = "http://ws.webxml.com.cn/webservices/DomesticAirline.asmx";

    public java.lang.String getDomesticAirlineSoapAddress() {
        return DomesticAirlineSoap_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String DomesticAirlineSoapWSDDServiceName = "DomesticAirlineSoap";

    public java.lang.String getDomesticAirlineSoapWSDDServiceName() {
        return DomesticAirlineSoapWSDDServiceName;
    }

    public void setDomesticAirlineSoapWSDDServiceName(java.lang.String name) {
        DomesticAirlineSoapWSDDServiceName = name;
    }

    public com.example.client.DomesticAirlineSoap_PortType getDomesticAirlineSoap() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(DomesticAirlineSoap_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getDomesticAirlineSoap(endpoint);
    }

    public com.example.client.DomesticAirlineSoap_PortType getDomesticAirlineSoap(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            com.example.client.DomesticAirlineSoap_BindingStub _stub = new com.example.client.DomesticAirlineSoap_BindingStub(portAddress, this);
            _stub.setPortName(getDomesticAirlineSoapWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setDomesticAirlineSoapEndpointAddress(java.lang.String address) {
        DomesticAirlineSoap_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     * This service has multiple ports for a given interface;
     * the proxy implementation returned may be indeterminate.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (com.example.client.DomesticAirlineSoap_PortType.class.isAssignableFrom(serviceEndpointInterface)) {
                com.example.client.DomesticAirlineSoap12Stub _stub = new com.example.client.DomesticAirlineSoap12Stub(new java.net.URL(DomesticAirlineSoap12_address), this);
                _stub.setPortName(getDomesticAirlineSoap12WSDDServiceName());
                return _stub;
            }
            if (com.example.client.DomesticAirlineSoap_PortType.class.isAssignableFrom(serviceEndpointInterface)) {
                com.example.client.DomesticAirlineSoap_BindingStub _stub = new com.example.client.DomesticAirlineSoap_BindingStub(new java.net.URL(DomesticAirlineSoap_address), this);
                _stub.setPortName(getDomesticAirlineSoapWSDDServiceName());
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
        if ("DomesticAirlineSoap12".equals(inputPortName)) {
            return getDomesticAirlineSoap12();
        }
        else if ("DomesticAirlineSoap".equals(inputPortName)) {
            return getDomesticAirlineSoap();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://WebXml.com.cn/", "DomesticAirline");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://WebXml.com.cn/", "DomesticAirlineSoap12"));
            ports.add(new javax.xml.namespace.QName("http://WebXml.com.cn/", "DomesticAirlineSoap"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("DomesticAirlineSoap12".equals(portName)) {
            setDomesticAirlineSoap12EndpointAddress(address);
        }
        else 
if ("DomesticAirlineSoap".equals(portName)) {
            setDomesticAirlineSoapEndpointAddress(address);
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
