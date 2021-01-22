<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Hello Struts2</title>
</head>

<body>
<a href="${pageContext.request.contextPath}/testDemo">Get all users.</a>
	<form action="${pageContext.request.contextPath}/testDemo" method="post">
		name:<input type="text" name="username"/><br/>
		age:<input type="text" name="age"/><br/>
		birthday:<input type="text" name="birthday"/><br/>
		hobby:<input type="checkbox" name="hobby" value="eat"/>eat
				<input type="checkbox" name="hobby" value="sleep"/>sleep
				<input type="checkbox" name="hobby" value="read"/>read
		<br/>
		<input type="submit" value="submit"/>
	
	</form>
</body>
</html>