<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv = "Content-Type" charset="UTF-8">
<title>Insert title here</title>
<!-- change the image when click the "change image" link -->
<script type="text/javascript">
	function changeImage(){
		document.getElementById("imgCheckcode").src="/WebTest/CheckImgServlet?time="+new Date().getTime();
	}

</script>
</head>
<body>

<h2>User login...</h2>

<h3><font color="red">${ msg }</font></h3>
<!-- <form action="/WebTest/ServletLogin" method="post"> -->
<form action="${ pageContext.request.contextPath }/ServletLogin" method="post">
	<table border ="0" width="500">
		<tr>
			<td>Name:</td>
			<td><input type="text" name="name" value="${cookie.remember.value }"></td>
		</tr>
		<tr>
			<td>Password:</td>
			<td><input type="password" name="password"></td>
		</tr>
		<tr>
			<td>Verify:</td>
			<td>
				<input type="text" name="checkcode" size = "6">
				<img id="imgCheckcode" src="/WebTest/CheckImgServlet"/>
				<a href="#" onclick="changeImage()">Change image</a>
			</td>
		</tr>
		<tr>
			<td><input type="checkbox" name="remember" value="true"></td>
			<td>Remember username</td>
		</tr>
		
		<tr>
			<td colspan="1" align="right"><input type="submit" value="submit"></td>
			<td colspan="1" align="left">
				<input type="button" name="register" value="register" onclick="location.href='/WebTest/login/register.jsp'">
			</td>
			
		</tr>
	</table>
</form>



</body>
</html>