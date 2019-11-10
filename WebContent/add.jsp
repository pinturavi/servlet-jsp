<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" errorPage="error.jsp"%>
    
<%@ page import="static java.lang.Integer.parseInt" %>

<%@ include file="welcome.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%! String name="ravi"; %>
<%
int x = parseInt(request.getParameter("number1"));
int y = parseInt(request.getParameter("number2"));

out.println(x + y);
//try {
	int k = 9 /0;
/* } catch(Exception ex) {
	out.print("Error occured");
} */

%>

<%= name %>
<%= pageContext.getRequest() %>
<%= application.getNamedDispatcher("square") %>
<%= config.getServletName() %>
<%= session.getCreationTime() %>
</body>
</html>