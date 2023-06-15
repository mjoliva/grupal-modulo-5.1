<!DOCTYPE html>
<html lang="en">
<head>
  <%@ include file="/views/headMetaLink.jsp" %>
  
  <title>BeSafe Contacto</title>
</head>
<body class="text-light">
	
	<%@ include file='/views/navbar.jsp' %>
	
    <main class="container text-light">
	   <h1>Contacto</h1>
	    <form action="/grupal-modulo-5/Contacto" method="post"> <!-- Probar si -->
	    	<div class="mb-3">
			    <label for="username" class="form-label">Nombre:</label>
			   	<input type="text" class="form-control" id="mail" name="username">
		  	</div>
		  	<div class="mb-3">
		    	<label for="usermail" class="form-label">Email:</label>
		    	<input type="email" class="form-control" id="mail" name="usermail">
	  		</div>
	  		<div class="mb-3">
		    	<label for="usermessage" class="form-label">Mensaje:</label>
			    <textarea class="form-control" id="msg" name="usermessage"></textarea>
	  		</div>
	
	      	<button class="btn  btn-outline-light" type="submit">Enviar</button>
	    </form>
	</main>
	
	<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/js/bootstrap.bundle.min.js" integrity="sha384-geWF76RCwLtnZ8qwWowPQNguL3RmwHVBC9FhGdlKrxdiJJigb/j/68SIy3Te4Bkz" crossorigin="anonymous"></script>
	<script src="../js/index.js"></script>
</body>
</html>