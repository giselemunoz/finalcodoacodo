package ar.com.codoacodo.controllers;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import ar.com.codoacodo.daos.AlumnosDAO;

import ar.com.codoacodo.dto.Alumno;



@WebServlet(name = "lista", urlPatterns = {"/lista"})
public class ListadoController extends HttpServlet {
	
	private static final long serialVersionUID = 796462305726750310L;
	public ListadoController() { 
	super();}

	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		
		AlumnosDAO dao = new AlumnosDAO();
		
		//invocar al metodo listarProductos()
		List<Alumno> listado = dao.listarAlumnos();
		
		//grabar el listado en el request para que lo vea la siguiente pagina
		req.setAttribute("listado", listado);
		
		//ir a la siguiente pagina
		getServletContext().getRequestDispatcher("/listado.jsp").forward(req, resp);
	}
}

