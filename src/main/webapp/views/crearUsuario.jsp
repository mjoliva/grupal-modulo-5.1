<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<% if (request.getSession().getAttribute("usuario") == null) {
		request.getRequestDispatcher("login.jsp").forward(request, response);	
	} else {
		System.out.println("la sesión si existe");
	}
%>

<!DOCTYPE html>
<html lang="en">
<head>

<%@ include file='/views/headMetaLink.jsp'%>

<title>Crear usuario</title>
</head>

<body class="text-light">

	<%@ include file='/views/navbar.jsp'%>

	<main class="container">
		<h1 class="text-center">Crear usuario</h1>
		<div class="row justify-content-center">
			<div class="col-6">
				<form action="/crear-usuario" method="post"
					id="formCreateUser">
					<div class="mb-3">
						<label for="rutUsuario" class="form-label">Rut:</label> <input
							type="text" class="form-control" id="rut" name="rut">
					</div>
					<div class="mb-3">
						<label for="nombre" class="form-label">Nombre:</label> <input
							type="text" class="form-control" id="nombre" name="nombre">
					</div>
					<div class="mb-3">
						<label for="apellido" class="form-label">Apellido:</label> <input
							type="text" class="form-control" id="apellido"
							name="apellido">
					</div>
					<div class="mb-3">
						<label for="fechaNacimiento" class="form-label">Fecha de Nacimiento:</label> <input
							type="date" class="form-control" id="fechaNacimiento" name="fechaNacimiento">
					</div>
					<button class="btn btn-outline-light" type="submit" id="submitBtnCapacitacion">Enviar</button>
				</form>
			</div>
		</div>
	</main>

	<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/js/bootstrap.bundle.min.js" integrity="sha384-geWF76RCwLtnZ8qwWowPQNguL3RmwHVBC9FhGdlKrxdiJJigb/j/68SIy3Te4Bkz" crossorigin="anonymous"></script>
	<!-- <script src="../js/index.js"></script> -->
</body>
</html>