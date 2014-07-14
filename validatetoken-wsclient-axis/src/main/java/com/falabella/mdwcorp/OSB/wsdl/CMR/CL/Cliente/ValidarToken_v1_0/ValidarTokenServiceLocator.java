/**
 * ValidarTokenServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.falabella.mdwcorp.OSB.wsdl.CMR.CL.Cliente.ValidarToken_v1_0;

public class ValidarTokenServiceLocator extends org.apache.axis.client.Service implements com.falabella.mdwcorp.OSB.wsdl.CMR.CL.Cliente.ValidarToken_v1_0.ValidarTokenService {

    public ValidarTokenServiceLocator() {
    }


    public ValidarTokenServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public ValidarTokenServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for ValidarTokenPort
    private java.lang.String ValidarTokenPort_address = "http://localhost/";

    public java.lang.String getValidarTokenPortAddress() {
        return ValidarTokenPort_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String ValidarTokenPortWSDDServiceName = "ValidarTokenPort";

    public java.lang.String getValidarTokenPortWSDDServiceName() {
        return ValidarTokenPortWSDDServiceName;
    }

    public void setValidarTokenPortWSDDServiceName(java.lang.String name) {
        ValidarTokenPortWSDDServiceName = name;
    }

    public com.falabella.mdwcorp.OSB.wsdl.CMR.CL.Cliente.ValidarToken_v1_0.ValidarTokenPt getValidarTokenPort() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(ValidarTokenPort_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getValidarTokenPort(endpoint);
    }

    public com.falabella.mdwcorp.OSB.wsdl.CMR.CL.Cliente.ValidarToken_v1_0.ValidarTokenPt getValidarTokenPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            com.falabella.mdwcorp.OSB.wsdl.CMR.CL.Cliente.ValidarToken_v1_0.ValidarTokenBindingStub _stub = new com.falabella.mdwcorp.OSB.wsdl.CMR.CL.Cliente.ValidarToken_v1_0.ValidarTokenBindingStub(portAddress, this);
            _stub.setPortName(getValidarTokenPortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setValidarTokenPortEndpointAddress(java.lang.String address) {
        ValidarTokenPort_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (com.falabella.mdwcorp.OSB.wsdl.CMR.CL.Cliente.ValidarToken_v1_0.ValidarTokenPt.class.isAssignableFrom(serviceEndpointInterface)) {
                com.falabella.mdwcorp.OSB.wsdl.CMR.CL.Cliente.ValidarToken_v1_0.ValidarTokenBindingStub _stub = new com.falabella.mdwcorp.OSB.wsdl.CMR.CL.Cliente.ValidarToken_v1_0.ValidarTokenBindingStub(new java.net.URL(ValidarTokenPort_address), this);
                _stub.setPortName(getValidarTokenPortWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("ValidarTokenPort".equals(inputPortName)) {
            return getValidarTokenPort();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://mdwcorp.falabella.com/OSB/wsdl/CMR/CL/Cliente/ValidarToken-v1.0", "ValidarTokenService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://mdwcorp.falabella.com/OSB/wsdl/CMR/CL/Cliente/ValidarToken-v1.0", "ValidarTokenPort"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("ValidarTokenPort".equals(portName)) {
            setValidarTokenPortEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
