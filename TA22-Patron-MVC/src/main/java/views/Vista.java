package views;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import java.awt.Font;
import javax.swing.JSeparator;
import javax.swing.SwingConstants;
import javax.swing.JLayeredPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JDesktopPane;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;

import java.awt.Color;

public class Vista extends JFrame {

	private static final long serialVersionUID = 1L;
	public JPanel contentPane, vista_create,vista_update, vista_read, vista_delete;
	public JTextField editNombreField, editApellidoField, editDireccionField, editDniField, editFechaField, editIdField;
	public JTextField createFechaField, createDniField, createApellidoField, createNombreField, createDireccionField;
	public JTextField deleteIdField;
	public JButton boton_update, boton_read, boton_create, boton_delete, boton_borrar, boton_guardar, boton_guardar1;
	public JTextArea textArea;
	private JLabel lblNewLabel_9;

	public Vista() {
		setTitle("Registro clientes");
		setLocationRelativeTo(null);
		setBounds(100, 100, 643, 568);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		
		
		/// ELEMENTOS VISTA_READ
		vista_read = new JPanel();
		vista_read.setLayout(null);
		vista_read.setBorder(new EmptyBorder(5, 5, 5, 5));
		vista_read.setBounds(292, 61, 325, 457);
		contentPane.add(vista_read);
		
		textArea = new JTextArea();
		textArea.setEditable(false);
		textArea.setBounds(20, 59, 282, 309);
		vista_read.add(textArea);
		
		JScrollPane scroll = new JScrollPane(textArea);
		scroll.setBounds(20, 59, 282, 309);
		vista_read.add(scroll);
		
		
		JLabel lblNewLabel_4_2 = new JLabel("Registro de usuarios:");
		lblNewLabel_4_2.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_4_2.setBounds(20, 25, 140, 14);
		vista_read.add(lblNewLabel_4_2);
		
		vista_read.setVisible(false);
		
		//ELEMENTOS VISTA UPDATE
		vista_update = new JPanel();
		vista_update.setLayout(null);
		vista_update.setBorder(new EmptyBorder(5, 5, 5, 5));
		vista_update.setBounds(292, 61, 325, 457);
		contentPane.add(vista_update);
		
		editNombreField = new JTextField();
		editNombreField.setBounds(62, 100, 86, 20);
		vista_update.add(editNombreField);
		editNombreField.setColumns(10);
		
		JLabel label1 = new JLabel("Nombre");
		label1.setBounds(52, 75, 71, 14);
		vista_update.add(label1);
		
		editApellidoField = new JTextField();
		editApellidoField.setBounds(62, 156, 86, 20);
		vista_update.add(editApellidoField);
		editApellidoField.setColumns(10);
		
		JLabel label2 = new JLabel("Apellido");
		label2.setBounds(52, 131, 86, 14);
		vista_update.add(label2);
		
		editDireccionField = new JTextField();
		editDireccionField.setBounds(62, 212, 86, 20);
		vista_update.add(editDireccionField);
		editDireccionField.setColumns(10);
		
		JLabel lblNewLabel_8 = new JLabel("Dirección");
		lblNewLabel_8.setBounds(52, 187, 86, 14);
		vista_update.add(lblNewLabel_8);
		
		editDniField = new JTextField();
		editDniField.setBounds(62, 268, 86, 20);
		vista_update.add(editDniField);
		editDniField.setColumns(10);
		
		JLabel label3 = new JLabel("DNI (sin letra)");
		label3.setBounds(52, 243, 96, 14);
		vista_update.add(label3);
		
		JLabel label4 = new JLabel("Fecha (YYYY/MM/DD)");
		label4.setBounds(52, 299, 118, 14);
		vista_update.add(label4);
		
		editFechaField = new JTextField();
		editFechaField.setBounds(62, 324, 86, 20);
		vista_update.add(editFechaField);
		editFechaField.setColumns(10);
		
		boton_guardar1 = new JButton("Guardar");
		boton_guardar1.setBounds(87, 355, 127, 40);
		vista_update.add(boton_guardar1);
		editIdField = new JTextField();
		editIdField.setBounds(141, 47, 86, 20);
		vista_update.add(editIdField);
		editIdField.setColumns(10);
		
		JLabel lblBuscaPorId = new JLabel("Busca por id*");
		lblBuscaPorId.setForeground(Color.RED);
		lblBuscaPorId.setBounds(52, 50, 118, 14);
		vista_update.add(lblBuscaPorId);
		
		lblNewLabel_9 = new JLabel("Actualizar usuario:");
		lblNewLabel_9.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_9.setBounds(53, 25, 134, 14);
		vista_update.add(lblNewLabel_9);
		
		vista_update.setVisible(false);
		
	
		// ELEMENTOS VISTA CREATE
		vista_create = new JPanel();
		vista_create.setLayout(null);
		vista_create.setBorder(new EmptyBorder(5, 5, 5, 5));
		vista_create.setBounds(300, 61, 317, 457);
		contentPane.add(vista_create);
		
		createNombreField = new JTextField();
		createNombreField.setBounds(63, 83, 86, 20);
		vista_create.add(createNombreField);
		createNombreField.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Nombre");
		lblNewLabel.setBounds(53, 58, 77, 14);
		vista_create.add(lblNewLabel);
		
		createApellidoField = new JTextField();
		createApellidoField.setBounds(63, 151, 86, 20);
		vista_create.add(createApellidoField);
		createApellidoField.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Apellidos");
		lblNewLabel_1.setBounds(53, 126, 77, 14);
		vista_create.add(lblNewLabel_1);
		
		createDniField = new JTextField();
		createDniField.setBounds(63, 263, 86, 20);
		vista_create.add(createDniField);
		createDniField.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("DNI (sin letra)");
		lblNewLabel_2.setBounds(53, 238, 77, 14);
		vista_create.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Fecha (YYYY/MM/DD)");
		lblNewLabel_3.setBounds(53, 294, 124, 14);
		vista_create.add(lblNewLabel_3);
		
		createFechaField = new JTextField();
		createFechaField.setBounds(63, 320, 86, 20);
		vista_create.add(createFechaField);
		createFechaField.setColumns(10);
		
		boton_guardar = new JButton("Guardar");
		boton_guardar.setBounds(94, 376, 127, 40);
		vista_create.add(boton_guardar);
		
		JLabel lblNewLabel_6 = new JLabel("Nuevo usuario");
		lblNewLabel_6.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_6.setBounds(106, 25, 91, 14);
		vista_create.add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("Dirección");
		lblNewLabel_7.setBounds(53, 182, 77, 14);
		vista_create.add(lblNewLabel_7);
		
		createDireccionField = new JTextField();
		createDireccionField.setBounds(63, 207, 86, 20);
		vista_create.add(createDireccionField);
		createDireccionField.setColumns(10);
		
		vista_create.setVisible(false);
		
		
		
		//// ELEMENTOS VISTA_DELETE
		vista_delete = new JPanel();
		vista_delete.setLayout(null);
		vista_delete.setBorder(new EmptyBorder(5, 5, 5, 5));
		vista_delete.setBounds(300, 61, 317, 457);
		contentPane.add(vista_delete);
		
		JLabel lblIdDelUsuario = new JLabel("Id del usuario:");
		lblIdDelUsuario.setBounds(82, 82, 105, 14);
		vista_delete.add(lblIdDelUsuario);
		
		deleteIdField = new JTextField();
		deleteIdField.setColumns(10);
		deleteIdField.setBounds(107, 131, 67, 20);
		vista_delete.add(deleteIdField);
		
		boton_borrar = new JButton("Eliminar");
		boton_borrar.setBounds(82, 223, 135, 44);
		vista_delete.add(boton_borrar);
		
		JLabel lblNewLabel_4_1 = new JLabel("Eliminar usuario");
		lblNewLabel_4_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_4_1.setBounds(27, 28, 110, 14);
		vista_delete.add(lblNewLabel_4_1);
		
		vista_delete.setVisible(false);
		
		JTextField textField_4;
		
		
		
		// BOTONES PANEL GENERAL
		boton_update = new JButton("Actualizar usuario");
		boton_update.setBounds(71, 287, 127, 40);
		contentPane.add(boton_update);
		
		boton_read = new JButton("Mostrar registro");
		boton_read.setBounds(71, 139, 127, 43);
		contentPane.add(boton_read);
		
		boton_create = new JButton("Crear usuario");
		boton_create.setBounds(71, 217, 127, 40);
		contentPane.add(boton_create);
		
		boton_delete = new JButton("Eliminar usuario");
		boton_delete.setBounds(71, 359, 127, 40);
		contentPane.add(boton_delete);
		
		JLabel lblNewLabel_4 = new JLabel("Opciones: ");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_4.setBounds(52, 87, 78, 14);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("REGISTRO DE CLIENTES");
		lblNewLabel_5.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_5.setBounds(223, 11, 158, 14);
		contentPane.add(lblNewLabel_5);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(287, 76, 67, 374);
		contentPane.add(separator);
		separator.setOrientation(SwingConstants.VERTICAL);
		
		
	}
}
