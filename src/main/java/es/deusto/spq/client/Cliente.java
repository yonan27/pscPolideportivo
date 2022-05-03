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
	private String edad;
	private String email;
	private String contrasenya;
	private boolean Admin;
	private ArrayList<Cliente> listaDeClientes;


	/** Constructor del cliente 
	 * @param DNI Dni del cliente
	 * @param nombre Nombre del cliente
	 * @param apellido Apellido del cliente
	 * @param edad Edad del cliente
	 * @param email Email del cliente
	 * @param contrasenya Contraseña del cliente
	 * @param Admin Boolean para saber si el cliente es admin o no 
	 */
	
	public Cliente() {
		super();
		this.DNI = "";
		this.nombre = "";
		this.apellido = "";
		this.edad = "";
		this.email = "";
		this.contrasenya = "";
		this.Admin = false;
	}
	
	public Cliente(String DNI, String nombre, String apellido, String edad, String email, String contrasenya, boolean admin) {
		super();
		this.DNI = DNI;
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
		this.email = email;
		this.contrasenya = contrasenya;
		this.Admin = admin;
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

	public String getEdad() {
		return edad;
	}

	public void setEdad(String edad) {
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
	
	public ArrayList<Cliente> getListaDeClientes() {
	
		return listaDeClientes;
	}

	public void setListaDeClientes(ArrayList<Cliente> listaDeClientes) {
		this.listaDeClientes = listaDeClientes;
	}

	@Override
	public String toString() {
		return "Cliente [DNI=" + DNI + ", nombre=" + nombre + ", apellido=" + apellido + ", edad=" + edad + ", email="
				+ email + ", contrasenya=" + contrasenya + ", Admin=" + Admin + ", listaDeClientes=" + listaDeClientes
				+ "]";
	}

	

}
