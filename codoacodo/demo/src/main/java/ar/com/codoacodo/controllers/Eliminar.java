package ar.com.codoacodo.controllers;

import java.io.IOException;
import java.sql.Connection;
import java.sql.Statement;



import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import ar.com.codoacodo.connection.AdministradorDeConexiones;



@WebServlet("/api/EliminarController")
public class Eliminar extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = -7351572612448648707L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
			
		String id = req.getParameter("id");
		
		Connection con = AdministradorDeConexiones.getConnection();
		
		if(con != null) { 
			
			String sql = "DELETE FROM Alumnos WHERE id="+id;
			
			try {
				Statement st = con.createStatement();			
				st.executeUpdate(sql);
				
				con.close();
				
				resp.sendRedirect(req.getContextPath()+"/lista");
			}catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}
