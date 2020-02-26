<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JBank</title>
</head>
<body>
<%@include file="print-session.jsp"%>
<%@ include file="nav.jsp" %>
	<h1>JBank Cadastro</h1>
<div>
	<form action="GravarClienteServlet" method="post">
		<a>Nome Completo</a><br/>
			<input type="text" id="nome" name="nome" value="${param.nome}"><br/>
		<a>CPF</a><br/>
			<input type="text" id="cpf" name="cpf" value="${param.cpf}"><br/>
		<a>E-mail</a><br/>
			<input type="text" id="email" name="email" value="${param.email}"><br/>
		<a>Confirmar E-mail</a><br/>
			<input type="text" autofocus><br/>
		<a>Senha</a><br/>
			<input type="password" id="senha" name="senha"><br/>
		<a>Confirmar Senha</a><br/>
			<input type="password"><br/>
			<input type="checkBox">
		<label id="terms" >Li e concordo com a política de privacidade.</label><br/>
		<input type="submit" value="Enviar">
	</form>
</div>
</body>
</html>