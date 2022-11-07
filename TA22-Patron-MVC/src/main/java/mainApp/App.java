package mainApp;
import java.io.FileNotFoundException;
import java.sql.SQLException;

import controllers.Controlador;
import models.Modelo;
import views.Vista;
/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws FileNotFoundException, SQLException
    {
    	Modelo modelo = new Modelo();
    	modelo.createDB();
    	Vista vista = new Vista();
    	vista.setVisible(true);
    	
    	//Controlador aux = new Controlador(modelo,vista);
    	
    	//aux.iniciarVista();
    }
}
