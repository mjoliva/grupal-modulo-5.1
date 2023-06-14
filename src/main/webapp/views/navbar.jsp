<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@ page isErrorPage="true" %>
<nav class="navbar navbar-expand-lg bg-body-tertiary bg-dark" data-bs-theme="dark">
  	<div class="container-fluid">
    	<a class="navbar-brand" href="index.jsp">Inicio</a>
    	<button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
      		<span class="navbar-toggler-icon"></span>
    	</button>
    	<div class="collapse navbar-collapse" id="navbarSupportedContent">
      		<ul class="navbar-nav ms-auto me-5 mb-2 mb-lg-0">
        		<li class="nav-item dropdown">
          			<a class="nav-link dropdown-toggle" href="#" role="button" data-bs-toggle="dropdown" aria-expanded="false">
            			Opciones
          			</a>
	          		<ul class="dropdown-menu">
	            		<li><a class="dropdown-item" href="/grupal-modulo-5/views/contacto.jsp">Contacto</a></li>
	            		<li><hr class="dropdown-divider"></li>
	            		<li><a class="dropdown-item" href="/grupal-modulo-5/views/crearCapacitacion.jsp">Crear Capacitacion</a></li>
	            		<li><hr class="dropdown-divider"></li>
	            		<li><a class="dropdown-item" href="/grupal-modulo-5/views/listarCapacitaciones.jsp">Listar Capacitaciones</a></li>
	          		</ul>
        		</li>
        		<li class="nav-item">
          			<a class="nav-link active" aria-current="page" href="/grupal-modulo-5/views/login.jsp">Login</a>
        		</li>
        		<li class="nav-item">
         			<a class="nav-link" href="/grupal-modulo-5/salir">cerrar sesión</a>
        		</li>
<!-- 	        		<li class="nav-item"> -->
<!-- 	          			<a class="nav-link disabled">Disabled</a> -->
<!-- 	        		</li> -->
      		</ul>
    	</div> <!-- Ends navbar-collapse -->
  	</div> <!-- Ends navbar > container-fluid  -->
</nav>