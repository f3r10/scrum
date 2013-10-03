<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@page import="com.team.scorp.*"%>
<%@page import="com.team.scorp.bean.*"%>
<%@page import="com.team.scorp.dao.*"%>
<%@page import="java.util.*"%>
<%@page import="java.text.SimpleDateFormat" %>
 
<%
List<Proyecto> proyectos =(List<Proyecto>)request.getAttribute("productos");
 
%>
<html>
<head>
<title>Listar Empleados</title>
<link rel="stylesheet" type="text/css" href="/bootstrap/css/bootstrap.css" />
</head>
<body>
<% if (proyectos.size() > 0) { %>
  <div align="center">
  <table border="0" cellspacing="1" cellpadding="5" bgcolor="#CCCCCC">
        <tr><td colspan="6" align="center" ><%= proyectos.size() %> resultados encontrados ::::: </td></tr>
  <tr align="center" class="cabeceraTable">
   <td><b>#</b></td>
   <td><b>Nombres</b></td> 
   </tr>
  <% int n=1; %>
  <% for (int i = 0;i<proyectos.size();i++) { %>
   <% Proyecto e = (Proyecto)proyectos.get(i); %>
   <tr style="background:#ffffff" onMouseOver="this.style.background='#eeeeee';" onMouseOut="this.style.background='#ffffff';">
    <td><%= n++%></td>     
    <td><%= e.getNombres() %></td>          
   </tr>
  <% } %>
  </table>
  <% } else { %>
    <table>
    <tr><td>Ningun resultado. </td></tr>
    </table></div>
   <% } %> 
</body>
</html>