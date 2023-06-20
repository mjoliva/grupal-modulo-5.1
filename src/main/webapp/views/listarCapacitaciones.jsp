<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<% if (request.getSession().getAttribute("usuario") == null) {
		request.getRequestDispatcher("login.jsp").forward(request, response);	
	} else {
		System.out.println("la sesión si existe");
	}
%>

<%@ page import="modelo.Capacitacion" %>
<%@ page import="java.util.*" %>
<!DOCTYPE html>
<html>
<head>
<%@ include file='/views/headMetaLink.jsp'%>
<title>BeSafe Listar Capacitaciones</title>
</head>
<body>
	<%@ include file='/views/navbar.jsp'%>

	<main class="container py-5">
		<h1 class="text-center">Listado de Capacitaciones</h1>
		<div class="row">
		<div class="col py-4 w-75 justify-content-center text-center">
		<table class="table table-striped table-hover">
				<thead>
					<tr>
						<th scope="col">ID</th>
						<th scope="col">Rut Cliente</th>
						<th scope="col">Día</th>
						<th scope="col">Fecha</th>
						<th scope="col">Hora</th>
						<th scope="col">Lugar</th>
						<th scope="col">Duración</th>
						<th scope="col">Asistentes</th>
						<th scope="col">Acción</th>
					</tr>
				</thead>
				<tbody>
					 <% List<Capacitacion> capacitaciones = (List<Capacitacion>) request.getAttribute("capacitaciones"); %>
				        <% if (capacitaciones != null && !capacitaciones.isEmpty()) { %>
				            <% for (Capacitacion capacitacion : capacitaciones) { %>
				                <tr>
				                    <td><%= capacitacion.getIdCapacitacion()%></td>
				                    <td><%= capacitacion.getRutCliente() %></td>
				                    <td><%= capacitacion.getDia() %></td>
				                    <td><%= capacitacion.getFecha() %></td>
				                    <td><%= capacitacion.getHora() %></td>
				                    <td><%= capacitacion.getLugar() %></td>
				                    <td><%= capacitacion.getDuracion() %></td>
				                    <td><%= capacitacion.getAsistentes() %></td>
				                	<td>
									<form action="modificar-capacitacion" method="GET" style="display:inline">
									<input type="hidden" name="idCapacitacion" value="<%= capacitacion.getIdCapacitacion() %>">
									    <input type="submit" class="btn btn-outline-primary" value="Editar">
									</form>
									<span>|</span>
									<form action="eliminar-capacitacion" method="POST" style="display:inline">
									<input type="hidden" name="idCapacitacion" value="<%= capacitacion.getIdCapacitacion() %>">
									    <input type="submit" class="btn btn-outline-danger" value="Eliminar">
									</form>
				                    </td>
				                </tr>
				            <% } %>
				        <% } else { %>
			            <tr>
			                <td colspan="9">No se encontraron capacitaciones.</td>
			            </tr>
			        <% } %>
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