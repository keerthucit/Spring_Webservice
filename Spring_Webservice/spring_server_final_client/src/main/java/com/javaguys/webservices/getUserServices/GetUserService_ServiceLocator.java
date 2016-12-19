/**
 * GetUserService_ServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.javaguys.webservices.getUserServices;

public class GetUserService_ServiceLocator extends org.apache.axis.client.Service implements com.javaguys.webservices.getUserServices.GetUserService_Service {

    public GetUserService_ServiceLocator() {
    }


    public GetUserService_ServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public GetUserService_ServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for GetUserServiceSoap11
    private java.lang.String GetUserServiceSoap11_address = "http://localhost:8080/spring_server_final_client/services/GetUserServiceSoap11";

    public java.lang.String getGetUserServiceSoap11Address() {
        return GetUserServiceSoap11_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String GetUserServiceSoap11WSDDServiceName = "GetUserServiceSoap11";

    public java.lang.String getGetUserServiceSoap11WSDDServiceName() {
        return GetUserServiceSoap11WSDDServiceName;
    }

    public void setGetUserServiceSoap11WSDDServiceName(java.lang.String name) {
        GetUserServiceSoap11WSDDServiceName = name;
    }

    public com.javaguys.webservices.getUserServices.GetUserService_PortType getGetUserServiceSoap11() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(GetUserServiceSoap11_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getGetUserServiceSoap11(endpoint);
    }

    public com.javaguys.webservices.getUserServices.GetUserService_PortType getGetUserServiceSoap11(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            com.javaguys.webservices.getUserServices.GetUserServiceSoap11Stub _stub = new com.javaguys.webservices.getUserServices.GetUserServiceSoap11Stub(portAddress, this);
            _stub.setPortName(getGetUserServiceSoap11WSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setGetUserServiceSoap11EndpointAddress(java.lang.String address) {
        GetUserServiceSoap11_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (com.javaguys.webservices.getUserServices.GetUserService_PortType.class.isAssignableFrom(serviceEndpointInterface)) {
                com.javaguys.webservices.getUserServices.GetUserServiceSoap11Stub _stub = new com.javaguys.webservices.getUserServices.GetUserServiceSoap11Stub(new java.net.URL(GetUserServiceSoap11_address), this);
                _stub.setPortName(getGetUserServiceSoap11WSDDServiceName());
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
        if ("GetUserServiceSoap11".equals(inputPortName)) {
            return getGetUserServiceSoap11();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://com/javaguys/webservices/getUserServices", "GetUserService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://com/javaguys/webservices/getUserServices", "GetUserServiceSoap11"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("GetUserServiceSoap11".equals(portName)) {
            setGetUserServiceSoap11EndpointAddress(address);
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
