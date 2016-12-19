package com.javaguys.webservices.client;
import java.rmi.RemoteException;

import com.javaguys.webservices.getUserServices.client.GetUserServiceStub;
import com.javaguys.webservices.getUserServices.client.GetUserServiceStub.GetUserRequest;
import com.javaguys.webservices.getUserServices.client.GetUserServiceStub.GetUserResponse;

public class SynchronousWebServiceClientTest
{

	public static void main (String [] args) throws RemoteException
	{
		GetUserServiceStub servicesStub = new GetUserServiceStub(WebServiceCientUtils.SERVICE_ENDPOINT);
		GetUserRequest userDetailsRequest = new GetUserRequest();
		userDetailsRequest.setUserId("1");

		GetUserResponse userDetailsResponse = servicesStub.getUser(userDetailsRequest);
		WebServiceCientUtils.logAccountDetails(userDetailsResponse.getUserDetails());
	}
}
