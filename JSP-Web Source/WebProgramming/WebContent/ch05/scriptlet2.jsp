<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>scriptlet test2</title>
</head>
<body>
	<h1>scriptlest test2</h1>
	<hr>
	
	<div align = "center">
	
		<%
			for(int i = 1; i < 10; i++) {
		%>
	
		<%=i %> <br>
	
		<%
			}
		%>
	
	</div>
	
</body>
</html>