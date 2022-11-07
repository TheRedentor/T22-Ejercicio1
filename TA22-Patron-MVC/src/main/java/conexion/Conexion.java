package conexion;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;

import javax.swing.JOptionPane;

import com.sun.istack.internal.logging.Logger;
import java.sql.DriverManager;
	
public class Conexion {
		
	private Connection connect;
	
	public Conexion() {
		
	}
	
	private String[] readData() throws FileNotFoundException {
        // Método que lee los datos de un txt. text[0]=URL, text[1]=name, text[2]=password
        String[] text= new String[3];
        FileReader file = new FileReader("src/conection.txt");
        BufferedReader buffer = new BufferedReader(file);
        try {
            text[0]=buffer.readLine();
            text[1]=buffer.readLine();
            text[2]=buffer.readLine();
        } catch (IOException e) {
            // Si no hay archivo error
            e.printStackTrace();
        }
        return text;
    }
		
		
	public void create_connection() throws FileNotFoundException {
        String[] data=readData();
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connect=DriverManager.getConnection(data[0],data[1],data[2]);
            System.out.println("Server connected");
        }catch(SQLException|ClassNotFoundException ex) {
            System.out.println("No se ha podido conectar con la base de datos");
            System.out.println(ex);
        }

    }
		
		public void closeConnection() {
			try {
				connect.close();
				JOptionPane.showMessageDialog(null, "Connection is closed with the server");
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
				System.out.println("We can't create DB");
			}
		}
		
		public void createTable(String db, String query) throws SQLException {
			
			String Querydb = "USE "+db+";";
			Statement stdb= connect.createStatement();
			stdb.executeUpdate(Querydb);
			
			Statement st = connect.createStatement();
			st.executeUpdate(query);
			System.out.println("Table created");
			
		}
		
		public void insertData(String db, String query) throws SQLException {
			String Querydb= "USE "+db+";";
			Statement stdb = connect.createStatement();
			stdb.executeUpdate(Querydb);
			
			Statement st = connect.createStatement();
			st.executeUpdate(query);
			
			System.out.println("Inserted data complete!");
		}
		
		public void updateData(String db, String query) throws SQLException {
			String Querydb= "UPDATE "+db+";";
			Statement stdb = connect.createStatement();
			stdb.executeUpdate(Querydb);
			
			Statement st = connect.createStatement();
			st.executeUpdate(query);
			
			System.out.println("Inserted data complete!");
		}
		
		public void deleteData(String db, String query) throws SQLException {
			String Querydb= "DELETE "+db+";";
			Statement stdb = connect.createStatement();
			stdb.executeUpdate(Querydb);
			
			Statement st = connect.createStatement();
			st.executeUpdate(query);
			
			System.out.println("Inserted data complete!");
		}
		
		
	}