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





@WebServlet("/api/BuscarController")
public class BuscarController extends HttpServlet {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String dni = req.getParameter("dni");
		AlumnosDAO dao = new AlumnosDAO();
		
		List<Alumno> listado = dao.buscar(Integer.parseInt(dni));
		req.setAttribute("listado", listado);
		getServletContext().getRequestDispatcher("/listado.jsp").forward(req, resp);
	}
}
