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

<form action="index.jsp" method="post" enctype="application/x-www-form-urlencoded">
	<table id="registro" width="110" border="0" cellspacing="0" cellpadding="5">
		<tr align="center">
			<td colspan="2" align="center">DATOS DEPARTAMENTO</td>
		</tr>
		<tr>
			<td>NOMBRE</td>
			<td><input name="nombre" type="text"> </td>
		</tr>
		
  		<tr align="center">
    		<td colspan="2" align="center"><input type="submit" value="Guargar"></td>
  		</tr>
	</table>
</form>

</body>
</html>