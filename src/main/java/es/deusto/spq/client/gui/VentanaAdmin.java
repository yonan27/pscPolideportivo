package es.deusto.spq.client.gui;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import es.deusto.spq.client.Controller;

public class VentanaAdmin extends JFrame{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentpane;
	private JButton botonClientes = new JButton();
	private JButton buttonReservas = new JButton();
	private JButton buttonSalir = new JButton();
	
	public VentanaAdmin(final Controller controller){
		contentpane = new JPanel();

		contentpane.setBorder(new EmptyBorder(10, 10, 5, 5));
		this.setContentPane(contentpane);
		contentpane.setLayout(null);

		JLabel lTitulo = new JLabel("PSC Polideportivo - Admin");
		lTitulo.setFont(new Font("Forte", Font.BOLD, 40));
		lTitulo.setBounds(275, 42, 499, 50);
		contentpane.add(lTitulo);
		        
		botonClientes.setForeground(SystemColor.text);
		botonClientes.setBackground(new Color(0, 51, 255));
		botonClientes.setBounds(423, 204, 200, 50);
		botonClientes.setText("Clientes");
		botonClientes.setFont(new Font("Goudy Old Style", Font.BOLD, 23));
		contentpane.add(botonClientes);
		
		buttonReservas.setForeground(SystemColor.text);
		buttonReservas.setBackground(new Color(0, 51, 255));
		buttonReservas.setBounds(423, 307, 200, 50);
		buttonReservas.setText("Reservas");
		buttonReservas.setFont(new Font("Goudy Old Style", Font.BOLD, 23));
		contentpane.add(buttonReservas);
				
		buttonSalir.setForeground(SystemColor.black);
		buttonSalir.setBackground(SystemColor.inactiveCaptionBorder);
		buttonSalir.setBounds(22, 492, 90, 42);
		buttonSalir.setText("Salir");
		buttonSalir.setFont(new Font("Goudy Old Style", Font.BOLD, 20));
		contentpane.add(buttonSalir);
			
		buttonReservas.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				new VentanaModificarClientesAdmin(controller);
				VentanaAdmin.this.dispose();
			}
		});
		
		botonClientes.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				new VentanaGestionCliente(controller);
				VentanaAdmin.this.dispose();			
			}
		});
						
		buttonSalir.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				VentanaLogin inicio = new VentanaLogin(controller);
				inicio.setVisible(true);
				VentanaAdmin.this.dispose();
				
			}
		});

		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(1060, 600);
		this.setVisible(true);
		setLocationRelativeTo(null);
		this.setTitle("PSC Polideportivo - Admin");

	}
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentanaAdmin window = new VentanaAdmin(null);
					window.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
}

