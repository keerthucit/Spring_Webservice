package com.javaguys.webservices.client;

import java.rmi.RemoteException;

import com.javaguys.webservices.getUserServices.client.GetUserServiceStub;
import com.javaguys.webservices.getUserServices.client.GetUserServiceStub.GetUserRequest;

public class AsynchronousWebServiceClientTest
{

	public static void main (String [] args) throws RemoteException, InterruptedException
	{
		GetUserServiceStub servicesStub = new GetUserServiceStub(WebServiceCientUtils.SERVICE_ENDPOINT);
		GetUserRequest accountDetailsRequest = new GetUserRequest();
		accountDetailsRequest.setUserId("1");

		WebServiceCientCallBackHandler callBackHandler = new WebServiceCientCallBackHandler();
		servicesStub.startgetUser(accountDetailsRequest, callBackHandler);

		Thread.sleep(5000);
	}
}