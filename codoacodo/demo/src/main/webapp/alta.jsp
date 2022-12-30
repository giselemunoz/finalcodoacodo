<html>
	<head>
	<link rel="stylesheet" href="css/estilo.css">
		<%@include file="head.jsp" %>
	</head>
	
	<body>
		<main>
			<!-- ACA VA EL NAVBAR  -->
			<%@include file="navbar.jsp" %>
			<div class="container">
				<section>
					<h1>Alta de Alumnos</h1>
					<!--  JSP -->
					<form method="post"
						action="<%=request.getContextPath()%>/AltaController">
						<div class="mb-3">
						  <label for="exampleFormControlInput1" class="form-label">Nombre</label>
						  <input name="nombre"  type="text" class="form-control" id="exampleFormControlInput1" placeholder="Nombre" maxlength="50">
						</div>
						<div class="mb-3">
						  <label for="exampleFormControlTextarea1" class="form-label">Apellido</label>
						  <input name="apellido" type="text" class="form-control" id="exampleFormControlInput1">
						</div>
						<div class="mb-3">
						  <label for="exampleFormControlTextarea1" class="form-label">Dni</label>
						  <input name="dni" type="number" class="form-control" id="exampleFormControlTextarea1">
						</div>
						<div class="mb-3">
						  <label for="exampleFormControlTextarea1" class="form-label">Telefono</label>
						  <input name="telefono" type="number" class="form-control" id="exampleFormControlTextarea1" >
						</div>
						<div class="mb-3">
						  <label for="exampleFormControlTextarea1" class="form-label">Mail</label>
						  <input name="mail" type="text" class="form-control" id="exampleFormControlTextarea1" >
						</div>
						<div class="mb-3">
						  <label for="exampleFormControlTextarea1" class="form-label">Cursos</label>
						  <input name="idCursos" type="number" class="form-control" id="exampleFormControlInput1" >
						</div>
						<div class="mb-3">
						  <label for="exampleFormControlTextarea1" class="form-label">Turno</label>
						  <input name="idTurnos" type="number" class="form-control" id="exampleFormControlInput1" >
						</div>
						<button class="btn btn-secondary">
							Dar de alta
						</button>
					</form>
				</section>
			</div>
		</main>
	   <footer>
		<ul>
            <lu>
                <a href="https://www.linkedin.com/in/gisele-munoz-qa-pr/"><img src="imagenes/lin.png" class="img"></a>
                <a href="https://github.com/giselemunoz"><img src="imagenes/minimini.png" class="img"></a>
            </lu>
        </ul>
        </footer>
	</body>	
</html>