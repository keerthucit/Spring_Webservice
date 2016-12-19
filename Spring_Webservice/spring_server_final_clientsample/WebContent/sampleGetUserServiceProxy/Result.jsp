<%@page contentType="text/html;charset=UTF-8"%>
<% request.setCharacterEncoding("UTF-8"); %>
<HTML>
<HEAD>
<TITLE>Result</TITLE>
</HEAD>
<BODY>
<H1>Result</H1>

<jsp:useBean id="sampleGetUserServiceProxyid" scope="session" class="com.javaguys.webservices.getUserServices.GetUserServiceProxy" />
<%
if (request.getParameter("endpoint") != null && request.getParameter("endpoint").length() > 0)
sampleGetUserServiceProxyid.setEndpoint(request.getParameter("endpoint"));
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
        java.lang.String getEndpoint2mtemp = sampleGetUserServiceProxyid.getEndpoint();
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
        sampleGetUserServiceProxyid.setEndpoint(endpoint_0idTemp);
break;
case 10:
        gotMethod = true;
        com.javaguys.webservices.getUserServices.GetUserService_PortType getGetUserService_PortType10mtemp = sampleGetUserServiceProxyid.getGetUserService_PortType();
if(getGetUserService_PortType10mtemp == null){
%>
<%=getGetUserService_PortType10mtemp %>
<%
}else{
        if(getGetUserService_PortType10mtemp!= null){
        String tempreturnp11 = getGetUserService_PortType10mtemp.toString();
        %>
        <%=tempreturnp11%>
        <%
        }}
break;
case 13:
        gotMethod = true;
        String userId_2id=  request.getParameter("userId28");
            java.lang.String userId_2idTemp = null;
        if(!userId_2id.equals("")){
         userId_2idTemp  = userId_2id;
        }
        %>
        <jsp:useBean id="com1javaguys1webservices1getUserServices1GetUserRequest_1id" scope="session" class="com.javaguys.webservices.getUserServices.GetUserRequest" />
        <%
        com1javaguys1webservices1getUserServices1GetUserRequest_1id.setUserId(userId_2idTemp);
        com.javaguys.webservices.getUserServices.GetUserResponse getUser13mtemp = sampleGetUserServiceProxyid.getUser(com1javaguys1webservices1getUserServices1GetUserRequest_1id);
if(getUser13mtemp == null){
%>
<%=getUser13mtemp %>
<%
}else{
%>
<TABLE>
<TR>
<TD COLSPAN="3" ALIGN="LEFT">returnp:</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">userDetails:</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD COLSPAN="1" ALIGN="LEFT">userStatus:</TD>
<TD>
<%
if(getUser13mtemp != null){
com.blog.javaguys.user.User tebece0=getUser13mtemp.getUserDetails();
if(tebece0 != null){
java.lang.String typeuserStatus18 = tebece0.getUserStatus();
        String tempResultuserStatus18 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typeuserStatus18));
        %>
        <%= tempResultuserStatus18 %>
        <%
}}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD COLSPAN="1" ALIGN="LEFT">userId:</TD>
<TD>
<%
if(getUser13mtemp != null){
com.blog.javaguys.user.User tebece0=getUser13mtemp.getUserDetails();
if(tebece0 != null){
java.lang.String typeuserId20 = tebece0.getUserId();
        String tempResultuserId20 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typeuserId20));
        %>
        <%= tempResultuserId20 %>
        <%
}}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD COLSPAN="1" ALIGN="LEFT">userGender:</TD>
<TD>
<%
if(getUser13mtemp != null){
com.blog.javaguys.user.User tebece0=getUser13mtemp.getUserDetails();
if(tebece0 != null){
java.lang.String typeuserGender22 = tebece0.getUserGender();
        String tempResultuserGender22 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typeuserGender22));
        %>
        <%= tempResultuserGender22 %>
        <%
}}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD COLSPAN="1" ALIGN="LEFT">userName:</TD>
<TD>
<%
if(getUser13mtemp != null){
com.blog.javaguys.user.User tebece0=getUser13mtemp.getUserDetails();
if(tebece0 != null){
java.lang.String typeuserName24 = tebece0.getUserName();
        String tempResultuserName24 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typeuserName24));
        %>
        <%= tempResultuserName24 %>
        <%
}}%>
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