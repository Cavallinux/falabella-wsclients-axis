/**
 * Commerce_TYPE.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.falabella.mdwcorp.common.schema.clientservice;

public class Commerce_TYPE implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected Commerce_TYPE(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _value1 = "Banco";
    public static final java.lang.String _value2 = "CMR";
    public static final java.lang.String _value3 = "Falabella";
    public static final java.lang.String _value4 = "Seguros";
    public static final java.lang.String _value5 = "Sodimac";
    public static final java.lang.String _value6 = "Tottus";
    public static final java.lang.String _value7 = "Viajes";
    public static final java.lang.String _value8 = "Falabella Movil";
    public static final Commerce_TYPE value1 = new Commerce_TYPE(_value1);
    public static final Commerce_TYPE value2 = new Commerce_TYPE(_value2);
    public static final Commerce_TYPE value3 = new Commerce_TYPE(_value3);
    public static final Commerce_TYPE value4 = new Commerce_TYPE(_value4);
    public static final Commerce_TYPE value5 = new Commerce_TYPE(_value5);
    public static final Commerce_TYPE value6 = new Commerce_TYPE(_value6);
    public static final Commerce_TYPE value7 = new Commerce_TYPE(_value7);
    public static final Commerce_TYPE value8 = new Commerce_TYPE(_value8);
    public java.lang.String getValue() { return _value_;}
    public static Commerce_TYPE fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        Commerce_TYPE enumeration = (Commerce_TYPE)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static Commerce_TYPE fromString(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        return fromValue(value);
    }
    public boolean equals(java.lang.Object obj) {return (obj == this);}
    public int hashCode() { return toString().hashCode();}
    public java.lang.String toString() { return _value_;}
    public java.lang.Object readResolve() throws java.io.ObjectStreamException { return fromValue(_value_);}
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new org.apache.axis.encoding.ser.EnumSerializer(
            _javaType, _xmlType);
    }
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new org.apache.axis.encoding.ser.EnumDeserializer(
            _javaType, _xmlType);
    }
    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Commerce_TYPE.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://mdwcorp.falabella.com/common/schema/clientservice", "Commerce_TYPE"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
