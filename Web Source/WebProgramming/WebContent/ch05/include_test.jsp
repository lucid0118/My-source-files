<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	
	<div align = "center">
		<h1>Include directive test</h1>
		<hr color="blue">
		
		<%@ include file = "include_menu.jsp" %>
		<p></p>
		
		<table>
			<tr align="center">
				<td style = "font-size : 20px"><%@include file = "include_news.jsp"%>
				<td width = "3px">&nbsp;</td>
				<td style = "font-size : 20px;" align = "left"><%@include file = "include_shopping.jsp"%>
			</tr>
		</table>
	</div>
	
</body>
</html>