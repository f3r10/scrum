<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ page import="java.util.*"%>
<%@ page import="java.text.SimpleDateFormat" %>
<%@ page import="com.google.appengine.api.users.User" %>
<%@ page import="com.google.appengine.api.users.UserService" %>
<%@ page import="com.google.appengine.api.users.UserServiceFactory" %>
 
<html>
<head>
<title>Mantenimiento de Empleados</title>
<link rel="stylesheet" type="text/css" href="/bootstrap/css/bootstrap.css" />
</head>
<body>

<form action="/index.jsp" method="post">
  <div align="center">
  <table border="0" cellspacing="1" cellpadding="5">
      <tr bgcolor="#4B4B5A" style="color: white;" ><td colspan="2" align="center"><h3><u>Mantenimiento de Empleados</u></h3></td></tr>
      <tr>
       <td>Nombres:</td>
       <td><input type="text" name="nombres" /></td>
      </tr>
      
      
      <tr>
       <td colspan="2" align="center">
       <input type="hidden" name="action" value="registrar"/>
       <input type="submit" value="Registrar" class="boton" >
       </td>
      </tr>
   </table>
   </div>
   </form>

</body>
</html>