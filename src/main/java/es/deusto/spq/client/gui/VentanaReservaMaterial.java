package es.deusto.spq.client.gui;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileInputStream;
import java.io.IOException;
import java.lang.ModuleLayer.Controller;
import java.util.ArrayList;
import java.util.Date;
import java.util.Properties;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import org.glassfish.hk2.api.ServiceLocator;

public class VentanaReservaMaterial extends JFrame {
	private static final long serialVersionUID = 1L;

	private JPanel contentpane;
	
	private JList listaMaterial = new JList();
	private JButton botonFiltrar = new JButton();
	private JComboBox comboBoxAnyo = new JComboBox();
	private JComboBox comboBoxMes = new JComboBox();
	private JComboBox comboBoxDia = new JComboBox();
	private JComboBox comboBoxHora = new JComboBox();
	private JButton botonReservar = new JButton();
	private JButton botonAtras = new JButton();
	

	public VentanaReservaMaterial(Controller controller) {
		
		contentpane = new JPanel();
		contentpane.setBorder(new EmptyBorder(10, 10, 5, 5));
		this.setContentPane(contentpane);
		contentpane.setLayout(null);
		
		listaMaterial.setBounds(142, 148, 447, 386);
		contentpane.add(listaMaterial);

		JLabel lTitulo = new JLabel("Reservar Material");
		lTitulo.setFont(new Font("Forte", Font.BOLD, 40));
		lTitulo.setBounds(341, 35, 385, 42);
		contentpane.add(lTitulo);
		
		JLabel lMaterialDisponible = new JLabel();
		lMaterialDisponible.setText("Material disponible");
		lMaterialDisponible.setFont(new Font("Goudy Old Style", Font.BOLD, 23));
		lMaterialDisponible.setBounds(142, 99, 300, 48);
		contentpane.add(lMaterialDisponible);
		
		JLabel lFiltrarPorFecha = new JLabel();
		lFiltrarPorFecha.setText("Filtrar por fecha");
		lFiltrarPorFecha.setFont(new Font("Goudy Old Style", Font.BOLD, 23));
		lFiltrarPorFecha.setBounds(628, 99, 300, 48);
		contentpane.add(lFiltrarPorFecha);
		
		JLabel lAnyo = new JLabel();
		lAnyo.setText("Año");
		lAnyo.setFont(new Font("Goudy Old Style", Font.BOLD, 19));
		lAnyo.setBounds(629, 133, 61, 48);
		contentpane.add(lAnyo);
		
		JLabel lMes = new JLabel();
		lMes.setText("Mes");
		lMes.setFont(new Font("Goudy Old Style", Font.BOLD, 19));
		lMes.setBounds(628, 210, 61, 48);
		contentpane.add(lMes);
		
		JLabel lDia = new JLabel();
		lDia.setText("Día");
		lDia.setFont(new Font("Goudy Old Style", Font.BOLD, 19));
		lDia.setBounds(629, 286, 61, 48);
		contentpane.add(lDia);
		
		JLabel lHora = new JLabel();
		lHora.setText("Hora");
		lHora.setFont(new Font("Goudy Old Style", Font.BOLD, 19));
		lHora.setBounds(630, 362, 61, 48);
		contentpane.add(lHora);
		
		
		comboBoxAnyo.setFont(new Font("Goudy Old Style", Font.PLAIN, 19));
		comboBoxAnyo.setBounds(627, 175, 190, 30);
		comboBoxAnyo.addItem("Seleccione el año");
		for (int i = 2022; i <= 2024; i++) {
			comboBoxAnyo.addItem(Integer.toString(i));
		}
		contentpane.add(comboBoxAnyo);
		
		comboBoxMes.setFont(new Font("Goudy Old Style", Font.PLAIN, 19));
		comboBoxMes.setBounds(630, 253, 190, 30);
		comboBoxMes.addItem("Seleccione el mes");
		for (int i = 1; i <= 12; i++) {
			comboBoxMes.addItem(Integer.toString(i));
		}
		contentpane.add(comboBoxMes);
		
		comboBoxDia.setFont(new Font("Goudy Old Style", Font.PLAIN, 19));
		comboBoxDia.setBounds(630, 329, 190, 30);
		comboBoxDia.addItem("Seleccione el día");
		for (int i = 1; i <= 31; i++) {
			comboBoxDia.addItem(Integer.toString(i));
		}
		contentpane.add(comboBoxDia);
		
		comboBoxHora.setFont(new Font("Goudy Old Style", Font.PLAIN, 19));
		comboBoxHora.setBounds(630, 404, 190, 30);
		comboBoxHora.addItem("Seleccione la hora");
		for (int i = 8; i <= 23; i++) {
			comboBoxHora.addItem(Integer.toString(i));
		}
		contentpane.add(comboBoxHora);
		
		botonFiltrar.setText("Filtrar");
		botonFiltrar.setForeground(Color.WHITE);
		botonFiltrar.setFont(new Font("Goudy Old Style", Font.BOLD, 19));
		botonFiltrar.setBackground(new Color(0, 51, 255));
		botonFiltrar.setBounds(730, 460, 90, 30);
		contentpane.add(botonFiltrar);
		
		botonReservar.setForeground(SystemColor.text);
		botonReservar.setBackground(new Color(0, 51, 255));
		botonReservar.setBounds(899, 279, 123, 61);
		botonReservar.setText("Reservar");
		botonReservar.setFont(new Font("Goudy Old Style", Font.BOLD, 25));
		contentpane.add(botonReservar);
		
		botonAtras.setForeground(Color.BLACK);
		botonAtras.setBackground(SystemColor.inactiveCaptionBorder);
		botonAtras.setBounds(22, 492, 90, 42);
		botonAtras.setText("Atras");
		botonAtras.setFont(new Font("Goudy Old Style", Font.BOLD, 19));
		contentpane.add(botonAtras);
		
		
		botonFiltrar.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
			}
		});
		
		botonReservar.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				
			}
		});
				
		botonAtras.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				
			}
		});

		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(1066, 600);
		this.setVisible(true);
		setLocationRelativeTo(null);
		this.setTitle("Reservas");
	}
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentanaReservaMaterial window = new VentanaReservaMaterial(null);
					window.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
}