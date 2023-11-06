<?xml version="1.0" encoding="utf-8"?>
<wsdl:definitions xmlns:soap="http://schemas.xmlsoap.org/wsdl/soap/" xmlns:tm="http://microsoft.com/wsdl/mime/textMatching/" xmlns:soapenc="http://schemas.xmlsoap.org/soap/encoding/" xmlns:mime="http://schemas.xmlsoap.org/wsdl/mime/" xmlns:tns="http://WebXml.com.cn/" xmlns:s="http://www.w3.org/2001/XMLSchema" xmlns:soap12="http://schemas.xmlsoap.org/wsdl/soap12/" xmlns:http="http://schemas.xmlsoap.org/wsdl/http/" targetNamespace="http://WebXml.com.cn/" xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/">
  <wsdl:documentation xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/">&lt;a href="http://www.webxml.com.cn/" target="_blank"&gt;WebXml.com.cn&lt;/a&gt; &lt;strong&gt;国内飞机航班时刻表 WEB 服务&lt;/strong&gt;提供：通过出发城市和到达城市查询飞机航班、出发和到达时间、飞行周期、航空公司、机型等信息。国内飞机航班时刻表 WEB 服务提供的飞机航班时刻表数据仅供参考，如有异议请以当地飞机场提供的讯息为准。&lt;/br&gt;此国内飞机航班时刻表Web Services请不要用于任何商业目的，若有需要请&lt;a href="http://www.webxml.com.cn/zh_cn/contact_us.aspx" target="_blank"&gt;联系我们&lt;/a&gt;，欢迎技术交流。 QQ：8409035&lt;br /&gt;&lt;strong&gt;使用本站 WEB 服务请注明或链接本站：http://www.webxml.com.cn/ 感谢大家的支持&lt;/strong&gt;！&lt;br /&gt;&lt;br /&gt;&amp;nbsp;</wsdl:documentation>
  <wsdl:types>
    <s:schema elementFormDefault="qualified" targetNamespace="http://WebXml.com.cn/">
      <s:element name="getDomesticCity">
        <s:complexType />
      </s:element>
      <s:element name="getDomesticCityResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="getDomesticCityResult">
              <s:complexType>
                <s:sequence>
                  <s:element ref="s:schema" />
                  <s:any />
                </s:sequence>
              </s:complexType>
            </s:element>
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="getDomesticAirlinesTime">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="startCity" type="s:string" />
            <s:element minOccurs="0" maxOccurs="1" name="lastCity" type="s:string" />
            <s:element minOccurs="0" maxOccurs="1" name="theDate" type="s:string" />
            <s:element minOccurs="0" maxOccurs="1" name="userID" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="getDomesticAirlinesTimeResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="getDomesticAirlinesTimeResult">
              <s:complexType>
                <s:sequence>
                  <s:element ref="s:schema" />
                  <s:any />
                </s:sequence>
              </s:complexType>
            </s:element>
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="DataSet" nillable="true">
        <s:complexType>
          <s:sequence>
            <s:element ref="s:schema" />
            <s:any />
          </s:sequence>
        </s:complexType>
      </s:element>
    </s:schema>
  </wsdl:types>
  <wsdl:message name="getDomesticCitySoapIn">
    <wsdl:part name="parameters" element="tns:getDomesticCity" />
  </wsdl:message>
  <wsdl:message name="getDomesticCitySoapOut">
    <wsdl:part name="parameters" element="tns:getDomesticCityResponse" />
  </wsdl:message>
  <wsdl:message name="getDomesticAirlinesTimeSoapIn">
    <wsdl:part name="parameters" element="tns:getDomesticAirlinesTime" />
  </wsdl:message>
  <wsdl:message name="getDomesticAirlinesTimeSoapOut">
    <wsdl:part name="parameters" element="tns:getDomesticAirlinesTimeResponse" />
  </wsdl:message>
  <wsdl:message name="getDomesticCityHttpGetIn" />
  <wsdl:message name="getDomesticCityHttpGetOut">
    <wsdl:part name="Body" element="tns:DataSet" />
  </wsdl:message>
  <wsdl:message name="getDomesticAirlinesTimeHttpGetIn">
    <wsdl:part name="startCity" type="s:string" />
    <wsdl:part name="lastCity" type="s:string" />
    <wsdl:part name="theDate" type="s:string" />
    <wsdl:part name="userID" type="s:string" />
  </wsdl:message>
  <wsdl:message name="getDomesticAirlinesTimeHttpGetOut">
    <wsdl:part name="Body" element="tns:DataSet" />
  </wsdl:message>
  <wsdl:message name="getDomesticCityHttpPostIn" />
  <wsdl:message name="getDomesticCityHttpPostOut">
    <wsdl:part name="Body" element="tns:DataSet" />
  </wsdl:message>
  <wsdl:message name="getDomesticAirlinesTimeHttpPostIn">
    <wsdl:part name="startCity" type="s:string" />
    <wsdl:part name="lastCity" type="s:string" />
    <wsdl:part name="theDate" type="s:string" />
    <wsdl:part name="userID" type="s:string" />
  </wsdl:message>
  <wsdl:message name="getDomesticAirlinesTimeHttpPostOut">
    <wsdl:part name="Body" element="tns:DataSet" />
  </wsdl:message>
  <wsdl:portType name="DomesticAirlineSoap">
    <wsdl:operation name="getDomesticCity">
      <wsdl:documentation xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/">&lt;br /&gt;&lt;h3&gt;获得这国内飞机航班时刻表Web Services支持的全部城市中英文名称和缩写 DataSet&lt;/h3&gt;&lt;p&gt;输入参数：无；返回数据：结构为 Item(enCityName)城市英文名称、Item(cnCityName)城市中文名称、Item(Abbreviation)缩写，按城市英文名称升序排列&lt;/p&gt;&lt;br /&gt;</wsdl:documentation>
      <wsdl:input message="tns:getDomesticCitySoapIn" />
      <wsdl:output message="tns:getDomesticCitySoapOut" />
    </wsdl:operation>
    <wsdl:operation name="getDomesticAirlinesTime">
      <wsdl:documentation xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/">&lt;br /&gt;&lt;h3&gt;获得航班时刻表 DataSet&lt;/h3&gt;&lt;p&gt;输入参数：startCity = 出发城市（中文城市名称或缩写、空则默认：上海）；lastCity = 抵达城市（中文城市名称或缩写、空则默认：北京）；theDate = 出发日期（String 格式：yyyy-MM-dd，如：2007-07-02，空则默认当天）；userID = 商业用户ID（免费用户不需要）&lt;br /&gt;返回数据：DataSet，Table(0)结构为 Item(Company)航空公司、Item(AirlineCode)航班号、Item(StartDrome)出发机场、Item(ArriveDrome)到达机场、Item(StartTime)出发时间、Item(ArriveTime)到达时间、Item(Mode)机型、Item(AirlineStop)经停、Item(Week)飞行周期（星期）&lt;/p&gt;&lt;br /&gt;</wsdl:documentation>
      <wsdl:input message="tns:getDomesticAirlinesTimeSoapIn" />
      <wsdl:output message="tns:getDomesticAirlinesTimeSoapOut" />
    </wsdl:operation>
  </wsdl:portType>
  <wsdl:portType name="DomesticAirlineHttpGet">
    <wsdl:operation name="getDomesticCity">
      <wsdl:documentation xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/">&lt;br /&gt;&lt;h3&gt;获得这国内飞机航班时刻表Web Services支持的全部城市中英文名称和缩写 DataSet&lt;/h3&gt;&lt;p&gt;输入参数：无；返回数据：结构为 Item(enCityName)城市英文名称、Item(cnCityName)城市中文名称、Item(Abbreviation)缩写，按城市英文名称升序排列&lt;/p&gt;&lt;br /&gt;</wsdl:documentation>
      <wsdl:input message="tns:getDomesticCityHttpGetIn" />
      <wsdl:output message="tns:getDomesticCityHttpGetOut" />
    </wsdl:operation>
    <wsdl:operation name="getDomesticAirlinesTime">
      <wsdl:documentation xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/">&lt;br /&gt;&lt;h3&gt;获得航班时刻表 DataSet&lt;/h3&gt;&lt;p&gt;输入参数：startCity = 出发城市（中文城市名称或缩写、空则默认：上海）；lastCity = 抵达城市（中文城市名称或缩写、空则默认：北京）；theDate = 出发日期（String 格式：yyyy-MM-dd，如：2007-07-02，空则默认当天）；userID = 商业用户ID（免费用户不需要）&lt;br /&gt;返回数据：DataSet，Table(0)结构为 Item(Company)航空公司、Item(AirlineCode)航班号、Item(StartDrome)出发机场、Item(ArriveDrome)到达机场、Item(StartTime)出发时间、Item(ArriveTime)到达时间、Item(Mode)机型、Item(AirlineStop)经停、Item(Week)飞行周期（星期）&lt;/p&gt;&lt;br /&gt;</wsdl:documentation>
      <wsdl:input message="tns:getDomesticAirlinesTimeHttpGetIn" />
      <wsdl:output message="tns:getDomesticAirlinesTimeHttpGetOut" />
    </wsdl:operation>
  </wsdl:portType>
  <wsdl:portType name="DomesticAirlineHttpPost">
    <wsdl:operation name="getDomesticCity">
      <wsdl:documentation xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/">&lt;br /&gt;&lt;h3&gt;获得这国内飞机航班时刻表Web Services支持的全部城市中英文名称和缩写 DataSet&lt;/h3&gt;&lt;p&gt;输入参数：无；返回数据：结构为 Item(enCityName)城市英文名称、Item(cnCityName)城市中文名称、Item(Abbreviation)缩写，按城市英文名称升序排列&lt;/p&gt;&lt;br /&gt;</wsdl:documentation>
      <wsdl:input message="tns:getDomesticCityHttpPostIn" />
      <wsdl:output message="tns:getDomesticCityHttpPostOut" />
    </wsdl:operation>
    <wsdl:operation name="getDomesticAirlinesTime">
      <wsdl:documentation xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/">&lt;br /&gt;&lt;h3&gt;获得航班时刻表 DataSet&lt;/h3&gt;&lt;p&gt;输入参数：startCity = 出发城市（中文城市名称或缩写、空则默认：上海）；lastCity = 抵达城市（中文城市名称或缩写、空则默认：北京）；theDate = 出发日期（String 格式：yyyy-MM-dd，如：2007-07-02，空则默认当天）；userID = 商业用户ID（免费用户不需要）&lt;br /&gt;返回数据：DataSet，Table(0)结构为 Item(Company)航空公司、Item(AirlineCode)航班号、Item(StartDrome)出发机场、Item(ArriveDrome)到达机场、Item(StartTime)出发时间、Item(ArriveTime)到达时间、Item(Mode)机型、Item(AirlineStop)经停、Item(Week)飞行周期（星期）&lt;/p&gt;&lt;br /&gt;</wsdl:documentation>
      <wsdl:input message="tns:getDomesticAirlinesTimeHttpPostIn" />
      <wsdl:output message="tns:getDomesticAirlinesTimeHttpPostOut" />
    </wsdl:operation>
  </wsdl:portType>
  <wsdl:binding name="DomesticAirlineSoap" type="tns:DomesticAirlineSoap">
    <soap:binding transport="http://schemas.xmlsoap.org/soap/http" />
    <wsdl:operation name="getDomesticCity">
      <soap:operation soapAction="http://WebXml.com.cn/getDomesticCity" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="getDomesticAirlinesTime">
      <soap:operation soapAction="http://WebXml.com.cn/getDomesticAirlinesTime" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
  </wsdl:binding>
  <wsdl:binding name="DomesticAirlineSoap12" type="tns:DomesticAirlineSoap">
    <soap12:binding transport="http://schemas.xmlsoap.org/soap/http" />
    <wsdl:operation name="getDomesticCity">
      <soap12:operation soapAction="http://WebXml.com.cn/getDomesticCity" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="getDomesticAirlinesTime">
      <soap12:operation soapAction="http://WebXml.com.cn/getDomesticAirlinesTime" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
  </wsdl:binding>
  <wsdl:binding name="DomesticAirlineHttpGet" type="tns:DomesticAirlineHttpGet">
    <http:binding verb="GET" />
    <wsdl:operation name="getDomesticCity">
      <http:operation location="/getDomesticCity" />
      <wsdl:input>
        <http:urlEncoded />
      </wsdl:input>
      <wsdl:output>
        <mime:mimeXml part="Body" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="getDomesticAirlinesTime">
      <http:operation location="/getDomesticAirlinesTime" />
      <wsdl:input>
        <http:urlEncoded />
      </wsdl:input>
      <wsdl:output>
        <mime:mimeXml part="Body" />
      </wsdl:output>
    </wsdl:operation>
  </wsdl:binding>
  <wsdl:binding name="DomesticAirlineHttpPost" type="tns:DomesticAirlineHttpPost">
    <http:binding verb="POST" />
    <wsdl:operation name="getDomesticCity">
      <http:operation location="/getDomesticCity" />
      <wsdl:input>
        <mime:content type="application/x-www-form-urlencoded" />
      </wsdl:input>
      <wsdl:output>
        <mime:mimeXml part="Body" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="getDomesticAirlinesTime">
      <http:operation location="/getDomesticAirlinesTime" />
      <wsdl:input>
        <mime:content type="application/x-www-form-urlencoded" />
      </wsdl:input>
      <wsdl:output>
        <mime:mimeXml part="Body" />
      </wsdl:output>
    </wsdl:operation>
  </wsdl:binding>
  <wsdl:service name="DomesticAirline">
    <wsdl:documentation xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/">&lt;a href="http://www.webxml.com.cn/" target="_blank"&gt;WebXml.com.cn&lt;/a&gt; &lt;strong&gt;国内飞机航班时刻表 WEB 服务&lt;/strong&gt;提供：通过出发城市和到达城市查询飞机航班、出发和到达时间、飞行周期、航空公司、机型等信息。国内飞机航班时刻表 WEB 服务提供的飞机航班时刻表数据仅供参考，如有异议请以当地飞机场提供的讯息为准。&lt;/br&gt;此国内飞机航班时刻表Web Services请不要用于任何商业目的，若有需要请&lt;a href="http://www.webxml.com.cn/zh_cn/contact_us.aspx" target="_blank"&gt;联系我们&lt;/a&gt;，欢迎技术交流。 QQ：8409035&lt;br /&gt;&lt;strong&gt;使用本站 WEB 服务请注明或链接本站：http://www.webxml.com.cn/ 感谢大家的支持&lt;/strong&gt;！&lt;br /&gt;&lt;br /&gt;&amp;nbsp;</wsdl:documentation>
    <wsdl:port name="DomesticAirlineSoap" binding="tns:DomesticAirlineSoap">
      <soap:address location="http://ws.webxml.com.cn/webservices/DomesticAirline.asmx" />
    </wsdl:port>
    <wsdl:port name="DomesticAirlineSoap12" binding="tns:DomesticAirlineSoap12">
      <soap12:address location="http://ws.webxml.com.cn/webservices/DomesticAirline.asmx" />
    </wsdl:port>
    <wsdl:port name="DomesticAirlineHttpGet" binding="tns:DomesticAirlineHttpGet">
      <http:address location="http://ws.webxml.com.cn/webservices/DomesticAirline.asmx" />
    </wsdl:port>
    <wsdl:port name="DomesticAirlineHttpPost" binding="tns:DomesticAirlineHttpPost">
      <http:address location="http://ws.webxml.com.cn/webservices/DomesticAirline.asmx" />
    </wsdl:port>
  </wsdl:service>
</wsdl:definitions>