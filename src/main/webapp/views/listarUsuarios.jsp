<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<% if (request.getSession().getAttribute("usuario") == null) {
		request.getRequestDispatcher("login.jsp").forward(request, response);	
	} else {
		System.out.println("la sesión si existe");
	}
%>

<!DOCTYPE html>
<html>
<head>
<%@ include file='/views/headMetaLink.jsp'%>
<title>BeSafe Listar Usuarios</title>
</head>
<body>
	<%@ include file='/views/navbar.jsp'%>

	<main class="container py-5">
		<h1 class="text-center">Listado de Usuarios</h1>
		<div class="row">
		<div class="col py-4 w-75 justify-content-center text-center">
		<table class="table">
				<thead>
					<tr>
						<th scope="col">#</th>
						<th scope="col">Rut</th>
						<th scope="col">Nombre</th>
						<th scope="col">Apellido</th>
						<th scope="col">Fecha Nacimiento</th>
					</tr>
				</thead>
				<tbody>
					<tr>
						<th scope="row">1</th>
						<td>Mark</td>
						<td>Otto</td>
						<td>@mdo</td>
						<td>Mark</td>
					</tr>
				</tbody>
			</table>
		</div>
		</div>
	</main>

	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/js/bootstrap.bundle.min.js"
		integrity="sha384-geWF76RCwLtnZ8qwWowPQNguL3RmwHVBC9FhGdlKrxdiJJigb/j/68SIy3Te4Bkz"
		crossorigin="anonymous"></script>
	<script src="/grupal-modulo-5/js/index.js"></script>
</body>
</html>