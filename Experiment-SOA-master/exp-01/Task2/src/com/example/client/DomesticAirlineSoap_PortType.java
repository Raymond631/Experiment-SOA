/**
 * DomesticAirlineSoap_PortType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.example.client;

public interface DomesticAirlineSoap_PortType extends java.rmi.Remote {

    /**
     * <br /><h3>获得这国内飞机航班时刻表Web Services支持的全部城市中英文名称和缩写 DataSet</h3><p>输入参数：无；返回数据：结构为
     * Item(enCityName)城市英文名称、Item(cnCityName)城市中文名称、Item(Abbreviation)缩写，按城市英文名称升序排列</p><br
     * />
     */
    public com.example.client.GetDomesticCityResponseGetDomesticCityResult getDomesticCity() throws java.rmi.RemoteException;

    /**
     * <br /><h3>获得航班时刻表 DataSet</h3><p>输入参数：startCity = 出发城市（中文城市名称或缩写、空则默认：上海）；lastCity
     * = 抵达城市（中文城市名称或缩写、空则默认：北京）；theDate = 出发日期（String 格式：yyyy-MM-dd，如：2007-07-02，空则默认当天）；userID
     * = 商业用户ID（免费用户不需要）<br />返回数据：DataSet，Table(0)结构为 Item(Company)航空公司、Item(AirlineCode)航班号、Item(StartDrome)出发机场、Item(ArriveDrome)到达机场、Item(StartTime)出发时间、Item(ArriveTime)到达时间、Item(Mode)机型、Item(AirlineStop)经停、Item(Week)飞行周期（星期）</p><br
     * />
     */
    public com.example.client.GetDomesticAirlinesTimeResponseGetDomesticAirlinesTimeResult getDomesticAirlinesTime(java.lang.String startCity, java.lang.String lastCity, java.lang.String theDate, java.lang.String userID) throws java.rmi.RemoteException;
}
