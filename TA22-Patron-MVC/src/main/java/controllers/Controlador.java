package controllers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;
import java.sql.SQLException;
import javax.swing.JFrame;

import models.Modelo;
import views.Vista;

public class Controlador implements ActionListener {

	private Modelo modelo;
	private Vista vista;
	
	public Controlador(Modelo modelo, Vista vista) {
			this.modelo=modelo;
			this.vista=vista;
			this.vista.boton_create.addActionListener(this);
			this.vista.boton_delete.addActionListener(this);
			this.vista.boton_read.addActionListener(this);
			this.vista.boton_update.addActionListener(this);
			this.vista.boton_borrar.addActionListener(this);
			this.vista.boton_salir.addActionListener(this);
		}

	
	public void iniciarVista() {
		
		vista.setTitle("Registro Clientes");
		vista.pack();
		vista.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		vista.setLocationRelativeTo(null);
		vista.setVisible(true);
	}
	
	public void actionPerformed(ActionEvent evento) {
			if(vista.boton_create == evento.getSource()) {
				try {
					vista.vista_create.setVisible(true);
					vista.vista_delete.setVisible(false);
					vista.vista_update.setVisible(false);
					vista.vista_read.setVisible(false);
				} catch (Exception e) {
				}
				
			}
			
			if(vista.boton_delete == evento.getSource()) {
				vista.vista_create.setVisible(false);
				vista.vista_delete.setVisible(true);
				vista.vista_update.setVisible(false);
				vista.vista_read.setVisible(false);
			}
			
			if(vista.boton_update == evento.getSource()) {
				vista.vista_create.setVisible(false);
				vista.vista_delete.setVisible(false);
				vista.vista_update.setVisible(true);
				vista.vista_read.setVisible(false);
			}
			
			if(vista.boton_read == evento.getSource()) {
				vista.vista_create.setVisible(false);
				vista.vista_delete.setVisible(false);
				vista.vista_update.setVisible(false);
				vista.vista_read.setVisible(true);
			}
			
			if(vista.boton_guardar == evento.getSource()) {
				String nombre,apellido,fecha;
				int dni;
				
				nombre=this.vista.textField.getText();
				apellido=this.vista.textField_1.getText();
				dni=Integer.parseInt(this.vista.textField_2.getText());
				fecha=this.vista.textField_3.getText();
				try {
					this.modelo.create(nombre, apellido, apellido, dni, fecha);
				} catch (FileNotFoundException | SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				this.vista.vista_create.setVisible(false);
			}
			
			if(vista.boton_guardar1 == evento.getSource()) {
				
				String nombre,apellido,fecha,id,dni;
				
				nombre=this.vista.textField.getText();
				apellido=this.vista.textField_1.getText();
				dni=this.vista.textField_2.getText();
				fecha=this.vista.textField_3.getText();
				id=this.vista.textField_3.getText();
				
				try {
					this.modelo.update("nombre",nombre,id);
					this.modelo.update("apellido",apellido,id);
					this.modelo.update("dni",dni,id);
					this.modelo.update("fecha",fecha,id);
				} catch (FileNotFoundException | SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				this.vista.vista_update.setVisible(false);
			}
			
			if(vista.boton_borrar == evento.getSource()) {
				
				int id;
			
				id=Integer.parseInt(this.vista.textField_4.getText());
				try {
					this.modelo.delete(id,"id");
				} catch (FileNotFoundException | SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				this.vista.vista_delete.setVisible(false);
			}
	}
}
