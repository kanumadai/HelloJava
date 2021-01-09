<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<h1>Upload file!</h1>

<form action="${pageContext.request.contextPath }/UploadServlet" method="post" enctype="multipart/form-data">
	File:<input type="text" name="info"><br>
	Upload:<input type="file" name="upload"><br>
	<input type="submit" value="Upload">
</form>


</body>
</html>