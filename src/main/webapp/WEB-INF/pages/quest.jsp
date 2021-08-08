<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title></title>
	</head>
	<body>
		<h3>QUEST PAGE</h3>
		<dl>
			<dd><a target='_blank' href='${pageContext.request.contextPath}/Controller?page=login.jsp'>Login</a></dd>
			<dd><a target='_blank' href='${pageContext.request.contextPath}/Controller?page=logout.jsp'>Logout</a></dd>
			<dd><a target='_blank' href='${pageContext.request.contextPath}/Controller?page=quest.jsp'>Quest</a></dd>
		</dl>
	</body>
</html>