<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" errorPage="../pages/erro.jsp"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>JBank - Seu banco online</title>
	
</head>
<body>
<%@ include file="print-session.jsp"%>
<%@ include file="nav.jsp" %>
<%session.setAttribute("session", request.getRequestedSessionId());%>
<div>
	<h1>JBank</h1>	
		<form action="cadastro.jsp" method="post">
			<a>Nome Completo</a>
				<input type="text" id="nome" name="nome">
			<a>CPF</a>
				<input type="text" id="cpf" name="cpf">
			<a>E-mail</a>
				<input type="text" id="email" name="email">
			<input type="submit" value="Quero ser JBank">
		</form>
</div>


</body>
</html>