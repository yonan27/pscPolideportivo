package es.deusto.spq.client.gui;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.PreparedStatement;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import es.deusto.spq.client.ReservaInstalaciones;

public class VentanaEliminarReserva extends JFrame {
private JPanel contentpane;
	
	private JList listaInstalaciones = new JList();
	private JComboBox comboBoxAnyo = new JComboBox();
	private JComboBox comboBoxMes = new JComboBox();
	private JComboBox comboBoxDia = new JComboBox();
	private JComboBox comboBoxHora = new JComboBox();
	
	private JButton botonAtras = new JButton();
	

	public VentanaEliminarReserva(final es.deusto.spq.client.Controller controller) {
		
		contentpane = new JPanel();
		contentpane.setBorder(new EmptyBorder(10, 10, 5, 5));
		this.setContentPane(contentpane);
		contentpane.setLayout(null);
		
		listaInstalaciones.setBounds(81, 95, 447, 386);
		contentpane.add(listaInstalaciones);

		JLabel lTitulo = new JLabel("Eliminar una reserva");
		lTitulo.setFont(new Font("Forte", Font.BOLD, 40));
		lTitulo.setBounds(345, 35, 401, 42);
		contentpane.add(lTitulo);
		
		JLabel lFiltrarPorFecha = new JLabel();
		lFiltrarPorFecha.setText("Introducir datos");
		lFiltrarPorFecha.setFont(new Font("Goudy Old Style", Font.BOLD, 23));
		lFiltrarPorFecha.setBounds(556, 95, 300, 48);
		contentpane.add(lFiltrarPorFecha);
		
		JLabel lAnyo = new JLabel();
		lAnyo.setText("Año");
		lAnyo.setFont(new Font("Goudy Old Style", Font.BOLD, 19));
		lAnyo.setBounds(556, 137, 61, 48);
		contentpane.add(lAnyo);
		
		JLabel lMes = new JLabel();
		lMes.setText("Mes");
		lMes.setFont(new Font("Goudy Old Style", Font.BOLD, 19));
		lMes.setBounds(556, 211, 61, 48);
		contentpane.add(lMes);
		
		JLabel lDia = new JLabel();
		lDia.setText("Día");
		lDia.setFont(new Font("Goudy Old Style", Font.BOLD, 19));
		lDia.setBounds(556, 287, 61, 48);
		contentpane.add(lDia);
		
		JLabel lHora = new JLabel();
		lHora.setText("Hora");
		lHora.setFont(new Font("Goudy Old Style", Font.BOLD, 19));
		lHora.setBounds(556, 360, 61, 48);
		contentpane.add(lHora);


		DefaultListModel<String> modeloListaInstalaciones = new DefaultListModel<>();  
		listaInstalaciones.setModel(modeloListaInstalaciones);
		//aqui meto datos de prueba en la JList, que en realidad tendrian que venir de la DB
		ReservaInstalaciones  r1 = new ReservaInstalaciones("1","1A","Manolito@gmail.es", 2023,05,20,20);
		ReservaInstalaciones  r2 = new ReservaInstalaciones("2","1B","Manolito@gmail.es", 2023,06,20,20);
		ReservaInstalaciones  r3 = new ReservaInstalaciones("3","1B","Manolito@gmail.es", 2023,03,20,20);
		ReservaInstalaciones  r4 = new ReservaInstalaciones("4","1A","Manolito@gmail.es", 2023,02,20,20);
		ReservaInstalaciones  r5 = new ReservaInstalaciones("5","1A","Manolito@gmail.es", 2023,01,20,20);
		ReservaInstalaciones  r6 = new ReservaInstalaciones("6","1Bf","Manolito@gmail.es", 2024,01,20,20);
		 modeloListaInstalaciones.addElement(r1.toString());  
		 modeloListaInstalaciones.addElement(r2.toString());  
		 modeloListaInstalaciones.addElement(r3.toString());  
		 modeloListaInstalaciones.addElement(r4.toString());  
		 modeloListaInstalaciones.addElement(r5.toString());  
		 modeloListaInstalaciones.addElement(r6.toString());  


/*
 * 	l1.addElement("Item1");  
        l1.addElement("Item2");  
        l1.addElement("Item3");  
        l1.addElement("Item4");  
 */
	

		comboBoxAnyo.setFont(new Font("Goudy Old Style", Font.PLAIN, 19));
		comboBoxAnyo.setBounds(556, 183, 190, 30);
		comboBoxAnyo.addItem("Seleccione el año");
		for (int i = 2022; i <= 2024; i++) {
			comboBoxAnyo.addItem(Integer.toString(i));
		}
		contentpane.add(comboBoxAnyo);
		
		comboBoxMes.setFont(new Font("Goudy Old Style", Font.PLAIN, 19));
		comboBoxMes.setBounds(556, 257, 190, 30);
		comboBoxMes.addItem("Seleccione el mes");
		for (int i = 1; i <= 12; i++) {
			comboBoxMes.addItem(Integer.toString(i));
		}
		contentpane.add(comboBoxMes);
		
		comboBoxDia.setFont(new Font("Goudy Old Style", Font.PLAIN, 19));
		comboBoxDia.setBounds(556, 331, 190, 30);
		comboBoxDia.addItem("Seleccione el día");
		for (int i = 1; i <= 31; i++) {
			comboBoxDia.addItem(Integer.toString(i));
		}
		contentpane.add(comboBoxDia);
		
		comboBoxHora.setFont(new Font("Goudy Old Style", Font.PLAIN, 19));
		comboBoxHora.setBounds(556, 404, 190, 30);
		comboBoxHora.addItem("Seleccione la hora");
		for (int i = 8; i <= 23; i++) {
			comboBoxHora.addItem(Integer.toString(i));
		}
		contentpane.add(comboBoxHora);
		
		
		
		botonAtras.setForeground(Color.BLACK);
		botonAtras.setBackground(SystemColor.inactiveCaptionBorder);
		botonAtras.setBounds(22, 492, 90, 42);
		botonAtras.setText("Atras");
		botonAtras.setFont(new Font("Goudy Old Style", Font.BOLD, 19));
		contentpane.add(botonAtras);

		JButton btnEliminar = new JButton("Eliminar");
		btnEliminar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//PreparedStatement preparedStatement = null;
				//ReservaInstalaciones r ;
				
				
			}
		});
		btnEliminar.setForeground(new Color(0, 0, 0));
		btnEliminar.setBackground(Color.RED);
		btnEliminar.setFont(new Font("Goudy Old Style", Font.PLAIN, 12));
		btnEliminar.setBounds(628, 460, 92, 28);
		contentpane.add(btnEliminar);
		


		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(1060, 600);
		this.setVisible(true);
		setLocationRelativeTo(null);
		this.setTitle("Reservas");
	}
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentanaEliminarReserva window = new VentanaEliminarReserva(null);
					window.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
}

