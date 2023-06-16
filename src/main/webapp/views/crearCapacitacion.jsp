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

<title>Crear capacitacion</title>
</head>

<body class="text-light">

	<%@ include file='/views/navbar.jsp'%>

	<main class="container">
		<h1 class="text-center">Crear capacitación</h1>
		<div class="row justify-content-center">
			<div class="col-6">
				<form action="/grupal-modulo-5/crear-capacitacion" method="post"
					id="formCreateCapacitacion">
					<div class="mb-3">
						<label for="rutCliente" class="form-label">Rut Cliente</label> 
						<input type="text" class="form-control" id="rut" name="rut" pattern="\d{6,8}-[kK\d]" placeholder="12345678-0" required title="Use el formato 12345678-0">
					</div>
					<div class="mb-3">
						<select name="dia" id="dia" required>
							<option value="lunes">Lunes</option>
							<option value="martes">Martes</option>
							<option value="miercoles">Miercoles</option>
							<option value="jueves">Jueves</option>
							<option value="viernes">Viernes</option>
							<option value="sabado">Sabado</option>
							<option value="domingo">Domingo</option>
        				</select>
						<!--label for="dia" class="form-label">Día:</label> <input
							type="text" class="form-control" id="dayCapacitacion" name="dia"
							placeholder="en palabras [lunes-domingo]" title="en palabras [lunes-domingo]"  required-->
					</div>
					<div class="mb-3">
						<label for="fecha" class="form-label">Fecha:</label> 
						<input type="date" class="form-control" id="dateCapacitacion" name="date"  placeholder="" title="" required>
					</div>
					<div class="mb-3">
						<label for="hora" class="form-label">Hora:</label> <input
							type="time" class="form-control" id="hourCapacitacion" name="hour"  placeholder="Hora" title="hora" required>
					</div>
					<div class="mb-3">
						<label for="lugar" class="form-label">Lugar:</label> 
						<input type="text" maxlength="40" class="form-control" id="lugar" name="lugar" placeholder="Lugar hasta 40 caracteres" title="Lugar hasta 40 caracteres" required>
					</div>
					<div class="mb-3">
						<label for="duracion" class="form-label">Duración:</label> 
						<input type="number" min="0.5" step="0.5" class="form-control" id="duracion" name="duracion" placeholder="Duracion en horas, ejemplo: 1, 2.5" title="Duracion cada media hora" required>
					</div>
					<div class="mb-3">
						<label for="asistentes" class="form-label">Asistentes:</label> 
						<input type="number" min="1" max="1000" step="1" class="form-control" id="asistentes" name="asistentes" placeholder="cantidad de personas hasta 1000" title="cantidad de personas hasta 1000" required>
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