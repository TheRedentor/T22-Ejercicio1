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

public class Vista extends JFrame {

	private static final long serialVersionUID = 1L;
	public JPanel contentPane, vista_create,vista_update, vista_read, vista_delete;
	public JTextField editNombreField, editApellidoField, editDireccionField, editDniField, editFechaField, editIdField;
	public JTextField createFechaField, createDniField, createApellidoField, createNombreField, createDireccionField;
	public JTextField deleteIdField;
	public JButton boton_update, boton_read, boton_create, boton_delete, boton_borrar, boton_guardar, boton_salir, boton_guardar1;
	public JTextArea textArea;

	public Vista() {
		
		setTitle("Registro clientes");
		setLocationRelativeTo(null);
		setBounds(100, 100, 643, 568);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
	
		// ELEMENTOS VISTA CREATE
		
		vista_create = new JPanel();
		vista_create.setLayout(null);
		vista_create.setBorder(new EmptyBorder(5, 5, 5, 5));
		vista_create.setBounds(272, 61, 345, 457);
		contentPane.add(vista_create);
		
		createNombreField = new JTextField();
		createNombreField.setBounds(77, 83, 86, 20);
		vista_create.add(createNombreField);
		createNombreField.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Nombre");
		lblNewLabel.setBounds(77, 58, 46, 14);
		vista_create.add(lblNewLabel);
		
		createApellidoField = new JTextField();
		createApellidoField.setBounds(77, 151, 86, 20);
		vista_create.add(createApellidoField);
		createApellidoField.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Apellido");
		lblNewLabel_1.setBounds(77, 126, 46, 14);
		vista_create.add(lblNewLabel_1);
		
		createDniField = new JTextField();
		createDniField.setBounds(77, 263, 86, 20);
		vista_create.add(createDniField);
		createDniField.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("DNI");
		lblNewLabel_2.setBounds(77, 238, 46, 14);
		vista_create.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Fecha");
		lblNewLabel_3.setBounds(77, 294, 46, 14);
		vista_create.add(lblNewLabel_3);
		
		createFechaField = new JTextField();
		createFechaField.setBounds(77, 319, 86, 20);
		vista_create.add(createFechaField);
		createFechaField.setColumns(10);
		
		boton_guardar = new JButton("Guardar");
		boton_guardar.setBounds(94, 376, 124, 46);
		vista_create.add(boton_guardar);
		
		JLabel lblNewLabel_6 = new JLabel("Nuevo usuario");
		lblNewLabel_6.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_6.setBounds(141, 25, 91, 14);
		vista_create.add(lblNewLabel_6);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(10, 11, 40, 406);
		vista_create.add(separator);
		separator.setOrientation(SwingConstants.VERTICAL);
		
		JLabel lblNewLabel_7 = new JLabel("Dirección");
		lblNewLabel_7.setBounds(77, 182, 46, 14);
		vista_create.add(lblNewLabel_7);
		
		createDireccionField = new JTextField();
		createDireccionField.setBounds(77, 207, 86, 20);
		vista_create.add(createDireccionField);
		createDireccionField.setColumns(10);
		
		
		vista_create.setVisible(false);
		
		
		
		
		
		//ELEMENTOS VISTA UPDATE
		
		vista_update = new JPanel();
		//vista_update.setVisible(false);
		vista_update.setLayout(null);
		vista_update.setBorder(new EmptyBorder(5, 5, 5, 5));
		vista_update.setBounds(272, 61, 345, 457);
		contentPane.add(vista_update);
		
		editNombreField = new JTextField();
		editNombreField.setBounds(37, 55, 86, 20);
		vista_update.add(editNombreField);
		editNombreField.setColumns(10);
		
		JLabel label1 = new JLabel("Nombre");
		label1.setBounds(37, 30, 46, 14);
		vista_update.add(label1);
		
		editApellidoField = new JTextField();
		editApellidoField.setBounds(37, 111, 86, 20);
		vista_update.add(editApellidoField);
		editApellidoField.setColumns(10);
		
		JLabel label2 = new JLabel("Apellido");
		label2.setBounds(37, 86, 46, 14);
		vista_update.add(label2);
		
		editDireccionField = new JTextField();
		editDireccionField.setBounds(37, 167, 86, 20);
		vista_update.add(editDireccionField);
		editDireccionField.setColumns(10);
		
		JLabel lblNewLabel_8 = new JLabel("Dirección");
		lblNewLabel_8.setBounds(37, 142, 46, 14);
		vista_update.add(lblNewLabel_8);
		
		editDniField = new JTextField();
		editDniField.setBounds(37, 223, 86, 20);
		vista_update.add(editDniField);
		editDniField.setColumns(10);
		
		JLabel label3 = new JLabel("DNI");
		label3.setBounds(37, 198, 46, 14);
		vista_update.add(label3);
		
		JLabel label4 = new JLabel("Fecha");
		label4.setBounds(37, 254, 46, 14);
		vista_update.add(label4);
		
		editFechaField = new JTextField();
		editFechaField.setBounds(37, 279, 86, 20);
		vista_update.add(editFechaField);
		editFechaField.setColumns(10);
		
		boton_guardar1 = new JButton("Guardar");
		boton_guardar1.setBounds(91, 299, 147, 73);
		vista_update.add(boton_guardar1);
		
		JTextField textField_4;
		editIdField = new JTextField();
		editIdField.setBounds(196, 55, 86, 20);
		vista_update.add(editIdField);
		editIdField.setColumns(10);
		
		JLabel label_id = new JLabel("Id");
		label_id.setBounds(196, 30, 46, 14);
		vista_update.add(label_id);
		
		vista_update.setVisible(false);
		
		
		
		
		/// ELEMENTOS VISTA_READ
		
		vista_read = new JPanel();
		//vista_read.setVisible(false);
		vista_read.setLayout(null);
		vista_read.setBorder(new EmptyBorder(5, 5, 5, 5));
		vista_read.setBounds(272, 61, 345, 457);
		contentPane.add(vista_read);
		
		textArea = new JTextArea();
		textArea.setBounds(20, 0, 315, 289);
		vista_read.add(textArea);
		
		boton_salir = new JButton("Salir");
		boton_salir.setBounds(97, 299, 147, 73);
		vista_read.add(boton_salir);
		
		vista_read.setVisible(false);
		
		
		
		//// ELEMENTOS VISTA_DELETE
		
		
		vista_delete = new JPanel();
		//vista_delete.setVisible(false);
		vista_delete.setLayout(null);
		vista_delete.setBorder(new EmptyBorder(5, 5, 5, 5));
		vista_delete.setBounds(272, 61, 345, 457);
		contentPane.add(vista_delete);
		
		JLabel label_id_2 = new JLabel("Id");
		label_id_2.setBounds(196, 30, 46, 14);
		vista_delete.add(label_id_2);
		
		deleteIdField = new JTextField();
		deleteIdField.setColumns(10);
		deleteIdField.setBounds(196, 55, 86, 20);
		vista_delete.add(deleteIdField);
		
		boton_borrar = new JButton("Borrar");
		boton_borrar.setBounds(97, 299, 147, 73);
		vista_delete.add(boton_borrar);
		
		vista_delete.setVisible(false);
		
		
		
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
		
		
	}
}
