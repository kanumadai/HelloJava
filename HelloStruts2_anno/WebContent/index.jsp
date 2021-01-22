<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s" %>

<!DOCTYPE html PUBLIC
	"-//Apache Software Foundation//DTD Struts Configuration 2.5//EN"
	"http://struts.apache.org/dtds/struts-2.5.dtd">
<html>
<head>
<meta charset="UTF-8">
<title>Hello Struts2</title>
</head>

<body>
<a href="${pageContext.request.contextPath}/findAllUsers">Get all users.</a>

<a href="${pageContext.request.contextPath}/actionContextDemo">Get all users.</a>
</body>
</html>