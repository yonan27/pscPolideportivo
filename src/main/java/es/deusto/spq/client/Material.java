package es.deusto.spq.client;

import javax.jdo.annotations.Inheritance;
import javax.jdo.annotations.InheritanceStrategy;
import javax.jdo.annotations.PersistenceCapable;
import javax.jdo.annotations.PrimaryKey;

@PersistenceCapable
@Inheritance(strategy=InheritanceStrategy.NEW_TABLE)

public class Material {
	
	@PrimaryKey
	private String nombre;
	private String id;
	private int precio;
	
	
	
	/** Constructor de la clase Instalación
	 * @param nombre del material
	 * @param id del material	
	 * @param libre para saber si el material esta disponible
	 */
	
	
	
	
	public Material() {
		super();
		this.nombre = "";
		this.id = "";
		this.precio = 0;
	}
	
	public Material(Material m) {
		super();
		this.nombre = m.nombre;
		this.id = m.id;
		this.precio = m.precio;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public int getPrecio() {
		return precio;
	}

	public void setPrecio(int precio) {
		this.precio = precio;
	}

	@Override
	public String toString() {
		return "Material [nombre=" + nombre + ", id=" + id + ", precio=" + precio + ", getNombre()=" + getNombre()
				+ ", getId()=" + getId() + ", getPrecio()=" + getPrecio() + "]";
	}




}
