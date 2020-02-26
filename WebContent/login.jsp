<%@ page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
  <head>
    <meta charset="UTF-8" />
    <title>Acessar minha conta</title>
  </head>
  <body>
    <%@ include file="print-session.jsp"%> <%@ include file="nav.jsp" %>
    <h1>JBank Login</h1>
    <div>
      <form action="LoginClienteServlet" method="post">
        <a>CPF</a><br />
        <input type="text" id="cpf" name="cpf" /><br />
        <a>Senha</a><br />
        <input type="password" id="senha" name="senha" /><br />
        <input type="submit" value="Continuar" />
      </form>
    </div>
  </body>
</html>
