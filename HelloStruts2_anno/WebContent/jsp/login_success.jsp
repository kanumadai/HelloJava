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
Welcome ${currentUser.userId} !

<s:debug></s:debug>
</body>
</html>