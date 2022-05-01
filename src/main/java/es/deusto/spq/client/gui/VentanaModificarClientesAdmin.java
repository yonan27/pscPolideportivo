package es.deusto.spq.client.gui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.ModuleLayer.Controller;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.JComboBox;

public class VentanaModificarClientesAdmin extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private JPanel contentpane;
	private JLabel labelUsuario = new JLabel();
	private JLabel labelContrasenya = new JLabel();
	private final JComboBox comboBox = new JComboBox();
	private JTextField textField;
	private final JButton btnBorrarUsuario = new JButton();

	public VentanaModificarClientesAdmin(final es.deusto.spq.client.Controller controller) {

		contentpane = new JPanel();
		contentpane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentpane);
		contentpane.setLayout(null);
		

		JLabel labelTitle = new JLabel("PSC Polideportivo");
		labelTitle.setBounds(49, 33, 334, 50);
		labelTitle.setFont(new Font("Forte", Font.BOLD, 40));
		contentpane.add(labelTitle);
		labelUsuario.setBounds(23, 125, 147, 20);

		labelUsuario.setText("Seleccionar usuario:");
		labelUsuario.setOpaque(true);
		labelUsuario.setFont(new Font("Goudy Old Style", Font.BOLD, 16));
		contentpane.add(labelUsuario);
		labelContrasenya.setBounds(10, 174, 264, 20);

		labelContrasenya.setText("Cambiar nombre de usuario de clientes");
		labelContrasenya.setOpaque(true);
		labelContrasenya.setFont(new Font("Goudy Old Style", Font.BOLD, 16));
		contentpane.add(labelContrasenya);
		comboBox.setBounds(180, 125, 94, 22);
		
		contentpane.add(comboBox);
		
		textField = new JTextField();
		textField.setBounds(282, 175, 86, 20);
		contentpane.add(textField);
		textField.setColumns(10);
		
		JButton btnGuardarUsuario = new JButton();
		btnGuardarUsuario.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnGuardarUsuario.setText("Guardar Usuario");
		btnGuardarUsuario.setFont(new Font("Goudy Old Style", Font.BOLD | Font.ITALIC, 16));
		btnGuardarUsuario.setBackground(SystemColor.inactiveCaptionBorder);
		btnGuardarUsuario.setBounds(33, 248, 168, 32);
		contentpane.add(btnGuardarUsuario);
		btnBorrarUsuario.setText("Borrar Usuario");
		btnBorrarUsuario.setFont(new Font("Goudy Old Style", Font.BOLD | Font.ITALIC, 16));
		btnBorrarUsuario.setBackground(SystemColor.inactiveCaptionBorder);
		btnBorrarUsuario.setBounds(211, 248, 168, 32);
		
		contentpane.add(btnBorrarUsuario);

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(440, 355);
		setVisible(true);
		setLocationRelativeTo(null);
		setTitle("PSC Polideportivo");
	}

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentanaModificarClientesAdmin window = new VentanaModificarClientesAdmin(null);
					window.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
}