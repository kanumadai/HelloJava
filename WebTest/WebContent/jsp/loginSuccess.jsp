<%@ page import="com.kunuma.domain.User" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv = "Content-Type" charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<!-- if(request.getSession().getAttribute("existUser")==null) -->
<c:if test="${existUser == null }">
	<h1>You have not login, goto <a href = "/WebTest/login/login.jsp">login</a></h1>
</c:if>
<c:if test="${existUser != null }">
	<h2>Hello:${ existUser.nickname }</h2>
	<table border= "1" width="600">
		<tr>
			<td>UserId</td>
			<td>UserName</td>
			<td>PassWord</td>
			<td>NickName</td>			
		</tr>		
		<tr>
			<td>${ existUser.uid }</td>
			<td>${ existUser.username }</td>
			<td>${ existUser.password }</td>
			<td>${ existUser.nickname }</td>			
		</tr>
		
	</table>
	<h2>User login success.Online users are <font color="green"> ${count}</font></h2>
	<a href="/WebTest/LogoutServlet">logout</a>
	</c:if>

</body>
</html>