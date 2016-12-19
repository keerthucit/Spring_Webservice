/**
 * GetUserServiceSoap11Skeleton.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.javaguys.webservices.getUserServices;

public class GetUserServiceSoap11Skeleton implements com.javaguys.webservices.getUserServices.GetUserService_PortType, org.apache.axis.wsdl.Skeleton {
    private com.javaguys.webservices.getUserServices.GetUserService_PortType impl;
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
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://com/javaguys/webservices/getUserServices", "GetUserRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://com/javaguys/webservices/getUserServices", ">GetUserRequest"), com.javaguys.webservices.getUserServices.GetUserRequest.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("getUser", _params, new javax.xml.namespace.QName("http://com/javaguys/webservices/getUserServices", "GetUserResponse"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://com/javaguys/webservices/getUserServices", ">GetUserResponse"));
        _oper.setElementQName(new javax.xml.namespace.QName("", "GetUser"));
        _oper.setSoapAction("");
        _myOperationsList.add(_oper);
        if (_myOperations.get("getUser") == null) {
            _myOperations.put("getUser", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("getUser")).add(_oper);
    }

    public GetUserServiceSoap11Skeleton() {
        this.impl = new com.javaguys.webservices.getUserServices.GetUserServiceSoap11Impl();
    }

    public GetUserServiceSoap11Skeleton(com.javaguys.webservices.getUserServices.GetUserService_PortType impl) {
        this.impl = impl;
    }
    public com.javaguys.webservices.getUserServices.GetUserResponse getUser(com.javaguys.webservices.getUserServices.GetUserRequest getUserRequest) throws java.rmi.RemoteException
    {
        com.javaguys.webservices.getUserServices.GetUserResponse ret = impl.getUser(getUserRequest);
        return ret;
    }

}
