package com.javaguys.webservices.client;


import org.apache.log4j.Logger;

import com.javaguys.webservices.getUserServices.client.GetUserServiceCallbackHandler;
import com.javaguys.webservices.getUserServices.client.GetUserServiceStub.GetUserResponse;

public class WebServiceCientCallBackHandler extends GetUserServiceCallbackHandler
{

		private static final Logger logger_c = Logger.getLogger(WebServiceCientCallBackHandler.class);

		@Override
		public Object getClientData()
		{
			return super.getClientData();
		}

		@Override
		public void receiveResultgetUser(GetUserResponse result_p)
		{
			super.receiveResultgetUser(result_p);
			WebServiceCientUtils.logAccountDetails(result_p.getUserDetails());
		}

		@Override
		public void receiveErrorgetUser(Exception ex_p)
		{
			super.receiveErrorgetUser(ex_p);
			logger_c.error("An error occurred calling AccountDetails Service", ex_p);
		}
}