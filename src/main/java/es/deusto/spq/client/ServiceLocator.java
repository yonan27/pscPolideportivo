package es.deusto.spq.client;

import java.io.IOException;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Entity;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

import org.apache.log4j.Logger;

public class ServiceLocator {
	
	private Client cliente;
	private WebTarget webTarget;
	private static Logger logger = Logger.getLogger(ServiceLocator.class.getName());

	public ServiceLocator() {
		cliente = ClientBuilder.newClient();
		webTarget = cliente.target(cogerUrl());
	}
	
	public static String cogerUrl() {
		GetProperties properties = new GetProperties();
		String url = "";

		try {
			url = properties.getURL();
		} catch (IOException e2) {
			// TODO Auto-generated catch block
			e2.printStackTrace();
		}
		return url;

	}
	
	public boolean anadirCliente(String DNI, String nombre, String apellido, int edad, String email, String contrasenya, boolean Admin) {
		WebTarget registerUserWebTarget = webTarget.path("server/registro");
		Cliente c = new Cliente();
		c.setDNI(DNI);
		c.setNombre(nombre);
		c.setApellido(apellido);
		c.setEdad(edad);
		c.setEmail(email);
		c.setContrasenya(contrasenya);
		c.setAdmin(false);
		
		Entity<Cliente> entity = Entity.entity(c, MediaType.APPLICATION_JSON);
		Response response = registerUserWebTarget.request().post(entity);
		if (response.getStatus() != Status.OK.getStatusCode()) {
			logger.error("Error conectando con el servidor. Codigo: " + response.getStatus());
			return false;
		} else {
			logger.info("Usuario registrado correctamente");
			return true;
		}
	}

}
