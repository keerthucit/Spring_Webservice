package com.javaguys.webservices.clientsave;


import org.apache.log4j.Logger;

import com.javaguys.webservices.saveUserServices.client.SaveUserServiceCallbackHandler;
import com.javaguys.webservices.saveUserServices.client.SaveUserServiceStub.SaveUserResponse;

public class WebServiceCientCallBackHandler extends SaveUserServiceCallbackHandler
{

		private static final Logger logger_c = Logger.getLogger(WebServiceCientCallBackHandler.class);

		@Override
		public Object getClientData()
		{
			return super.getClientData();
		}

		@Override
		public void receiveResultsaveUser(SaveUserResponse result_p)
		{
			super.receiveResultsaveUser(result_p);
	//		WebServiceCientUtils.logAccountDetails(result_p.saveUserDetails());
		}

		@Override
		public void receiveErrorsaveUser(Exception ex_p)
		{
			super.receiveErrorsaveUser(ex_p);
			logger_c.error("An error occurred calling AccountDetails Service", ex_p);
		}
}