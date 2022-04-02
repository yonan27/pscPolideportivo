package es.deusto.spq.client;

public class Material {
	private String nombre;
	private String id;
	private boolean libre;
	
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
