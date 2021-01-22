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
Get the test demo.
<br/>
<!-- get map value by key useing the OGNL expression :#key -->
<s:property value="#actionContextDemo"/><br/>
<s:property value="#application.appContext"/><br/>
<s:property value="#application.appMap"/><br/>
<s:property value="#session.session"/><br/>
<s:property value="#session.sessMap"/><br/>
<br/><br/>
<s:property value="userId"/><br/>
<s:property value="password"/><br/>



<s:debug></s:debug>
</body>
</html>