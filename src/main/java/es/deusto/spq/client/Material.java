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
	private boolean libre;
	
	/** Constructor de la clase Instalación
	 * @param nombre del material
	 * @param id del material	
	 * @param libre para saber si el material esta disponible
	 */
	
	public Material(String nombre, String id, boolean libre) {
		super();
		this.nombre = nombre;
		this.id = id;
		this.libre = libre;
	}
	
	public Material() {
		super();
		this.nombre = "";
		this.id = "";
		this.libre = true;
	}
	
	public Material(Material m) {
		super();
		this.nombre = m.nombre;
		this.id = m.id;
		this.libre = m.libre;
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

	public boolean isLibre() {
		return libre;
	}

	public void setLibre(boolean libre) {
		this.libre = libre;
	}

	public String toString() {
		return "Material [nombre=" + nombre + ", id=" + id + ", libre=" + libre + "]";
	}
	
}
