package ar.com.codoacodo.controllers;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import ar.com.codoacodo.daos.AlumnosDAO;
import ar.com.codoacodo.dto.Alumno;








@WebServlet("/Editar")
public class Editar extends HttpServlet {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String id = req.getParameter("id");
		
		//Crear ProductoDAO
		AlumnosDAO dao = new AlumnosDAO();
		
		
		Alumno alumnos = dao.obtenerPorId(Integer.parseInt(id));
		
		
		req.setAttribute("alumnos", alumnos);
		
		//ir a la siguiente pagina
		getServletContext().getRequestDispatcher("/editar.jsp").forward(req, resp);
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String nombre= req.getParameter("nombre");
		String id= req.getParameter("id");
	    String telefono = req.getParameter("telefono");
		String mail= req.getParameter("mail");
		
		
		//Crear ProductoDAO
		AlumnosDAO dao = new AlumnosDAO();
		
		//invocar actualizarProducto(params)
		dao.actualizarAlumno(Integer.parseInt(id),Integer.parseInt(telefono), mail);

		//ir a la siguiente pagina
		resp.sendRedirect(req.getContextPath()+"/lista");
	}
}


