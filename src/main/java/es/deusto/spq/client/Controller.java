package es.deusto.spq.client;

public class Controller {
	
public ServiceLocator serviceLocator;
	
	public Controller(ServiceLocator serviceLocator) {
		this.serviceLocator = serviceLocator;
	}
	
	public int loginPolideportivo(String email, String contrasenya){
		return serviceLocator.loginPolideportivo(email, contrasenya);
	}
	
	public boolean agregarCliente(String DNI, String nombre, String apellido, int edad, String email, String contrasenya, boolean Admin){
		return serviceLocator.agregarClientePolideportivo(DNI, nombre, apellido, edad, email, contrasenya, Admin);
	}

}
