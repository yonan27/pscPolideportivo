package es.deusto.spq.client.gui;


import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JTextField;

import es.deusto.spq.client.Cliente;
import javax.swing.SwingConstants;

public class VentanaGestionCliente extends Cliente{

	private JFrame frame;
	private JLabel labelNombreDeTabla;
	Dimension d = Toolkit.getDefaultToolkit ().getScreenSize ();
	Dimension frameSize = new Dimension (1060, 600);

	/**
	 * Launch the application
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentanaGestionCliente window = new VentanaGestionCliente(null);
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
	public VentanaGestionCliente(final es.deusto.spq.client.Controller controller) {
		initialize();
		
	}

	/**
	 * Initialize frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setVisible(true);
		frame.setBounds (d.width/2 - frameSize.width/2, d.height/2 - frameSize.height/2, frameSize.width, frameSize.height);
		frame.getContentPane().setBackground(Color.WHITE);
		frame.setBackground(Color.WHITE);
		frame.setTitle("PSC Polideportivo - Admin");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JLabel labelDeArriba = new JLabel("Gestion de clientes\r\n");
		labelDeArriba.setHorizontalAlignment(SwingConstants.CENTER);
		labelDeArriba.setForeground(Color.BLACK);
		labelDeArriba.setFont(new Font("Forte", Font.BOLD, 30));
		labelDeArriba.setBackground(Color.ORANGE);
		frame.getContentPane().add(labelDeArriba, BorderLayout.NORTH);
		
		JPanel panelDerecho = new JPanel();
		panelDerecho.setBackground(Color.WHITE);
		frame.getContentPane().add(panelDerecho, BorderLayout.EAST);
		
		JTextField textFieldNombreCliente = new JTextField();
		panelDerecho.add(textFieldNombreCliente);
		textFieldNombreCliente.setColumns(10);
		
		JCheckBox Box = new JCheckBox("Administrador\r\n");
		Box.setFont(new Font("Goudy Old Style", Font.BOLD, 16));
		panelDerecho.add(Box);
		
		JButton btnEliminarCliente = new JButton("Eliminar Cliente");
		btnEliminarCliente.setFont(new Font("Goudy Old Style", Font.BOLD, 16));
		btnEliminarCliente.setBackground(Color.RED);
		panelDerecho.add(btnEliminarCliente);
		
		
		JPanel panelListaClientes = new JPanel();
		frame.getContentPane().add(panelListaClientes, BorderLayout.CENTER);
		
		labelNombreDeTabla = new JLabel("Lista de clientes");
		labelNombreDeTabla.setFont(new Font("Goudy Old Style", Font.BOLD, 16));
		panelListaClientes.add(labelNombreDeTabla);
		
		JList<Object> listdeClientes = new JList<Object>();
		panelListaClientes.add(listdeClientes);
		
		
		btnEliminarCliente.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
			}
		});
	}

}
