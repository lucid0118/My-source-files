<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="odg.ch07.*"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<% request.setCharacterEncoding("UTF-8"); %>

<jsp:useBean id="addr" class="odg.ch07.AddrBean"></jsp:useBean>
<jsp:setProperty name="addr" property="*"/>
<jsp:useBean id="am" class="odg.ch07.AddrManager" scope="application"></jsp:useBean>

<%
	am.add(addr);
%>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>주소록 추가.jsp</title>
</head>
<body>
	<div align="center">
		<h2>등록 내용</h2>
		이름 : <jsp:getProperty property="userName" name="addr"/>
		전화번호 : <%=addr.getTel() %>
		이메일 : <%=addr.getEmail() %>
		성별 : <%=addr.getSex() %> <hr>
		
		<a href="addr_list.jsp">목록 보기</a>
	</div>
</body>
</html>