/**
 * ClientService_TYPE.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.falabella.mdwcorp.common.schema.clientservice;

public class ClientService_TYPE  implements java.io.Serializable {
    private com.falabella.mdwcorp.common.schema.clientservice.Country_TYPE country;

    private com.falabella.mdwcorp.common.schema.clientservice.Commerce_TYPE commerce;

    private com.falabella.mdwcorp.common.schema.clientservice.Channel_TYPE channel;

    private java.lang.String storeId;

    private java.lang.String terminalId;

    private java.util.Date date;

    private org.apache.axis.types.Time hour;

    public ClientService_TYPE() {
    }

    public ClientService_TYPE(
           com.falabella.mdwcorp.common.schema.clientservice.Country_TYPE country,
           com.falabella.mdwcorp.common.schema.clientservice.Commerce_TYPE commerce,
           com.falabella.mdwcorp.common.schema.clientservice.Channel_TYPE channel,
           java.lang.String storeId,
           java.lang.String terminalId,
           java.util.Date date,
           org.apache.axis.types.Time hour) {
           this.country = country;
           this.commerce = commerce;
           this.channel = channel;
           this.storeId = storeId;
           this.terminalId = terminalId;
           this.date = date;
           this.hour = hour;
    }


    /**
     * Gets the country value for this ClientService_TYPE.
     * 
     * @return country
     */
    public com.falabella.mdwcorp.common.schema.clientservice.Country_TYPE getCountry() {
        return country;
    }


    /**
     * Sets the country value for this ClientService_TYPE.
     * 
     * @param country
     */
    public void setCountry(com.falabella.mdwcorp.common.schema.clientservice.Country_TYPE country) {
        this.country = country;
    }


    /**
     * Gets the commerce value for this ClientService_TYPE.
     * 
     * @return commerce
     */
    public com.falabella.mdwcorp.common.schema.clientservice.Commerce_TYPE getCommerce() {
        return commerce;
    }


    /**
     * Sets the commerce value for this ClientService_TYPE.
     * 
     * @param commerce
     */
    public void setCommerce(com.falabella.mdwcorp.common.schema.clientservice.Commerce_TYPE commerce) {
        this.commerce = commerce;
    }


    /**
     * Gets the channel value for this ClientService_TYPE.
     * 
     * @return channel
     */
    public com.falabella.mdwcorp.common.schema.clientservice.Channel_TYPE getChannel() {
        return channel;
    }


    /**
     * Sets the channel value for this ClientService_TYPE.
     * 
     * @param channel
     */
    public void setChannel(com.falabella.mdwcorp.common.schema.clientservice.Channel_TYPE channel) {
        this.channel = channel;
    }


    /**
     * Gets the storeId value for this ClientService_TYPE.
     * 
     * @return storeId
     */
    public java.lang.String getStoreId() {
        return storeId;
    }


    /**
     * Sets the storeId value for this ClientService_TYPE.
     * 
     * @param storeId
     */
    public void setStoreId(java.lang.String storeId) {
        this.storeId = storeId;
    }


    /**
     * Gets the terminalId value for this ClientService_TYPE.
     * 
     * @return terminalId
     */
    public java.lang.String getTerminalId() {
        return terminalId;
    }


    /**
     * Sets the terminalId value for this ClientService_TYPE.
     * 
     * @param terminalId
     */
    public void setTerminalId(java.lang.String terminalId) {
        this.terminalId = terminalId;
    }


    /**
     * Gets the date value for this ClientService_TYPE.
     * 
     * @return date
     */
    public java.util.Date getDate() {
        return date;
    }


    /**
     * Sets the date value for this ClientService_TYPE.
     * 
     * @param date
     */
    public void setDate(java.util.Date date) {
        this.date = date;
    }


    /**
     * Gets the hour value for this ClientService_TYPE.
     * 
     * @return hour
     */
    public org.apache.axis.types.Time getHour() {
        return hour;
    }


    /**
     * Sets the hour value for this ClientService_TYPE.
     * 
     * @param hour
     */
    public void setHour(org.apache.axis.types.Time hour) {
        this.hour = hour;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ClientService_TYPE)) return false;
        ClientService_TYPE other = (ClientService_TYPE) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.country==null && other.getCountry()==null) || 
             (this.country!=null &&
              this.country.equals(other.getCountry()))) &&
            ((this.commerce==null && other.getCommerce()==null) || 
             (this.commerce!=null &&
              this.commerce.equals(other.getCommerce()))) &&
            ((this.channel==null && other.getChannel()==null) || 
             (this.channel!=null &&
              this.channel.equals(other.getChannel()))) &&
            ((this.storeId==null && other.getStoreId()==null) || 
             (this.storeId!=null &&
              this.storeId.equals(other.getStoreId()))) &&
            ((this.terminalId==null && other.getTerminalId()==null) || 
             (this.terminalId!=null &&
              this.terminalId.equals(other.getTerminalId()))) &&
            ((this.date==null && other.getDate()==null) || 
             (this.date!=null &&
              this.date.equals(other.getDate()))) &&
            ((this.hour==null && other.getHour()==null) || 
             (this.hour!=null &&
              this.hour.equals(other.getHour())));
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
        if (getCountry() != null) {
            _hashCode += getCountry().hashCode();
        }
        if (getCommerce() != null) {
            _hashCode += getCommerce().hashCode();
        }
        if (getChannel() != null) {
            _hashCode += getChannel().hashCode();
        }
        if (getStoreId() != null) {
            _hashCode += getStoreId().hashCode();
        }
        if (getTerminalId() != null) {
            _hashCode += getTerminalId().hashCode();
        }
        if (getDate() != null) {
            _hashCode += getDate().hashCode();
        }
        if (getHour() != null) {
            _hashCode += getHour().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ClientService_TYPE.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://mdwcorp.falabella.com/common/schema/clientservice", "ClientService_TYPE"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("country");
        elemField.setXmlName(new javax.xml.namespace.QName("http://mdwcorp.falabella.com/common/schema/clientservice", "country"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://mdwcorp.falabella.com/common/schema/clientservice", "Country_TYPE"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("commerce");
        elemField.setXmlName(new javax.xml.namespace.QName("http://mdwcorp.falabella.com/common/schema/clientservice", "commerce"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://mdwcorp.falabella.com/common/schema/clientservice", "Commerce_TYPE"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("channel");
        elemField.setXmlName(new javax.xml.namespace.QName("http://mdwcorp.falabella.com/common/schema/clientservice", "channel"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://mdwcorp.falabella.com/common/schema/clientservice", "Channel_TYPE"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("storeId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://mdwcorp.falabella.com/common/schema/clientservice", "storeId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("terminalId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://mdwcorp.falabella.com/common/schema/clientservice", "terminalId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("date");
        elemField.setXmlName(new javax.xml.namespace.QName("http://mdwcorp.falabella.com/common/schema/clientservice", "date"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("hour");
        elemField.setXmlName(new javax.xml.namespace.QName("http://mdwcorp.falabella.com/common/schema/clientservice", "hour"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "time"));
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
