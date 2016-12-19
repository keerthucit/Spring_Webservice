
package com.javaguys.webservices.clientsave;

import org.apache.log4j.Logger;

import com.javaguys.webservices.saveUserServices.client.SaveUserServiceCallbackHandler;
import com.javaguys.webservices.saveUserServices.client.SaveUserServiceStub.User;

public class WebServiceCientUtils extends SaveUserServiceCallbackHandler
{

		private static final Logger logger_c = Logger.getLogger(WebServiceCientUtils.class);
		protected final static String SERVICE_ENDPOINT = "http://localhost:8080/spring-server-final/endpoints/SaveUserService.wsdl";
		private static final String NEW_LINE = "\n";


		protected static void logAccountDetails(User account_p)
		{
			StringBuffer sb = new StringBuffer();
			sb.append(NEW_LINE);
			sb.append("userId ").append(account_p.getUserId()).append(NEW_LINE);
			//sb.append("User Name: ").append(account_p.getUserName()).append(NEW_LINE);
			//sb.append("User Status: ").append(account_p.getUserStatus()).append(NEW_LINE);
			//sb.append("User Gender: ").append(account_p.getUserGender()).append(NEW_LINE);
			logger_c.debug(sb);
		}
}