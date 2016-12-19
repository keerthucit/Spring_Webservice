package com.javaguys.webservices.clientsave;
import java.rmi.RemoteException;

import com.javaguys.webservices.saveUserServices.client.SaveUserServiceStub;
import com.javaguys.webservices.saveUserServices.client.SaveUserServiceStub.SaveUserRequest;
import com.javaguys.webservices.saveUserServices.client.SaveUserServiceStub.SaveUserResponse;

public class SynchronousWebServiceClientTest
{

	public static void main (String [] args) throws RemoteException
	{
		SaveUserServiceStub servicesStub = new SaveUserServiceStub(WebServiceCientUtils.SERVICE_ENDPOINT);
		SaveUserRequest userDetailsRequest = new SaveUserRequest();
		//userDetailsRequest.setUserId("1");
		
		//userDetailsRequest.setUserId("10");
		//userDetailsRequest.setUserName("Keer");
		//userDetailsRequest.setUserGender("F");
		//userDetailsRequest.setUserStatus("F");

		SaveUserResponse userDetailsResponse = servicesStub.saveUser(userDetailsRequest);
		//WebServiceCientUtils.logAccountDetails(userDetailsResponse.saveUserDetails());
		//WebServiceCientUtils.logAccountDetails(userDetailsResponse.setUserId());
	}
}
