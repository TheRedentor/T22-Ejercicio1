package conexion;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import javax.swing.JOptionPane;
import com.sun.istack.internal.logging.Logger;
import java.sql.DriverManager;
	
public class Conexion {
		
	private Connection connect;
	
	public Conexion() {
		
	}
	
	private String[] readDataFile() throws FileNotFoundException {
        String[] text= new String[3];
        FileReader file = new FileReader("src/conection.txt");
        BufferedReader buffer = new BufferedReader(file);
        try {
            text[0]=buffer.readLine();
            text[1]=buffer.readLine();
            text[2]=buffer.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return text;
    }
		
		
	public void create_connection() throws FileNotFoundException {
        String[] data=readDataFile();
		
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connect=DriverManager.getConnection(data[0],data[1],data[2]);
        }catch(SQLException|ClassNotFoundException ex) {
            System.out.println("No se ha podido conectar con la base de datos");
            System.out.println(ex);
        }

    }
		
		public void closeConnection() {
			try {
				connect.close();
			} catch (SQLException ex) {
				Logger.getLogger(Conexion.class.getName(), null).log(Level.SEVERE,null,ex);
			}
		}
		
		
		
		public void createDB(String name) throws FileNotFoundException {
			try {
				String Query = "CREATE DATABASE " + name;
				Statement st = connect.createStatement();
				st.executeUpdate(Query);
				//MySQLConnection();
				JOptionPane.showMessageDialog(null," Created database " + name + "successfully ");
			} catch (SQLException ex) {
			}
		}
		
		
		
		public void createTable(String db, String query) throws SQLException {
		try {
			String Querydb = "USE "+db+";";
			Statement stdb= connect.createStatement();
			stdb.executeUpdate(Querydb);
			
			Statement st = connect.createStatement();
			st.executeUpdate(query);
			System.out.println("Table created");
			
		}catch (SQLException sqlException) {
		}
			
		}
		
		public void insertData(String db, String query) throws SQLException {
			try {
				String Querydb= "USE "+db+";";
				Statement stdb = connect.createStatement();
				stdb.executeUpdate(Querydb);
				
				Statement st = connect.createStatement();
				st.executeUpdate(query);
				
				JOptionPane.showMessageDialog(null, "Usuario creado correctamente");
			} catch (Exception e) {
				JOptionPane.showMessageDialog(null, "Error al crear el usuario.");

			}
			
		}
		
		public void updateData(String db, String table_name, String modif_columna, String campo_cambiado, String condicion) throws SQLException {
		    try {
	            String Queryd = "USE "+db+";";
	            Statement stdb = connect.createStatement();
	            stdb.executeUpdate(Queryd);

	            String Query = "UPDATE "+table_name+" SET "+ modif_columna +" = '"+campo_cambiado+"' WHERE id = "+condicion;
	            System.out.println(Query);
	            Statement st = connect.createStatement();
	            st.executeUpdate(Query);
	            JOptionPane.showMessageDialog(null, "Usuario modificado con ??xito.");
	        } catch (SQLException ex) {
	            System.out.println(ex.getMessage());
	            JOptionPane.showMessageDialog(null, "Error al modificar el usuario especificado.");
	        }
		}
		
		public void deleteData(String db, String table_name, String primaryKey, int ID) throws SQLException {
			 try {
		            String Queryd = "USE "+db+";";
		            Statement stdb = connect.createStatement();
		            stdb.executeUpdate(Queryd);

		            String Query = "DELETE FROM "+table_name+" WHERE "+primaryKey+" = "+ID;
		            Statement st = connect.createStatement();
		            st.executeUpdate(Query);
		            JOptionPane.showMessageDialog(null, "Usuario borrado con ??xito.");
		        } catch (SQLException ex) {
		            System.out.println(ex.getMessage());
		            JOptionPane.showMessageDialog(null, "Error al borrar el usuario especificado, compruebe su ID.");
		        }
		}
		
		public ArrayList<String> readData(String db, String table_name) throws SQLException {
			
			ArrayList<String> text = new ArrayList<String>();
			
			try {
	            String Queryd = "USE "+db+";";
	            Statement stdb = connect.createStatement();
	            stdb.executeUpdate(Queryd);
	            
	            String Query = "SELECT * FROM " + table_name;
	            Statement st = connect.createStatement();
	            java.sql.ResultSet resultSet;
	            resultSet = st.executeQuery(Query);
	            while (resultSet.next()) {
	                text.add("ID: "+ resultSet.getString("id")+" "
	                		+ "Nombre: "+ resultSet.getString("nombre")+" "
	                		+ "Apellido: "+ resultSet.getString("apellido")+" "
	                		+ "Direcci??n: "+ resultSet.getString("direccion")+" "
	                		+ "DNI: "+ resultSet.getString("dni")+" "
	                        + "Fecha: "+ resultSet.getString("fecha"));
	            }

	        } catch (SQLException ex) {
	            System.out.println(ex.getMessage());
	            JOptionPane.showMessageDialog(null, "Error en la adquisici??n de datos.");
	        }
			
			return text;
	    }
		
		
		
	}