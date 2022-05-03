package es.deusto.spq.client;

import javax.jdo.annotations.Inheritance;
import javax.jdo.annotations.InheritanceStrategy;
import javax.jdo.annotations.PersistenceCapable;
import javax.jdo.annotations.PrimaryKey;

@PersistenceCapable
@Inheritance(strategy=InheritanceStrategy.NEW_TABLE)
public class Instalacion {
	@PrimaryKey
	private String ID;
	private String nombre;
	private double precio;
	private boolean libre;
	
	/** Constructor de la clase Instalación
	 * @param ID ID de la Instalación
	 * @param nombre Nombre de la Instalación	
	 * @param precio Precio del alquiler de la Instalación
	 * @param libre Boolean para saber si la Instalación está libre o no
	 */
	
	public Instalacion() {
		super();
		this.ID = "";
		this.nombre = "";
		this.precio = 0;
		this.libre = true;
	}
	
	public Instalacion(String ID, String nombre, double precio, boolean libre) {
		super();
		this.ID = ID;
		this.nombre = nombre;
		this.precio = precio;
		this.libre = libre;
	}
	
	
	public String getID() {
		return ID;
	}

	public void setID(String iD) {
		ID = iD;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public boolean isLibre() {
		return libre;
	}

	public void setLibre(boolean libre) {
		this.libre = libre;
	}

	
	@Override
	public String toString() {
		return "Instalacion [ID=" + ID + ", nombre=" + nombre + ", precio=" + precio + ", libre=" + libre + "]";
	}
	

}
