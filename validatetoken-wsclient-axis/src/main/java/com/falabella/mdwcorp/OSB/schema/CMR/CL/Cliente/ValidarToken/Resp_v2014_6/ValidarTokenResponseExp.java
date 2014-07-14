/**
 * ValidarTokenResponseExp.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.falabella.mdwcorp.OSB.schema.CMR.CL.Cliente.ValidarToken.Resp_v2014_6;

public class ValidarTokenResponseExp  implements java.io.Serializable {
    private java.lang.String mensaje;

    private java.lang.String rut;

    private java.lang.String urlRespuesta;

    private java.lang.String codigo;

    public ValidarTokenResponseExp() {
    }

    public ValidarTokenResponseExp(
           java.lang.String mensaje,
           java.lang.String rut,
           java.lang.String urlRespuesta,
           java.lang.String codigo) {
           this.mensaje = mensaje;
           this.rut = rut;
           this.urlRespuesta = urlRespuesta;
           this.codigo = codigo;
    }


    /**
     * Gets the mensaje value for this ValidarTokenResponseExp.
     * 
     * @return mensaje
     */
    public java.lang.String getMensaje() {
        return mensaje;
    }


    /**
     * Sets the mensaje value for this ValidarTokenResponseExp.
     * 
     * @param mensaje
     */
    public void setMensaje(java.lang.String mensaje) {
        this.mensaje = mensaje;
    }


    /**
     * Gets the rut value for this ValidarTokenResponseExp.
     * 
     * @return rut
     */
    public java.lang.String getRut() {
        return rut;
    }


    /**
     * Sets the rut value for this ValidarTokenResponseExp.
     * 
     * @param rut
     */
    public void setRut(java.lang.String rut) {
        this.rut = rut;
    }


    /**
     * Gets the urlRespuesta value for this ValidarTokenResponseExp.
     * 
     * @return urlRespuesta
     */
    public java.lang.String getUrlRespuesta() {
        return urlRespuesta;
    }


    /**
     * Sets the urlRespuesta value for this ValidarTokenResponseExp.
     * 
     * @param urlRespuesta
     */
    public void setUrlRespuesta(java.lang.String urlRespuesta) {
        this.urlRespuesta = urlRespuesta;
    }


    /**
     * Gets the codigo value for this ValidarTokenResponseExp.
     * 
     * @return codigo
     */
    public java.lang.String getCodigo() {
        return codigo;
    }


    /**
     * Sets the codigo value for this ValidarTokenResponseExp.
     * 
     * @param codigo
     */
    public void setCodigo(java.lang.String codigo) {
        this.codigo = codigo;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ValidarTokenResponseExp)) return false;
        ValidarTokenResponseExp other = (ValidarTokenResponseExp) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.mensaje==null && other.getMensaje()==null) || 
             (this.mensaje!=null &&
              this.mensaje.equals(other.getMensaje()))) &&
            ((this.rut==null && other.getRut()==null) || 
             (this.rut!=null &&
              this.rut.equals(other.getRut()))) &&
            ((this.urlRespuesta==null && other.getUrlRespuesta()==null) || 
             (this.urlRespuesta!=null &&
              this.urlRespuesta.equals(other.getUrlRespuesta()))) &&
            ((this.codigo==null && other.getCodigo()==null) || 
             (this.codigo!=null &&
              this.codigo.equals(other.getCodigo())));
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
        if (getMensaje() != null) {
            _hashCode += getMensaje().hashCode();
        }
        if (getRut() != null) {
            _hashCode += getRut().hashCode();
        }
        if (getUrlRespuesta() != null) {
            _hashCode += getUrlRespuesta().hashCode();
        }
        if (getCodigo() != null) {
            _hashCode += getCodigo().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ValidarTokenResponseExp.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://mdwcorp.falabella.com/OSB/schema/CMR/CL/Cliente/ValidarToken/Resp-v2014.6", ">validarTokenResponseExp"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mensaje");
        elemField.setXmlName(new javax.xml.namespace.QName("http://mdwcorp.falabella.com/OSB/schema/CMR/CL/Cliente/ValidarToken/Resp-v2014.6", "mensaje"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rut");
        elemField.setXmlName(new javax.xml.namespace.QName("http://mdwcorp.falabella.com/OSB/schema/CMR/CL/Cliente/ValidarToken/Resp-v2014.6", "rut"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("urlRespuesta");
        elemField.setXmlName(new javax.xml.namespace.QName("http://mdwcorp.falabella.com/OSB/schema/CMR/CL/Cliente/ValidarToken/Resp-v2014.6", "urlRespuesta"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codigo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://mdwcorp.falabella.com/OSB/schema/CMR/CL/Cliente/ValidarToken/Resp-v2014.6", "codigo"));
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
