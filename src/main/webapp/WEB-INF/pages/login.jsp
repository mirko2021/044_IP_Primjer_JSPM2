<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title></title>
	</head>
	<body>
		<h3>LOGIN PAGE</h3>
		<dl>
			<dd><a target='_blank' href='${pageContext.request.contextPath}/Controller?page=login.jsp'>Login</a></dd>
			<dd><a target='_blank' href='${pageContext.request.contextPath}/Controller?page=logout.jsp'>Logout</a></dd>
			<dd><a target='_blank' href='${pageContext.request.contextPath}/Controller?page=quest.jsp'>Quest</a></dd>
		</dl>
		<br>
		<h3>ПРИЈАВА</h3>
		<form method='POST'>
			<table>
				<tr>
					<td>Корисничко име: </td>
					<td><input type='text' name='username' id='username'/></td>
				</tr>
			</table>
			<input type='hidden' name='page' value='${param["page"]}'/><br>
			<input type='submit' name='login_submit' value='ПРИЈАВА'/>
		</form>
	</body>
</html>