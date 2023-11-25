/**
 * GetDomesticAirlinesTime.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.example.client;

public class GetDomesticAirlinesTime  implements java.io.Serializable {
    private java.lang.String startCity;

    private java.lang.String lastCity;

    private java.lang.String theDate;

    private java.lang.String userID;

    public GetDomesticAirlinesTime() {
    }

    public GetDomesticAirlinesTime(
           java.lang.String startCity,
           java.lang.String lastCity,
           java.lang.String theDate,
           java.lang.String userID) {
           this.startCity = startCity;
           this.lastCity = lastCity;
           this.theDate = theDate;
           this.userID = userID;
    }


    /**
     * Gets the startCity value for this GetDomesticAirlinesTime.
     * 
     * @return startCity
     */
    public java.lang.String getStartCity() {
        return startCity;
    }


    /**
     * Sets the startCity value for this GetDomesticAirlinesTime.
     * 
     * @param startCity
     */
    public void setStartCity(java.lang.String startCity) {
        this.startCity = startCity;
    }


    /**
     * Gets the lastCity value for this GetDomesticAirlinesTime.
     * 
     * @return lastCity
     */
    public java.lang.String getLastCity() {
        return lastCity;
    }


    /**
     * Sets the lastCity value for this GetDomesticAirlinesTime.
     * 
     * @param lastCity
     */
    public void setLastCity(java.lang.String lastCity) {
        this.lastCity = lastCity;
    }


    /**
     * Gets the theDate value for this GetDomesticAirlinesTime.
     * 
     * @return theDate
     */
    public java.lang.String getTheDate() {
        return theDate;
    }


    /**
     * Sets the theDate value for this GetDomesticAirlinesTime.
     * 
     * @param theDate
     */
    public void setTheDate(java.lang.String theDate) {
        this.theDate = theDate;
    }


    /**
     * Gets the userID value for this GetDomesticAirlinesTime.
     * 
     * @return userID
     */
    public java.lang.String getUserID() {
        return userID;
    }


    /**
     * Sets the userID value for this GetDomesticAirlinesTime.
     * 
     * @param userID
     */
    public void setUserID(java.lang.String userID) {
        this.userID = userID;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetDomesticAirlinesTime)) return false;
        GetDomesticAirlinesTime other = (GetDomesticAirlinesTime) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.startCity==null && other.getStartCity()==null) || 
             (this.startCity!=null &&
              this.startCity.equals(other.getStartCity()))) &&
            ((this.lastCity==null && other.getLastCity()==null) || 
             (this.lastCity!=null &&
              this.lastCity.equals(other.getLastCity()))) &&
            ((this.theDate==null && other.getTheDate()==null) || 
             (this.theDate!=null &&
              this.theDate.equals(other.getTheDate()))) &&
            ((this.userID==null && other.getUserID()==null) || 
             (this.userID!=null &&
              this.userID.equals(other.getUserID())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getStartCity() != null) {
            _hashCode += getStartCity().hashCode();
        }
        if (getLastCity() != null) {
            _hashCode += getLastCity().hashCode();
        }
        if (getTheDate() != null) {
            _hashCode += getTheDate().hashCode();
        }
        if (getUserID() != null) {
            _hashCode += getUserID().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetDomesticAirlinesTime.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://WebXml.com.cn/", ">getDomesticAirlinesTime"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("startCity");
        elemField.setXmlName(new javax.xml.namespace.QName("http://WebXml.com.cn/", "startCity"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lastCity");
        elemField.setXmlName(new javax.xml.namespace.QName("http://WebXml.com.cn/", "lastCity"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("theDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://WebXml.com.cn/", "theDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://WebXml.com.cn/", "userID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
