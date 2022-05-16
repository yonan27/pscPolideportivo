package es.deusto.spq.client;

import java.util.ArrayList;

import javax.jdo.annotations.Inheritance;
import javax.jdo.annotations.InheritanceStrategy;
import javax.jdo.annotations.PersistenceCapable;
import javax.jdo.annotations.PrimaryKey;

import org.glassfish.grizzly.http.server.AddOn;

@PersistenceCapable
@Inheritance(strategy=InheritanceStrategy.NEW_TABLE)
public class Cliente {
	@PrimaryKey
	private String DNI;
	private String nombre;
	private String apellido;
	private int edad;
	private String email;
	private String contrasenya;
	private boolean Admin;
	
	
	/** Constructor del cliente 
	 * @param DNI Dni del cliente
	 * @param nombre Nombre del cliente
	 * @param apellido Apellido del cliente
	 * @param edad Edad del cliente
	 * @param email Email del cliente
	 * @param contrasenya Contraseña del cliente
	 * @param Admin Boolean para saber si el cliente es admin o no 
	 */
	
	public Cliente(String dNI, String nombre, String apellido, int edad, String email, String contrasenya,
			boolean admin) {
		super();
		DNI = dNI;
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
		this.email = email;
		this.contrasenya = contrasenya;
		Admin = admin;
	}
	
	public Cliente() {
		super();
		DNI = "";
		this.nombre = "";
		this.apellido = "";
		this.edad = 0;
		this.email = "";
		this.contrasenya = "";
		Admin = false;
	}

	public String getDNI() {
		return DNI;
	}

	public void setDNI(String dNI) {
		DNI = dNI;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getContrasenya() {
		return contrasenya;
	}

	public void setContrasenya(String contrasenya) {
		this.contrasenya = contrasenya;
	}

	public boolean isAdmin() {
		return Admin;
	}

	public void setAdmin(boolean admin) {
		Admin = admin;
	}

	@Override
	public String toString() {
		return "Cliente [DNI=" + DNI + ", nombre=" + nombre + ", apellido=" + apellido + ", edad=" + edad + ", email="
				+ email + ", contrasenya=" + contrasenya + ", Admin=" + Admin + "]";
	}
	
	
	
	
	

	
	
	

}
