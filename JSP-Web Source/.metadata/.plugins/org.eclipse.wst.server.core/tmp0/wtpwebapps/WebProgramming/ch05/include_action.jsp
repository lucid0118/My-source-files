<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>include action test</title>
</head>
<body>
	<h2 style = "font-size: 1.5em">call include_action_footer from include_action.jsp</h2>
	<hr>
	
	print massage from include_action.jsp<br><br>
	
	<jsp:include page="include_action_footer.jsp">
		<jsp:param value="cafa3@naver.com" name="email"/>
		<jsp:param value="010-3327-0677" name="tel"/>
	</jsp:include>
	
</body>
</html>