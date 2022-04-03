package es.deusto.spq.client;

import javax.jdo.annotations.Inheritance;
import javax.jdo.annotations.InheritanceStrategy;
import javax.jdo.annotations.PersistenceCapable;
import javax.jdo.annotations.PrimaryKey;

@PersistenceCapable
@Inheritance(strategy=InheritanceStrategy.NEW_TABLE)

public class ReservaMaterial {
	@PrimaryKey
	private String IDMaterial;
    private Cliente Cliente;
    
    /** Constructor de la clase reservas
     * @param IDMaterial ID del material
     * @param Cliente que realiza la reserva
     * @param anyo Año de la reserva
     * @param mes Mes de la reserva
     * @param dia Día de la reserva
     * @param hora Hora de la reserva
     */
	
    public ReservaMaterial(String iDMaterial, es.deusto.spq.client.Cliente cliente) {
		super();
		IDMaterial = iDMaterial;
		Cliente = cliente;
	}
    
    public ReservaMaterial() {
		super();
		IDMaterial = "";
		Cliente = null;
	}

	public String getIDMaterial() {
		return IDMaterial;
	}

	public void setIDMaterial(String iDMaterial) {
		IDMaterial = iDMaterial;
	}

	public Cliente getCliente() {
		return Cliente;
	}

	public void setCliente(Cliente cliente) {
		Cliente = cliente;
	}


	@Override
	public String toString() {
		return "ClaseReservaMaterial [IDMaterial=" + IDMaterial + ", Cliente=" + Cliente + "]";
	}
    
    

}

