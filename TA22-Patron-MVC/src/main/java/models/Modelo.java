package models;
import java.io.FileNotFoundException;
import java.sql.SQLException;

import conexion.Conexion;

public class Modelo {
	
	private int id;
	private String nombre;
	private String apellido;
	private String direccion;
	private int dni;
	private String fecha;
	private Conexion conexion = new Conexion();


	public Modelo() {
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
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public int getDni() {
		return dni;
	}
	public void setDni(int dni) {
		this.dni = dni;
	}
	public String getFecha() {
		return fecha;
	}
	public void setFecha(String fecha) {
		this.fecha = fecha;
	}
	
	
	public void create(String nombre, String apellido, String direccion, int dni, String fecha) throws FileNotFoundException, SQLException {
		conexion.create_connection();
		conexion.insertData("T22_1","INSERT INTO Clientes (nombre, apellido, direccion, dni, fecha) VALUE("+nombre+", "+apellido+", "+direccion+", "+dni+", "+fecha+")");
		conexion.closeConnection();
	}
	
	public void read(int id, String nombre, String apellido, String direccion, int dni, String fecha) throws SQLException, FileNotFoundException {
		conexion.create_connection();
		conexion.readData("T22_1","Clientes");
		conexion.closeConnection();
	}
	
	public void update(String campo, String condicion, String campo_cambiado) throws FileNotFoundException, SQLException {
		conexion.create_connection();
		conexion.updateData("T22_1","Clientes",campo,campo_cambiado,condicion);
		conexion.closeConnection();
	}
	
	public void delete(int id, String primarykey) throws FileNotFoundException, SQLException {
		conexion.create_connection();
		conexion.deleteData("T22_1","Clientes", primarykey, id);
		conexion.closeConnection();
	}
	
	public void createDB() throws FileNotFoundException, SQLException {
		
		conexion.create_connection();
		conexion.createDB("T22_1");
		conexion.createTable("T22_1", "CREATE TABLE Clientes (id INT AUTO_INCREMENT, nombre CHAR(250), apellido CHAR(250), direccion CHAR(250), dni INT, fecha DATE, PRIMARY KEY (id))");
		conexion.closeConnection();

	}

}
