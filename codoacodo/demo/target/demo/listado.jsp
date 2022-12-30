<%@page import="java.util.List"%>
<%@page import="ar.com.codoacodo.dto.Alumno"%>

<html>
	<head>
		<%@include file="head.jsp" %>	
	</head>
	
	<body>
		<!-- ACA VA EL NAVBAR  -->
		<%@include file="navbar.jsp" %>
		<main>
			<div class="container">
				<section>
					<h1>Lista</h1>
					<table class="table">
					  <thead>
					    <tr>
					      <th scope="col">ID</th>
					      <th scope="col">NOMBRE</th>
					      <th scope="col">APELLIDO</th>
					      <th scope="col">DNI</th>
					      <th scope="col">TELEFONO</th>
					      <th scope="col">MAIL</th>
					      <th scope="col">CURSO</th>
					      <th scope="col">TURNO</th>
					    </tr>
					  </thead>
					  <% 
					  	
					  	List<Alumno> listado = (List<Alumno>)request.getAttribute("listado");
					  %>
					  <tbody>
					  
					   <%
					   	for( Alumno unAlumno : listado) {
					   %>
					    <tr>
					      <th scope="row"> <%=unAlumno.getId()%> </th>
					      <td><%=unAlumno.getNombre() %></td>
					      <td><%=unAlumno.getApellido() %></td>
					      <td><%=unAlumno.getDni() %></td>
					      
					      <td><%=unAlumno.getTelefono() %></td>
					      <td><%=unAlumno.getMail() %></td>
					      <td><%=unAlumno.getIdCursos() %></td>
					      <td><%=unAlumno.getIdTurnos() %></td>
					      <td>
					      	<a class="btn btn-danger" href="<%=request.getContextPath()%>/api/EliminarController?id=<%=unAlumno.getId()%>" role="button">Eliminar</a> | 
					      	<a class="btn btn-secondary" href="<%=request.getContextPath()%>/Editar?id=<%=unAlumno.getId()%>" role="button">Editar</a>
					      </td>
					    </tr>
					   <%
					   	}
					   %>
					  </tbody>
					</table>
				</section>
			</div>
		</main>
	</body>	
</html>