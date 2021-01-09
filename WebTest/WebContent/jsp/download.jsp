<%@page import="java.io.File" %>
<%@page import="java.util.*"  %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>


</head>
<body>
<h3>link</h3>
<a href="${pageContext.request.contextPath }/download/SSL23541.JPG">SSL23541.JPG</a><br>
<a href="${pageContext.request.contextPath }/download/日语1000句.docx">日语1000句.docx</a><br>

<h3>all</h3>
<a href="${pageContext.request.contextPath }/DownloadServlet?filename=SSL23541.JPG">SSL23541.JPG</a>
<a href="${pageContext.request.contextPath }/DownloadServlet?filename=日语1000句.docx">日语1000句.docx</a>

<h2>Tree</h2>
<%
	Queue<File> queue = new LinkedList<File>();
	File root = new File("G://100_Projects\\01_Web\\java_jar");
	queue.offer(root);
	
	while(!queue.isEmpty()){
		File file = queue.poll();
		
		File[] files = file.listFiles();
		for(File f:files){
			if(f.isFile()){
				String path = f.getCanonicalPath();
				//path = encodeURI(path);
				System.out.println(path);
%>
	<h4>
		<a href="${ pageContext.request.contextPath }/DownloadListServlet?filename=<%= path %>" method="post"><%= f.getName() %></a>
	</h4>
<%
			}
			else{
				queue.offer(f);
			}
		}
		
		
	}
%>
</body>
</html>