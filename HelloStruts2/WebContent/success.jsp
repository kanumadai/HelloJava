<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s" %>

<!DOCTYPE html PUBLIC
	"-//Apache Software Foundation//DTD Struts Configuration 2.5//EN"
	"http://struts.apache.org/dtds/struts-2.5.dtd">
<html>
<head>
<meta charset="UTF-8">
<title>All students</title>
</head>
<body>
Welcome to Struts2.	 
<c:if test="${users != null }">
	<h2>Hello</h2>

	<table border= "1" width="600">
	<tbody>
		<tr>
			<td>id</td>
			<td>userId</td>
			<td>password</td>		
		</tr>
		<c:forEach items="${users}" var="user" varStatus="status">
			<tr>
				<td>${ user.id }</td>
				<td>${ user.userId }</td>
				<td>${ user.password }</td>
			</tr>
		</c:forEach>
		</tbody>
	</table> 
	</c:if>
</body>
</html>