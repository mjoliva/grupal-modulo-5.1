<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@ page isErrorPage="true" %>
<% if (request.getSession().getAttribute("usuario") == null) {
		request.getRequestDispatcher("/views/login.jsp").forward(request, response);	
	} 
%>
<!DOCTYPE html>
<html lang="en">
<head>

  <%@ include file='/views/headMetaLink.jsp' %>
  
  <title>Crear capacitacion</title>
</head>

<body  class="text-light">

	<%@ include file='/views/navbar.jsp' %>
	
	<main class="container">
	  	<h1>Crear capacitación</h1>
	  	
	  	<div class="container w-50">
			<form action="/grupal-modulo-5/CrearCapacitacion" method="post" id="formCreateCapacitacion">
		  		<div class="mb-3">
		  			<label for="rutCliente" class="form-label">Rut Cliente</label>
		  			<input type="text" class="form-control" id="rut" name="rut">
		  		</div>
		  		<div class="mb-3">
		    		<label for="dia" class="form-label">Día:</label>
		    		<input type="text" class="form-control" id="dayCapacitacion" name="dia" placeholder="en palabras [lunes-domingo]">
		  		</div>
		  		<div class="mb-3">
		    		<label for="fecha" class="form-label">Fecha:</label>
		    		<input type="date" class="form-control" id="dateCapacitacion" name="date">
		  		</div>
		  		<div class="mb-3">
			    	<label for="hora" class="form-label">Hora:</label>
			    	<input type="text" class="form-control" id="hourCapacitacion" name="hour">
		  		</div>
		  		<div class="mb-3">
			    	<label for="lugar" class="form-label">Lugar:</label>
			   		<input type="text" class="form-control" id="mail" name="user_mail">
		  		</div>
		  		<div class="mb-3">
			    	<label for="duracion" class="form-label">Duración:</label>
			    	<input type="number" class="form-control" id="mail" name="user_mail">
		  		</div>
		  		<div class="mb-3">
			    	<label for="asistentes" class="form-label">Asistentes:</label>
			    	<input type="text" class="form-control" id="asistentes" name="user_mail">
		  		</div>
		  		
		  		<button class="btn btn-outline-light" type="submit" id="submitBtnCapacitacion">Enviar</button>
		  	</form>
		</div>
	</main>
  
   <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/js/bootstrap.bundle.min.js" integrity="sha384-geWF76RCwLtnZ8qwWowPQNguL3RmwHVBC9FhGdlKrxdiJJigb/j/68SIy3Te4Bkz" crossorigin="anonymous"></script>
   <!-- <script src="../js/index.js"></script> -->
</body>
</html>