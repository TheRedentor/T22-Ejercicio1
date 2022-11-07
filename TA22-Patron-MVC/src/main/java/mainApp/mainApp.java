package mainApp;
import java.io.FileNotFoundException;
import java.sql.SQLException;
import controllers.Controlador;
import models.Modelo;
import views.Vista;



public class mainApp {
    public static void main( String[] args ) throws FileNotFoundException, SQLException {
    		Modelo modelo = new Modelo();
        	modelo.createDB();
        	
        	Vista vista = new Vista();

    		Controlador controlador = new Controlador(modelo, vista);
    		vista.setVisible(true);
   
    }
}
