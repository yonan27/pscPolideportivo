package es.deusto.spq.client.gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

import es.deusto.spq.client.gui.VentanaLogin;

public class VentanPrincipal {

	private JFrame frmVentanaPincipal;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentanPrincipal window = new VentanPrincipal();
					window.frmVentanaPincipal.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	
	public VentanPrincipal() {
		initialize();
	}

	private void initialize() {
		frmVentanaPincipal = new JFrame();
		frmVentanaPincipal.setFont(new Font("Goudy Old Style", Font.BOLD | Font.ITALIC, 20));
		frmVentanaPincipal.setTitle("Ventana Pincipal");
		frmVentanaPincipal.setBounds(100, 100, 955, 612);
		frmVentanaPincipal.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panelDeArriba = new JPanel();
		frmVentanaPincipal.getContentPane().add(panelDeArriba, BorderLayout.NORTH);
		
		JLabel LabeldeArriba = new JLabel("Bienvenido a pscPolideportivo");
		panelDeArriba.add(LabeldeArriba);
		LabeldeArriba.setFont(new Font("Goudy Old Style", Font.BOLD | Font.ITALIC, 25));
		
		JPanel panelFoto = new JPanel();
		frmVentanaPincipal.getContentPane().add(panelFoto, BorderLayout.WEST);
		
		
		JLabel labelFoto = new JLabel(new ImageIcon("C:\\Users\\marke\\git\\pscPolideportivo\\src\\main\\resources\\fotos\\fotoPolideportivo2.jpg"));
		labelFoto.setHorizontalAlignment(SwingConstants.CENTER);
		panelFoto.add(labelFoto);
		labelFoto.setBounds(100, 100, 100, 100);
		
		JButton btnIniciarSesion = new JButton("Entrar");
		btnIniciarSesion.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				VentanaLogin v= new VentanaLogin(false);
				v.setVisible(true);
				
			}
		});
		panelFoto.add(btnIniciarSesion);
		labelFoto.setSize(200, 200);
		//Image foto = new ImageIcon(this.getClass().getResource("C:\\Users\\marke\\git\\pscPolideportivo\\src\\main\\resources\\fotos\\fotoPolideportivo.jpg")).getgetImage();
		//labelFoto.setIcon(new ImageIcon(foto));

		JButton btnSalir = new JButton("Salir");
		panelFoto.add(btnSalir);
		btnSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(1);
				
			}
		});
		
	
		/*public static ImageIcon redimensionImgProd(ImageIcon imageIcon, int ancho, int alto) {
			Image image = imageIcon.getImage(); // transform it 
			Image newimg = image.getScaledInstance(ancho,alto ,  java.awt.Image.SCALE_SMOOTH); // scale it the smooth way  
			return imageIcon = new ImageIcon(newimg);  // transform it back
	}*/
		
	
		
	}
	
	//panelFoto.setIcon(new ImageIcon(/src/imagenes));

}
  