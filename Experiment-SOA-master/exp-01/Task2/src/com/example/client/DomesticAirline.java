/**
 * DomesticAirline.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.example.client;

public interface DomesticAirline extends javax.xml.rpc.Service {

/**
 * <a href="http://www.webxml.com.cn/" target="_blank">WebXml.com.cn</a>
 * <strong>国内飞机航班时刻表 WEB 服务</strong>提供：通过出发城市和到达城市查询飞机航班、出发和到达时间、飞行周期、航空公司、机型等信息。国内飞机航班时刻表
 * WEB 服务提供的飞机航班时刻表数据仅供参考，如有异议请以当地飞机场提供的讯息为准。</br>此国内飞机航班时刻表Web Services请不要用于任何商业目的，若有需要请<a
 * href="http://www.webxml.com.cn/zh_cn/contact_us.aspx" target="_blank">联系我们</a>，欢迎技术交流。
 * QQ：8409035<br /><strong>使用本站 WEB 服务请注明或链接本站：http://www.webxml.com.cn/
 * 感谢大家的支持</strong>！<br /><br />&nbsp;
 */
    public java.lang.String getDomesticAirlineSoap12Address();

    public com.example.client.DomesticAirlineSoap_PortType getDomesticAirlineSoap12() throws javax.xml.rpc.ServiceException;

    public com.example.client.DomesticAirlineSoap_PortType getDomesticAirlineSoap12(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
    public java.lang.String getDomesticAirlineSoapAddress();

    public com.example.client.DomesticAirlineSoap_PortType getDomesticAirlineSoap() throws javax.xml.rpc.ServiceException;

    public com.example.client.DomesticAirlineSoap_PortType getDomesticAirlineSoap(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
