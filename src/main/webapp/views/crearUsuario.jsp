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
				<form action="" class="form" w-50>
					<fieldset>
						<legend>Datos básicos</legend>
						<label class="form-label" for="">Rut: <input type="text"
							class="form-control">
						</label> <label class="form-label" for="">Nombres: <input
							type="text" class="form-control" required/>
						</label> <label class="form-label" for="">Apellidos: <input
							type="text" class="form-control" required/>
						</label> <label for="" class="form-label">Fecha de Nacimiento: <input
							type="text" class="form-control" required/>
						</label>
					</fieldset>
					<select name="" id="" class="form-select">
						<option value="administrativo" disabled selected>Seleccione:</option>
						<option value="administrativo">Administrativo</option>
						<option value="profesional">Profesional</option>
						<option value="cliente">Cliente</option>
					</select> <br>
					<!-- tipo de usuario específico -->
					<fieldset id="especifico"></fieldset>
				</form>
			</div>
		</div>
	</main>

	<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/js/bootstrap.bundle.min.js" integrity="sha384-geWF76RCwLtnZ8qwWowPQNguL3RmwHVBC9FhGdlKrxdiJJigb/j/68SIy3Te4Bkz" crossorigin="anonymous"></script>
	<!-- <script src="../js/index.js"></script> -->
	<script>
	

	const select = document.querySelector('select');
	const especifico = document.querySelector('#especifico');

	select.addEventListener('change', handler);

	function handler(e) {
	  especifico.innerHTML = tipoUsuario(e.target.value);
	}

	function tipoUsuario(tipo) {
	  const usuarios = {
	    cliente: `<legend>Cliente</legend><label class="form-label">Teléfono: <input type="text" class="form-control " required/></label><label>Dirección: <input type="text" class="form-control ms-2" required/></label>`,
	    profesional: `<legend>Profesional</legend><label class="form-label">Título: <input type="text" class="form-control" required/></label><label class="form-label">Fecha ingreso: <input type="text" class="form-control ms-2" required/></labelclass>`,
	    administrativo: `<legend>Administrativo</legend><labelclass="form-label">Area: <input type="text" class="form-control" required/></label class><labelclass="form-label">Exp. previa: <input type="text" class="form-control " required/></labelclass>` 
	  }
	  return usuarios[tipo];
	}
	</script>
</body>
</html>