package com.javaguys.webservices.saveUserServices;

public class SaveUserServiceProxy implements com.javaguys.webservices.saveUserServices.SaveUserService_PortType {
  private String _endpoint = null;
  private com.javaguys.webservices.saveUserServices.SaveUserService_PortType saveUserService_PortType = null;
  
  public SaveUserServiceProxy() {
    _initSaveUserServiceProxy();
  }
  
  public SaveUserServiceProxy(String endpoint) {
    _endpoint = endpoint;
    _initSaveUserServiceProxy();
  }
  
  private void _initSaveUserServiceProxy() {
    try {
      saveUserService_PortType = (new com.javaguys.webservices.saveUserServices.SaveUserService_ServiceLocator()).getSaveUserServiceSoap11();
      if (saveUserService_PortType != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)saveUserService_PortType)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)saveUserService_PortType)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (saveUserService_PortType != null)
      ((javax.xml.rpc.Stub)saveUserService_PortType)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public com.javaguys.webservices.saveUserServices.SaveUserService_PortType getSaveUserService_PortType() {
    if (saveUserService_PortType == null)
      _initSaveUserServiceProxy();
    return saveUserService_PortType;
  }
  
  public com.javaguys.webservices.saveUserServices.SaveUserResponse saveUser(com.javaguys.webservices.saveUserServices.SaveUserRequest saveUserRequest) throws java.rmi.RemoteException{
    if (saveUserService_PortType == null)
      _initSaveUserServiceProxy();
    return saveUserService_PortType.saveUser(saveUserRequest);
  }
  
  
}