package controllers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JPanel;

import models.Modelo;
import views.Vista;

public class Controlador implements ActionListener {

	private Modelo modelo;
	private Vista vista;
	private JPanel vista_create, vista_delete, vista_update, vista_read;
	
	public Controlador(Modelo modelo, Vista vista) {
			this.modelo=modelo;
			this.vista=vista;
			this.vista.boton_create.addActionListener(this);
			this.vista.boton_delete.addActionListener(this);
			this.vista.boton_read.addActionListener(this);
			this.vista.boton_update.addActionListener(this);
			this.vista.boton_borrar.addActionListener(this);
			this.vista.boton_guardar.addActionListener(this);
			this.vista.boton_guardar1.addActionListener(this);
		}

	
	public void actionPerformed(ActionEvent evento) {
		if(vista.boton_create == evento.getSource()) {
			try {
				vista.textArea.setText(null);
				
				vista.createNombreField.setText("");
				vista.createApellidoField.setText("");
				vista.createDireccionField.setText("");
				vista.createDniField.setText("");
				vista.createFechaField.setText("");

				vista.vista_create.setVisible(true);
				vista.vista_delete.setVisible(false);
				vista.vista_update.setVisible(false);
				vista.vista_read.setVisible(false);
			} catch (Exception e) {
				System.out.println(e);
			}
			
		}
		
		if(vista.boton_delete == evento.getSource()) {
			try {
				vista.textArea.setText(null);
				
				vista.vista_create.setVisible(false);
				vista.vista_delete.setVisible(true);
				vista.vista_update.setVisible(false);
				vista.vista_read.setVisible(false);
			} catch (Exception e) {
				
			}
		}
		
		if(vista.boton_update == evento.getSource()) {
			try {
				vista.textArea.setText(null);
				
				vista.textArea.setText(null);
				vista.editNombreField.setText("");
				vista.editApellidoField.setText("");
				vista.editDireccionField.setText("");
				vista.editDniField.setText("");
				vista.editFechaField.setText("");
				
				vista.vista_create.setVisible(false);
				vista.vista_delete.setVisible(false);
				vista.vista_update.setVisible(true);
				vista.vista_read.setVisible(false);
			} catch (Exception e) {
			}
		}
		
		if(vista.boton_read == evento.getSource()) {
			try {
				vista.textArea.setText(null);
				
				vista.vista_create.setVisible(false);
				vista.vista_delete.setVisible(false);
				vista.vista_update.setVisible(false);
				vista.vista_read.setVisible(true);
				ArrayList<String> text = this.modelo.read();
				for (int i = 0; i < text.size(); i++) {
					vista.textArea.append(text.get(i)+"\n");
				}
			} catch (Exception e) {
			}
		}
		
		
		if(vista.boton_guardar == evento.getSource()) {
			String nombre,apellido,fecha,direccion;
			int dni;
			
			nombre=this.vista.createNombreField.getText();
			apellido=this.vista.createApellidoField.getText();
			direccion = this.vista.createDireccionField.getText();
			dni=Integer.parseInt(this.vista.createDniField.getText());
			fecha=this.vista.createFechaField.getText();
			try {
				this.modelo.create(nombre, apellido, direccion, dni, fecha);
			} catch (FileNotFoundException | SQLException e) {
				e.printStackTrace();
			}
			this.vista.vista_create.setVisible(false);
		}
		
		if(vista.boton_guardar1 == evento.getSource()) {
			
			String nombre,apellido,fecha,direccion,id;
			int dni;
			
			nombre=this.vista.editNombreField.getText();
			apellido=this.vista.editApellidoField.getText();
			direccion = this.vista.editDireccionField.getText();
			dni=Integer.parseInt(this.vista.editDniField.getText());
			fecha=this.vista.editFechaField.getText();
			id=this.vista.editIdField.getText();
			
			try {
				this.modelo.update("nombre",nombre,id);
				this.modelo.update("apellido",apellido,id);
				this.modelo.update("direccion",direccion,id);
				this.modelo.update("dni", String.valueOf(dni),id);
				this.modelo.update("fecha",fecha,id);
			} catch (FileNotFoundException | SQLException e) {
				e.printStackTrace();
			}
			
			this.vista.vista_update.setVisible(false);
		}
		
		if(vista.boton_borrar == evento.getSource()) {
			
			int id;
		
			id=Integer.parseInt(this.vista.deleteIdField.getText());
			try {
				this.modelo.delete(id,"id");
			} catch (FileNotFoundException | SQLException e) {
				e.printStackTrace();
			}
			this.vista.vista_delete.setVisible(false);
		}
	}
}
