/**
 * Fault.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.xmlsoap.schemas.soap.envelope;

public class Fault  extends org.apache.axis.AxisFault  implements java.io.Serializable {
    private java.lang.String faultcode;

    private java.lang.String faultstring;

    private java.lang.String faultactor;

    private java.lang.Object detail;

    public Fault() {
    }

    public Fault(
           java.lang.String faultcode,
           java.lang.String faultstring,
           java.lang.String faultactor,
           java.lang.Object detail) {
        this.faultcode = faultcode;
        this.faultstring = faultstring;
        this.faultactor = faultactor;
        this.detail = detail;
    }


    /**
     * Gets the faultcode value for this Fault.
     * 
     * @return faultcode
     */
    public java.lang.String getFaultcode() {
        return faultcode;
    }


    /**
     * Sets the faultcode value for this Fault.
     * 
     * @param faultcode
     */
    public void setFaultcode(java.lang.String faultcode) {
        this.faultcode = faultcode;
    }


    /**
     * Gets the faultstring value for this Fault.
     * 
     * @return faultstring
     */
    public java.lang.String getFaultstring() {
        return faultstring;
    }


    /**
     * Sets the faultstring value for this Fault.
     * 
     * @param faultstring
     */
    public void setFaultstring(java.lang.String faultstring) {
        this.faultstring = faultstring;
    }


    /**
     * Gets the faultactor value for this Fault.
     * 
     * @return faultactor
     */
    public java.lang.String getFaultactor() {
        return faultactor;
    }


    /**
     * Sets the faultactor value for this Fault.
     * 
     * @param faultactor
     */
    public void setFaultactor(java.lang.String faultactor) {
        this.faultactor = faultactor;
    }


    /**
     * Gets the detail value for this Fault.
     * 
     * @return detail
     */
    public java.lang.Object getDetail() {
        return detail;
    }


    /**
     * Sets the detail value for this Fault.
     * 
     * @param detail
     */
    public void setDetail(java.lang.Object detail) {
        this.detail = detail;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Fault)) return false;
        Fault other = (Fault) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.faultcode==null && other.getFaultcode()==null) || 
             (this.faultcode!=null &&
              this.faultcode.equals(other.getFaultcode()))) &&
            ((this.faultstring==null && other.getFaultstring()==null) || 
             (this.faultstring!=null &&
              this.faultstring.equals(other.getFaultstring()))) &&
            ((this.faultactor==null && other.getFaultactor()==null) || 
             (this.faultactor!=null &&
              this.faultactor.equals(other.getFaultactor()))) &&
            ((this.detail==null && other.getDetail()==null) || 
             (this.detail!=null &&
              this.detail.equals(other.getDetail())));
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
        if (getFaultcode() != null) {
            _hashCode += getFaultcode().hashCode();
        }
        if (getFaultstring() != null) {
            _hashCode += getFaultstring().hashCode();
        }
        if (getFaultactor() != null) {
            _hashCode += getFaultactor().hashCode();
        }
        if (getDetail() != null) {
            _hashCode += getDetail().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Fault.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/envelope/", ">Fault"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("faultcode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "faultcode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("faultstring");
        elemField.setXmlName(new javax.xml.namespace.QName("", "faultstring"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("faultactor");
        elemField.setXmlName(new javax.xml.namespace.QName("", "faultactor"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("detail");
        elemField.setXmlName(new javax.xml.namespace.QName("", "detail"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
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


    /**
     * Writes the exception data to the faultDetails
     */
    public void writeDetails(javax.xml.namespace.QName qname, org.apache.axis.encoding.SerializationContext context) throws java.io.IOException {
        context.serialize(qname, null, this);
    }
}
