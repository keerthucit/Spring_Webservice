/**
 * SaveUserServiceSoap11Skeleton.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.javaguys.webservices.saveUserServices;

public class SaveUserServiceSoap11Skeleton implements com.javaguys.webservices.saveUserServices.SaveUserService_PortType, org.apache.axis.wsdl.Skeleton {
    private com.javaguys.webservices.saveUserServices.SaveUserService_PortType impl;
    private static java.util.Map _myOperations = new java.util.Hashtable();
    private static java.util.Collection _myOperationsList = new java.util.ArrayList();

    /**
    * Returns List of OperationDesc objects with this name
    */
    public static java.util.List getOperationDescByName(java.lang.String methodName) {
        return (java.util.List)_myOperations.get(methodName);
    }

    /**
    * Returns Collection of OperationDescs
    */
    public static java.util.Collection getOperationDescs() {
        return _myOperationsList;
    }

    static {
        org.apache.axis.description.OperationDesc _oper;
        org.apache.axis.description.FaultDesc _fault;
        org.apache.axis.description.ParameterDesc [] _params;
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://com/javaguys/webservices/saveUserServices", "SaveUserRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://com/javaguys/webservices/saveUserServices", ">SaveUserRequest"), com.javaguys.webservices.saveUserServices.SaveUserRequest.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("saveUser", _params, new javax.xml.namespace.QName("http://com/javaguys/webservices/saveUserServices", "SaveUserResponse"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://com/javaguys/webservices/saveUserServices", ">SaveUserResponse"));
        _oper.setElementQName(new javax.xml.namespace.QName("", "SaveUser"));
        _oper.setSoapAction("");
        _myOperationsList.add(_oper);
        if (_myOperations.get("saveUser") == null) {
            _myOperations.put("saveUser", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("saveUser")).add(_oper);
    }

    public SaveUserServiceSoap11Skeleton() {
        this.impl = new com.javaguys.webservices.saveUserServices.SaveUserServiceSoap11Impl();
    }

    public SaveUserServiceSoap11Skeleton(com.javaguys.webservices.saveUserServices.SaveUserService_PortType impl) {
        this.impl = impl;
    }
    public com.javaguys.webservices.saveUserServices.SaveUserResponse saveUser(com.javaguys.webservices.saveUserServices.SaveUserRequest saveUserRequest) throws java.rmi.RemoteException
    {
        com.javaguys.webservices.saveUserServices.SaveUserResponse ret = impl.saveUser(saveUserRequest);
        return ret;
    }

}
