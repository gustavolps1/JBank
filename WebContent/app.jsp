<%@ page language="java" contentType="text/html; charset=UTF-8"
   pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
   <head>
      <meta charset="UTF-8">
      <title>JBank</title>
   </head>
   <body>
      <h1>JBank App !<a href="/JBank/login.jsp">Sair</button></h1>
      <table>
            <tr>
               <td>
                  <c:out value="${user.nome}"></c:out>
               </td>
               <td>
                  <c:out value="${user.email}"></c:out>
               </td>
               <td>
                  <c:out value="${user.cpf}"></c:out>
               </td>
            </tr>
      </table>
   </body>
</html>