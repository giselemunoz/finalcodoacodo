package ar.com.codoacodo.controllers;

import java.io.IOException;

import ar.com.codoacodo.daos.AlumnosDAO;
import jakarta.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/AltaController")
public class AltaController extends HttpServlet {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException {

		String nombre = req.getParameter("nombre");
		String apellido = req.getParameter("apellido");
		String dni = req.getParameter("dni");
		String telefono = req.getParameter("telefono");
		String mail= req.getParameter("mail");
		String idCursos= req.getParameter("idCursos");
		String idTurnos= req.getParameter("idTurnos");
		
		//crear ProductoDAO
		AlumnosDAO dao = new AlumnosDAO();
		
		//ejecutar el metodo crearProducto(parametros...)
		dao.crearAlumno(nombre, apellido,Integer.parseInt(dni),Integer.parseInt(telefono),mail,Integer.parseInt(idCursos),Integer.parseInt(idTurnos));
		
		//ctrl+shit+o
		//ir a la siguiente pagina
		resp.sendRedirect(req.getContextPath()+"/lista");
	}
}
