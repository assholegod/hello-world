<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<!--  PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd" -->
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2 align="center">文件上传</h2>
	<form action="upload.do" method="post" enctype="multipart/form-data">
		点击&nbsp;&nbsp;&nbsp;<input type="file" name="file1" value="file">
		<input type="submit" name="submit" value="submit">
	</form>
</body>
</html>
