package com.javaguys.webservices.getUserServices;

public class GetUserServiceProxy implements com.javaguys.webservices.getUserServices.GetUserService_PortType {
  private String _endpoint = null;
  private com.javaguys.webservices.getUserServices.GetUserService_PortType getUserService_PortType = null;
  
  public GetUserServiceProxy() {
    _initGetUserServiceProxy();
  }
  
  public GetUserServiceProxy(String endpoint) {
    _endpoint = endpoint;
    _initGetUserServiceProxy();
  }
  
  private void _initGetUserServiceProxy() {
    try {
      getUserService_PortType = (new com.javaguys.webservices.getUserServices.GetUserService_ServiceLocator()).getGetUserServiceSoap11();
      if (getUserService_PortType != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)getUserService_PortType)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)getUserService_PortType)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (getUserService_PortType != null)
      ((javax.xml.rpc.Stub)getUserService_PortType)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public com.javaguys.webservices.getUserServices.GetUserService_PortType getGetUserService_PortType() {
    if (getUserService_PortType == null)
      _initGetUserServiceProxy();
    return getUserService_PortType;
  }
  
  public com.javaguys.webservices.getUserServices.GetUserResponse getUser(com.javaguys.webservices.getUserServices.GetUserRequest getUserRequest) throws java.rmi.RemoteException{
    if (getUserService_PortType == null)
      _initGetUserServiceProxy();
    return getUserService_PortType.getUser(getUserRequest);
  }
  
  
}