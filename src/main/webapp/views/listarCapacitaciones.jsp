<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@ page isErrorPage="true" %>
<% if (request.getSession().getAttribute("usuario") == null) {
		request.getRequestDispatcher("/views/login.jsp").forward(request, response);	
	}
%>
<!DOCTYPE html>
<html>
<head>
	<%@ include file='/views/headMetaLink.jsp' %>
	<title>BeSafe Listar Capacitaciones</title>
</head>
<body>
	<%@ include file='/views/navbar.jsp' %>
	
	<main class="container">
		<h1>Vista temporal para Listar Capacitaciones</h1>
		<% out.println(request.getAttribute("returnRut"));%>
	</main> 
	
	<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/js/bootstrap.bundle.min.js" integrity="sha384-geWF76RCwLtnZ8qwWowPQNguL3RmwHVBC9FhGdlKrxdiJJigb/j/68SIy3Te4Bkz" crossorigin="anonymous"></script>
	<script src="/grupal-modulo-5/js/index.js"></script>
</body>
</html>