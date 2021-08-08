<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<jsp:useBean id='logonBean' class='yatospace.etf.ip.bean.LogonBean' scope='session'></jsp:useBean>

<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title></title>
	</head>
	<body>
		<h3>LOGOUT PAGE</h3>
		<dl>
			<dd><a target='_blank' href='${pageContext.request.contextPath}/Controller?page=login.jsp'>Login</a></dd>
			<dd><a target='_blank' href='${pageContext.request.contextPath}/Controller?page=logout.jsp'>Logout</a></dd>
			<dd><a target='_blank' href='${pageContext.request.contextPath}/Controller?page=quest.jsp'>Quest</a></dd>
		</dl>
		<h3>ОДЈАВА</h3>
		<form method='POST'>
			<table>
				<tr>
					<td>Корисничко име: </td>
					<td>${logonBean.usernameHTML()}</td>
				</tr>
			</table>
			<input type='hidden' name='page' value='${param["page"]}'/><br>
			<input type='submit' name='logout_submit' value='ОДЈАВА'/>
		</form>
	</body>
</html>