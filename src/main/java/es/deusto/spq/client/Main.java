package es.deusto.spq.client;

import es.deusto.spq.client.gui.VentanaLogin;

public class Main {
	public static void main(String[] args) {
		
	ServiceLocator servicelocator = new ServiceLocator();
	
	Controller controller = new Controller(servicelocator);

	VentanaLogin inicio = new VentanaLogin(controller);

	inicio.setVisible(true);
	
	}
}
