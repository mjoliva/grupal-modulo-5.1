<!DOCTYPE html>
<html lang="en">
<head>

<%@ include file='/views/headMetaLink.jsp'%>
<%@ page import="modelo.Capacitacion" %>

<title>Modificar capacitacion</title>
</head>

<body class="text-light">

	<%@ include file='/views/navbar.jsp'%>
	<main class="container">
		<h1 class="text-center">Modificar capacitación</h1>
		<div class="row justify-content-center">
			<div class="col-6">
				<form action="/grupal-modulo-5/modificar-capacitacion" method="POST"
					id="formCreateCapacitacion">
					<input type="hidden" name="idCapacitacion" value="${capacitacion.idCapacitacion}">
					<div class="mb-3">
						<label for="rutCliente" class="form-label">Rut Cliente</label> <input
							type="text" class="form-control" id="rut" name="rut" value="${capacitacion.rutCliente}" />
					</div>
					<div class="mb-3">
						<label for="dia" class="form-label">Día:</label> <input
							type="text" class="form-control" id="dayCapacitacion" name="dia"
							placeholder="en palabras [lunes-domingo]" value="${capacitacion.dia}" />
					</div>
					<div class="mb-3">
						<label for="fecha" class="form-label">Fecha:</label> <input
							type="date" class="form-control" id="dateCapacitacion"
							name="date" value="${capacitacion.fecha}"/>
					</div>
					<div class="mb-3">
						<label for="hora" class="form-label">Hora:</label> <input
							type="time" class="form-control" id="hourCapacitacion" name="hour" value="${capacitacion.hora }"/>
					</div>
					<div class="mb-3">
						<label for="lugar" class="form-label">Lugar:</label> <input
							type="text" class="form-control" id="lugar" name="lugar" value="${capacitacion.lugar}"/>
					</div>
					<div class="mb-3">
						<label for="duracion" class="form-label">Duración:</label> <input
							type="number" class="form-control" id="duracion" name="duracion" value="${capacitacion.duracion}"/>
					</div>
					<div class="mb-3">
						<label for="asistentes" class="form-label">Asistentes:</label> <input
							type="text" class="form-control" id="asistentes" name="asistentes" value="${capacitacion.asistentes}"/>
					</div>
					<button class="btn btn-outline-light" type="submit" id="submitBtnCapacitacion">Actualizar</button>
				</form>
			</div>
		</div>
	</main>

	<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/js/bootstrap.bundle.min.js" integrity="sha384-geWF76RCwLtnZ8qwWowPQNguL3RmwHVBC9FhGdlKrxdiJJigb/j/68SIy3Te4Bkz" crossorigin="anonymous"></script>
	<!-- <script src="../js/index.js"></script> -->
</body>
</html>