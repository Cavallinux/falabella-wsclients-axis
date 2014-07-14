/**
 * Country_TYPE.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.falabella.mdwcorp.common.schema.clientservice;

public class Country_TYPE implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected Country_TYPE(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _AR = "AR";
    public static final java.lang.String _CL = "CL";
    public static final java.lang.String _CO = "CO";
    public static final java.lang.String _PE = "PE";
    public static final Country_TYPE AR = new Country_TYPE(_AR);
    public static final Country_TYPE CL = new Country_TYPE(_CL);
    public static final Country_TYPE CO = new Country_TYPE(_CO);
    public static final Country_TYPE PE = new Country_TYPE(_PE);
    public java.lang.String getValue() { return _value_;}
    public static Country_TYPE fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        Country_TYPE enumeration = (Country_TYPE)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static Country_TYPE fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(Country_TYPE.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://mdwcorp.falabella.com/common/schema/clientservice", "Country_TYPE"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
