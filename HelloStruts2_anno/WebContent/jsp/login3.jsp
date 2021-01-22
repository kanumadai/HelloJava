<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login</title>
</head>

<body>
	<form action="${pageContext.request.contextPath}/testDemo3" method="post">
		UserId:<input type="text" name="userId"/><br/>
		Password:<input type="text" name="password"/><br/>
		<input type="submit" value="submit"/>
	
	</form>
</body>
</html>