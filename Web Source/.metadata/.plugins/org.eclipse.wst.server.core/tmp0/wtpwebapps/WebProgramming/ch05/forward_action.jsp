<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>forwared action test</title>
</head>
<body>
	<h2>call footer.jsp at forward_action.jsp</h2>
	<hr>
	
	Every content no Print forward_action.jsp
	<%!
		int a = 10;
	%>
	
	<jsp:forward page = "forward_footer.jsp">
		<jsp:param value="lucid1022@gmail.com" name="email"/>
		<jsp:param value="010-3327-0677" name="tel"/>
	</jsp:forward>

</body>
</html>