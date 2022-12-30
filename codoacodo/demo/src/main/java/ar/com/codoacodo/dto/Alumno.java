package ar.com.codoacodo.dto;



public class Alumno {
	
	private int id; 
	private String nombre;
	private String apellido;
	private int dni; 
	private int telefono; 
	private String mail;
	private int idCursos; 
	private int idTurnos;
	
	
	public Alumno(int dni, int telefono, String mail) {
		super();
		this.dni = dni;
		this.telefono = telefono;
		this.mail = mail;
	}
	public Alumno(int id, String nombre, String apellido, int dni, int telefono, String mail, int idCursos,
			int idTurnos) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.apellido = apellido;
		this.dni = dni;
		this.telefono = telefono;
		this.mail = mail;
		this.idCursos = idCursos;
		this.idTurnos = idTurnos;
	}
	public Alumno() {
		super();
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public int getDni() {
		return dni;
	}
	public void setDni(int dni) {
		this.dni = dni;
	}
	public int getTelefono() {
		return telefono;
	}
	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}
	public String getMail() {
		return mail;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}
	public int getIdCursos() {
		return idCursos;
	}
	public void setIdCursos(int idCursos) {
		this.idCursos = idCursos;
	}
	public int getIdTurnos() {
		return idTurnos;
	}
	public void setIdTurnos(int idTurnos) {
		this.idTurnos = idTurnos;
	} 
	@Override
	public String toString() {
		return "Alumno [id=" + id + ", nombre=" + nombre + ", apellido=" + apellido + ", dni=" + dni + ", telefono="
				+ telefono + ", mail=" + mail + ", idCursos=" + idCursos + ", idTurnos=" + idTurnos + "]";
	}
	public int getIdClases() {
		// TODO Auto-generated method stub
		return 0;
	}
	

}
