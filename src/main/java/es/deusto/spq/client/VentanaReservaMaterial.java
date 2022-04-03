package es.deusto.spq.client;




import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.JList;





public class VentanaReservaMaterial {
private JFrame frame;
private JTextField txtReservarMaterial;
	
	public VentanaReservaMaterial() {
		initilize();
		
	}
	public static void main(String[] args) {
		VentanaReservaMaterial v=new VentanaReservaMaterial();
		v.frame.setVisible(true);
		v.frame.setLocationRelativeTo(null);

	}
	
	private void initilize() {
		JPanel panel=new JPanel();
		JPanel panel_1=new JPanel();
		JPanel panel_2=new JPanel();
		
		frame=new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new BorderLayout(0,0));
		frame.getContentPane().add(panel,BorderLayout.NORTH);
		frame.getContentPane().add(panel_1,BorderLayout.CENTER);
		frame.getContentPane().add(panel_2,BorderLayout.SOUTH);
		
		
		panel.setLayout(new FlowLayout(FlowLayout.CENTER,5,5));
		panel_2.setLayout(new FlowLayout(FlowLayout.CENTER,5,5));
		panel_1.setLayout(null);
		
		txtReservarMaterial = new JTextField();
		txtReservarMaterial.setText("Reservar Material");
		txtReservarMaterial.setBounds(76, 0, 171, 35);
		panel_1.add(txtReservarMaterial);
		txtReservarMaterial.setColumns(10);
		
		JButton boton_nombre=new JButton("Reservar");
		boton_nombre.setBounds(315, 137, 91, 23);
		panel_1.add(boton_nombre);
		
		JList list = new JList();
		list.setBounds(58, 122, 80, -45);
		panel_1.add(list);
		
		JList list_1 = new JList();
		list_1.setBounds(68, 95, 1, 1);
		panel_1.add(list_1);
		boton_nombre.addActionListener(new ActionListener() {
			
			
		});
		
		
		
	}
}
