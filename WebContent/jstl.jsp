<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isELIgnored="false"%>
    

<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix = "sql" uri = "http://java.sun.com/jsp/jstl/sql" %>
<%@ taglib prefix = "fn" uri = "http://java.sun.com/jsp/jstl/functions" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
hello ${name}
<c:out value="${name}"></c:out>
<%-- <c:import url="https://www.google.com"></c:import> --%>
<c:out value="${students}"></c:out><br>

<c:forEach items="${students}" var="s">
	<c:out value="${s}"></c:out><br>
</c:forEach>

<sql:setDataSource var="db" driver="com.mysql.jdbc.Driver" url="jdbc:mysql://localhost:3306/ss" user="root" password="example"/>
<sql:query var="rs" dataSource="${db}" sql="select * from user"></sql:query>
<c:forEach items="${rs.rows}" var="row">
	<c:out value="${row.user_name}"></c:out>
</c:forEach>

<c:out value="${fn:length(name)}"></c:out>

</body>
</html>