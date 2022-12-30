package ar.com.codoacodo.daos;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import java.util.List;

import ar.com.codoacodo.connection.AdministradorDeConexiones;
import ar.com.codoacodo.dto.Alumno;


public class AlumnosDAO {

public Alumno obtenerPorId(int id) {
	    Alumno alumnos = null;
	    
	    
		try {
			alumnos = new Alumno();
			
			Connection con = AdministradorDeConexiones.getConnection();
			String sql = "SELECT * FROM ALUMNOS WHERE ID="+id;
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery(sql);
			
			
			if(rs.next()) {
				alumnos.setId(rs.getInt("id"));
				alumnos.setNombre(rs.getString("nombre"));
				alumnos.setTelefono(rs.getInt("telefono"));
				alumnos.setMail(rs.getString("mail"));
			}		
		} catch (SQLException e) {
			// ERRORES
			e.printStackTrace();
		}
		return alumnos;
		
	}
	

	
	public List<Alumno> listarAlumnos() {
		String sql = "SELECT * FROM ALUMNOS ";
		Connection con = AdministradorDeConexiones.getConnection();
		List<Alumno> list = new ArrayList<>();
		try {
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery(sql);
			while(rs.next()) {
				int id = rs.getInt(1);
				String nombre = rs.getString(2);
				String apellido = rs.getString(3);
				int dni = rs.getInt(4);
				int telefono= rs.getInt(5);
				String mail = rs.getString(6);
				int idCursos= rs.getInt(7);
				int idTurnos= rs.getInt(8);
				
				Alumno alumnos = new Alumno(id,nombre,apellido,dni,telefono,mail,idCursos,idTurnos);
				
				
				list.add(alumnos);
			}			
			
			
			/*con.close();*/
		} catch (SQLException e) {
			// ERRORES
			e.printStackTrace();
		}
		return list;
	}

	

	
	public void crearAlumno(String nombre, String apellido, int dni, int telefono,String mail,int idCursos, int idTurnos) {
		
		Connection con = AdministradorDeConexiones.getConnection();
		
		
		if(con != null) { 
			
			String sql = "INSERT INTO alumnos (nombre,apellido,dni,telefono,mail,idCursos,idTurnos)";
			sql += "VALUES('"+nombre+"','"+apellido+"','"+dni+"','"+telefono+"','"+mail+"','"+idCursos+"','"+idTurnos+"')";
			
			try {
				Statement st = con.createStatement();			
				st.execute(sql);
				
				
			}catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
	
	
	

	public void actualizarAlumno(int id,int telefono, String mail) {
		Connection con = AdministradorDeConexiones.getConnection();
		if(con != null) { 
			String sql = "UPDATE alumnos "
					+ " set telefono='"+telefono+"',"
					+ " mail='"+mail+"'"
					+ " WHERE id = '"+id+"'"; 			
		
			try {
				Statement st = con.createStatement();			
				st.executeUpdate(sql);
				
				con.close();
				
			}catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
	
	
	public List<Alumno> buscar(int dni) {
		String sql = "SELECT * FROM alumnos WHERE dni LIKE '%"+dni+"%' ";
		Connection con = AdministradorDeConexiones.getConnection();
	    List<Alumno> listado = new ArrayList<Alumno>();
		try {
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery(sql);
			
			if(rs.next()) {
				int id = rs.getInt(1);
				String nombre = rs.getString(2);
				String apellido = rs.getString(3);
				int Dni = rs.getInt(4);
				int telefono = rs.getInt(5);
				String mail = rs.getString(6);
				int idCursos = rs.getInt(7);
				int idTurnos = rs.getInt(8);
				Alumno alumnos = new Alumno(id,nombre,apellido,Dni,telefono,mail,idCursos,idTurnos);
				listado.add(alumnos);
			}			
		} catch (SQLException e) {
			// ERRORES
			e.printStackTrace();
		}
		
		return listado;
	
}
}
