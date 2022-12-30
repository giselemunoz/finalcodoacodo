<%@page import="java.util.List"%>

<%@page import="ar.com.codoacodo.dto.Alumno"%>
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
					<% 
					  	Alumno alumnos = (Alumno)request.getAttribute("alumnos");
				  	%>
				  	<h1>Editar Nombre=<%=alumnos.getNombre()%></h1>
					
					<!--  JSP -->
					<form method="POST"
						action="<%=request.getContextPath()%>/Editar">
						<div class="mb-3">
						  <input name="id"value="<%=alumnos.getId()%>"  
						  	type="hidden" class="form-control" id="exampleFormControlInput1" >
						</div>
						<div class="mb-3">
						  <label for="exampleFormControlInput1" class="form-label">Telefono</label>
						  <input name="telefono" value="<%=alumnos.getTelefono()%>"  
						  	type="number" class="form-control" id="exampleFormControlInput1" >
						</div>
						<div class="mb-3">
						  <label for="exampleFormControlTextarea1" class="form-label">Mail</label>
						  <input name="mail" value="<%=alumnos.getMail()%>" 
						  	type="text" class="form-control" id="exampleFormControlTextarea1">
						</div>					
						<button class="btn btn-secondary">
							Grabar
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