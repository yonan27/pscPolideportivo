package es.deusto.spq.client.gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import javax.swing.JList;
import javax.swing.JTable;
import javax.swing.JPanel;
import javax.swing.JTextPane;
import java.awt.Font;
import javax.swing.border.LineBorder;
import javax.swing.JCheckBox;
import javax.swing.JTextField;

public class VentanaGestionCliente {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentanaGestionCliente window = new VentanaGestionCliente();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public VentanaGestionCliente() {
		initialize();
	}

	/**
	 * Inicilizo frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.ORANGE);
		frame.setBackground(Color.ORANGE);
		frame.setBounds(100, 100, 673, 322);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JLabel labelDeArriba = new JLabel("                        Gestion de clientes\r\n");
		labelDeArriba.setForeground(Color.BLACK);
		labelDeArriba.setFont(new Font("Goudy Old Style", Font.BOLD, 30));
		labelDeArriba.setBackground(Color.ORANGE);
		frame.getContentPane().add(labelDeArriba, BorderLayout.NORTH);
		
		JPanel panelDerecho = new JPanel();
		panelDerecho.setBackground(Color.ORANGE);
		frame.getContentPane().add(panelDerecho, BorderLayout.EAST);
		
		JTextField textFieldNombreCliente = new JTextField();
		panelDerecho.add(textFieldNombreCliente);
		textFieldNombreCliente.setColumns(10);
		
		JCheckBox Box = new JCheckBox("Administrador\r\n");
		panelDerecho.add(Box);
		
		JPanel panelListaClientes = new JPanel();
		frame.getContentPane().add(panelListaClientes, BorderLayout.CENTER);
		
		JList listdeClientes = new JList();
		panelListaClientes.add(listdeClientes);
	}

}
