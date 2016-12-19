<%@page contentType="text/html;charset=UTF-8"%>
<% request.setCharacterEncoding("UTF-8"); %>
<HTML>
<HEAD>
<TITLE>Result</TITLE>
</HEAD>
<BODY>
<H1>Result</H1>

<jsp:useBean id="sampleSaveUserServiceProxyid" scope="session" class="com.javaguys.webservices.saveUserServices.SaveUserServiceProxy" />
<%
if (request.getParameter("endpoint") != null && request.getParameter("endpoint").length() > 0)
sampleSaveUserServiceProxyid.setEndpoint(request.getParameter("endpoint"));
%>

<%
String method = request.getParameter("method");
int methodID = 0;
if (method == null) methodID = -1;

if(methodID != -1) methodID = Integer.parseInt(method);
boolean gotMethod = false;

try {
switch (methodID){ 
case 2:
        gotMethod = true;
        java.lang.String getEndpoint2mtemp = sampleSaveUserServiceProxyid.getEndpoint();
if(getEndpoint2mtemp == null){
%>
<%=getEndpoint2mtemp %>
<%
}else{
        String tempResultreturnp3 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(getEndpoint2mtemp));
        %>
        <%= tempResultreturnp3 %>
        <%
}
break;
case 5:
        gotMethod = true;
        String endpoint_0id=  request.getParameter("endpoint8");
            java.lang.String endpoint_0idTemp = null;
        if(!endpoint_0id.equals("")){
         endpoint_0idTemp  = endpoint_0id;
        }
        sampleSaveUserServiceProxyid.setEndpoint(endpoint_0idTemp);
break;
case 10:
        gotMethod = true;
        com.javaguys.webservices.saveUserServices.SaveUserService_PortType getSaveUserService_PortType10mtemp = sampleSaveUserServiceProxyid.getSaveUserService_PortType();
if(getSaveUserService_PortType10mtemp == null){
%>
<%=getSaveUserService_PortType10mtemp %>
<%
}else{
        if(getSaveUserService_PortType10mtemp!= null){
        String tempreturnp11 = getSaveUserService_PortType10mtemp.toString();
        %>
        <%=tempreturnp11%>
        <%
        }}
break;
case 13:
        gotMethod = true;
        String userStatus_3id=  request.getParameter("userStatus22");
            java.lang.String userStatus_3idTemp = null;
        if(!userStatus_3id.equals("")){
         userStatus_3idTemp  = userStatus_3id;
        }
        String userId_4id=  request.getParameter("userId24");
            java.lang.String userId_4idTemp = null;
        if(!userId_4id.equals("")){
         userId_4idTemp  = userId_4id;
        }
        String userGender_5id=  request.getParameter("userGender26");
            java.lang.String userGender_5idTemp = null;
        if(!userGender_5id.equals("")){
         userGender_5idTemp  = userGender_5id;
        }
        String userName_6id=  request.getParameter("userName28");
            java.lang.String userName_6idTemp = null;
        if(!userName_6id.equals("")){
         userName_6idTemp  = userName_6id;
        }
        %>
        <jsp:useBean id="com1blog1javaguys1user1User_2id" scope="session" class="com.blog.javaguys.user.User" />
        <%
        com1blog1javaguys1user1User_2id.setUserStatus(userStatus_3idTemp);
        com1blog1javaguys1user1User_2id.setUserId(userId_4idTemp);
        com1blog1javaguys1user1User_2id.setUserGender(userGender_5idTemp);
        com1blog1javaguys1user1User_2id.setUserName(userName_6idTemp);
        %>
        <jsp:useBean id="com1javaguys1webservices1saveUserServices1SaveUserRequest_1id" scope="session" class="com.javaguys.webservices.saveUserServices.SaveUserRequest" />
        <%
        com1javaguys1webservices1saveUserServices1SaveUserRequest_1id.setUserDetails(com1blog1javaguys1user1User_2id);
        com.javaguys.webservices.saveUserServices.SaveUserResponse saveUser13mtemp = sampleSaveUserServiceProxyid.saveUser(com1javaguys1webservices1saveUserServices1SaveUserRequest_1id);
if(saveUser13mtemp == null){
%>
<%=saveUser13mtemp %>
<%
}else{
%>
<TABLE>
<TR>
<TD COLSPAN="3" ALIGN="LEFT">returnp:</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">userId:</TD>
<TD>
<%
if(saveUser13mtemp != null){
java.lang.String typeuserId16 = saveUser13mtemp.getUserId();
        String tempResultuserId16 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typeuserId16));
        %>
        <%= tempResultuserId16 %>
        <%
}%>
</TD>
</TABLE>
<%
}
break;
}
} catch (Exception e) { 
%>
Exception: <%= org.eclipse.jst.ws.util.JspUtils.markup(e.toString()) %>
Message: <%= org.eclipse.jst.ws.util.JspUtils.markup(e.getMessage()) %>
<%
return;
}
if(!gotMethod){
%>
result: N/A
<%
}
%>
</BODY>
</HTML>