package es.deusto.spq.Main;

import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Image;
import java.awt.image.ImageFilter;

import javax.swing.SwingConstants;
import javax.swing.Icon;

public class VentanPrincipal {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentanPrincipal window = new VentanPrincipal();
					window.frame.setVisible(true);
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
		frame = new JFrame();
		frame.setBounds(100, 100, 662, 411);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panelDeArriba = new JPanel();
		frame.getContentPane().add(panelDeArriba, BorderLayout.NORTH);
		
		JLabel LabeldeArriba = new JLabel("Bienvenido a pscPolideportivo");
		panelDeArriba.add(LabeldeArriba);
		LabeldeArriba.setFont(new Font("Goudy Old Style", Font.BOLD | Font.ITALIC, 15));
		
		JPanel panelFoto = new JPanel();
		frame.getContentPane().add(panelFoto, BorderLayout.CENTER);
		
		
		JLabel labelFoto = new JLabel(new ImageIcon("C:\\Users\\marke\\git\\pscPolideportivo\\src\\main\\resources\\fotos\\fotoPolideportivo.jpg"));
		labelFoto.setHorizontalAlignment(SwingConstants.CENTER);
		panelFoto.add(labelFoto);
		labelFoto.setBounds(100, 100, 300, 200);
		
		//Image foto = new ImageIcon(this.getClass().getResource("C:\\Users\\marke\\git\\pscPolideportivo\\src\\main\\resources\\fotos\\fotoPolideportivo.jpg")).getgetImage();
		//labelFoto.setIcon(new ImageIcon(foto));

		
		
	
		
	}
	
	//panelFoto.setIcon(new ImageIcon(/src/imagenes));

}
  