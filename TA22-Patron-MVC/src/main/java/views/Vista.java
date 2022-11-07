package views;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JTextArea;

public class Vista extends JFrame {

	public JPanel contentPane,vista_create,vista_update, vista_read, vista_delete;
	public JTextField textField;
	public JTextField textField_1;
	public JTextField textField_2;
	public JTextField textField_3;
	public JTextField textField_4;
	public JButton boton_update, boton_read, boton_create, boton_delete,boton_borrar,boton_guardar,boton_salir,boton_guardar1;

	public Vista() {
		
		setBounds(100, 100, 643, 568);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		
		
		// ELEMENTOS VISTA CREATE
		
		JPanel vista_create = new JPanel();
		vista_create.setLayout(null);
		vista_create.setBorder(new EmptyBorder(5, 5, 5, 5));
		vista_create.setBounds(272, 11, 345, 507);
		contentPane.add(vista_create);
		
		textField = new JTextField();
		textField.setBounds(37, 55, 86, 20);
		vista_create.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Nombre");
		lblNewLabel.setBounds(37, 30, 46, 14);
		vista_create.add(lblNewLabel);
		
		textField_1 = new JTextField();
		textField_1.setBounds(37, 111, 86, 20);
		vista_create.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Apellido");
		lblNewLabel_1.setBounds(37, 86, 46, 14);
		vista_create.add(lblNewLabel_1);
		
		textField_2 = new JTextField();
		textField_2.setBounds(37, 167, 86, 20);
		vista_create.add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("DNI");
		lblNewLabel_2.setBounds(37, 142, 46, 14);
		vista_create.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Fecha");
		lblNewLabel_3.setBounds(37, 198, 46, 14);
		vista_create.add(lblNewLabel_3);
		
		textField_3 = new JTextField();
		textField_3.setBounds(37, 223, 86, 20);
		vista_create.add(textField_3);
		textField_3.setColumns(10);
		
		JButton boton_guardar = new JButton("Guardar");
		boton_guardar.setBounds(91, 299, 147, 73);
		vista_create.add(boton_guardar);
		
		
		
		
		
		//ELEMENTOS VISTA UPDATE
		
		JPanel vista_update = new JPanel();
		vista_update.setLayout(null);
		vista_update.setBorder(new EmptyBorder(5, 5, 5, 5));
		vista_update.setBounds(272, 11, 345, 507);
		contentPane.add(vista_update);
		
		textField = new JTextField();
		textField.setBounds(37, 55, 86, 20);
		vista_update.add(textField);
		textField.setColumns(10);
		
		JLabel label1 = new JLabel("Nombre");
		label1.setBounds(37, 30, 46, 14);
		vista_update.add(label1);
		
		textField_1 = new JTextField();
		textField_1.setBounds(37, 111, 86, 20);
		vista_update.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel label2 = new JLabel("Apellido");
		label2.setBounds(37, 86, 46, 14);
		vista_update.add(label2);
		
		textField_2 = new JTextField();
		textField_2.setBounds(37, 167, 86, 20);
		vista_update.add(textField_2);
		textField_2.setColumns(10);
		
		JLabel label3 = new JLabel("DNI");
		label3.setBounds(37, 142, 46, 14);
		vista_update.add(label3);
		
		JLabel label4 = new JLabel("Fecha");
		label4.setBounds(37, 198, 46, 14);
		vista_update.add(label4);
		
		textField_3 = new JTextField();
		textField_3.setBounds(37, 223, 86, 20);
		vista_update.add(textField_3);
		textField_3.setColumns(10);
		
		JButton boton_guardar1 = new JButton("Guardar");
		boton_guardar1.setBounds(91, 299, 147, 73);
		vista_update.add(boton_guardar1);
		
		JTextField textField_4 = new JTextField();
		textField_4.setBounds(196, 55, 86, 20);
		vista_update.add(textField_4);
		textField_4.setColumns(10);
		
		JLabel label_id = new JLabel("Id");
		label_id.setBounds(196, 30, 46, 14);
		vista_update.add(label_id);
		
		
		
		
		
		
		/// ELEMENTOS VISTA_READ
		
		JPanel vista_read = new JPanel();
		vista_read.setLayout(null);
		vista_read.setBorder(new EmptyBorder(5, 5, 5, 5));
		vista_read.setBounds(272, 11, 345, 507);
		contentPane.add(vista_read);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(20, 0, 315, 289);
		vista_read.add(textArea);
		
		JButton boton_salir = new JButton("Salir");
		boton_salir.setBounds(97, 299, 147, 73);
		vista_read.add(boton_salir);
		
		
		
		
		
		//// ELEMENTOS VISTA_DELETE
		
		
		JPanel vista_delete = new JPanel();
		vista_delete.setLayout(null);
		vista_delete.setBorder(new EmptyBorder(5, 5, 5, 5));
		vista_delete.setBounds(272, 11, 345, 507);
		contentPane.add(vista_delete);
		
		textField_4 = new JTextField();
		textField_4.setBounds(196, 55, 86, 20);
		vista_update.add(textField_4);
		textField_4.setColumns(10);
		
		JLabel label_id_2 = new JLabel("Id");
		label_id_2.setBounds(196, 30, 46, 14);
		vista_delete.add(label_id_2);
		
		
		
		
		
		// BOTONES PANEL GENERAL
		
		
		JButton boton_update = new JButton("Update");
		boton_update.setBounds(50, 361, 89, 23);
		contentPane.add(boton_update);
		
		JButton boton_read = new JButton("Read");
		boton_read.setBounds(50, 281, 89, 23);
		contentPane.add(boton_read);
		
		JButton boton_create = new JButton("Create");
		boton_create.setBounds(50, 212, 89, 23);
		contentPane.add(boton_create);
		
		JButton boton_delete = new JButton("Delete");
		boton_delete.setBounds(50, 457, 89, 23);
		contentPane.add(boton_delete);
	}
}
