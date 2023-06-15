<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<!-- Error Page Directive -->
<%@ page isErrorPage="true" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">

<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-9ndCyUaIbzAi2FUVXJi0CjmCapSmO7SnpJef0486qhLnuZ2cdeRhO02iuK6FUUVM" crossorigin="anonymous">
<link rel="stylesheet" href="/grupal-modulo-5/css/style.css">

<title></title> <!-- agregado dinámicamente desde js/index.js -->
</head>
<body class="text-light" id="index">

	<%@ include file='/views/navbar.jsp' %>
	
	<main class="container-fluid" id="main">
		<h1>Asesores en riesgos laborales</h1>
  	</main>
  	<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/js/bootstrap.bundle.min.js" integrity="sha384-geWF76RCwLtnZ8qwWowPQNguL3RmwHVBC9FhGdlKrxdiJJigb/j/68SIy3Te4Bkz" crossorigin="anonymous"></script>
  	<script src="/grupal-modulo-5/js/index.js"></script>
</body>
</html>