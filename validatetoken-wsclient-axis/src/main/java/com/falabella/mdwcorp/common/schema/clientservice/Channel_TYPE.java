/**
 * Channel_TYPE.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.falabella.mdwcorp.common.schema.clientservice;

public class Channel_TYPE implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected Channel_TYPE(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _value1 = "ASL+";
    public static final java.lang.String _value2 = "B2B";
    public static final java.lang.String _value3 = "B2C";
    public static final java.lang.String _value4 = "Comercio Adherido";
    public static final java.lang.String _value5 = "Fono Compras";
    public static final java.lang.String _value6 = "Homy";
    public static final java.lang.String _value7 = "IVR";
    public static final java.lang.String _value8 = "Kiosco";
    public static final java.lang.String _value9 = "Mobile";
    public static final java.lang.String _value10 = "Portal";
    public static final java.lang.String _value11 = "Presencial";
    public static final java.lang.String _value12 = "POS";
    public static final java.lang.String _value13 = "SIX";
    public static final java.lang.String _value14 = "UXPOS";
    public static final java.lang.String _value15 = "Venta-Empresa";
    public static final java.lang.String _value16 = "Web";
    public static final java.lang.String _value17 = "Web CMR";
    public static final java.lang.String _value18 = "Web-PAC";
    public static final java.lang.String _value19 = "USSD";
    public static final java.lang.String _value20 = "Punto de Venta";
    public static final java.lang.String _value21 = "CRM";
    public static final java.lang.String _value22 = "DIM";
    public static final Channel_TYPE value1 = new Channel_TYPE(_value1);
    public static final Channel_TYPE value2 = new Channel_TYPE(_value2);
    public static final Channel_TYPE value3 = new Channel_TYPE(_value3);
    public static final Channel_TYPE value4 = new Channel_TYPE(_value4);
    public static final Channel_TYPE value5 = new Channel_TYPE(_value5);
    public static final Channel_TYPE value6 = new Channel_TYPE(_value6);
    public static final Channel_TYPE value7 = new Channel_TYPE(_value7);
    public static final Channel_TYPE value8 = new Channel_TYPE(_value8);
    public static final Channel_TYPE value9 = new Channel_TYPE(_value9);
    public static final Channel_TYPE value10 = new Channel_TYPE(_value10);
    public static final Channel_TYPE value11 = new Channel_TYPE(_value11);
    public static final Channel_TYPE value12 = new Channel_TYPE(_value12);
    public static final Channel_TYPE value13 = new Channel_TYPE(_value13);
    public static final Channel_TYPE value14 = new Channel_TYPE(_value14);
    public static final Channel_TYPE value15 = new Channel_TYPE(_value15);
    public static final Channel_TYPE value16 = new Channel_TYPE(_value16);
    public static final Channel_TYPE value17 = new Channel_TYPE(_value17);
    public static final Channel_TYPE value18 = new Channel_TYPE(_value18);
    public static final Channel_TYPE value19 = new Channel_TYPE(_value19);
    public static final Channel_TYPE value20 = new Channel_TYPE(_value20);
    public static final Channel_TYPE value21 = new Channel_TYPE(_value21);
    public static final Channel_TYPE value22 = new Channel_TYPE(_value22);
    public java.lang.String getValue() { return _value_;}
    public static Channel_TYPE fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        Channel_TYPE enumeration = (Channel_TYPE)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static Channel_TYPE fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(Channel_TYPE.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://mdwcorp.falabella.com/common/schema/clientservice", "Channel_TYPE"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
