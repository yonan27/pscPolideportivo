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
    private int anyo;
    private int mes;
    private int dia;
    private int hora;
    
    /** Constructor de la clase reservas
     * @param IDMaterial ID del material
     * @param Cliente que realiza la reserva
     * @param anyo Año de la reserva
     * @param mes Mes de la reserva
     * @param dia Día de la reserva
     * @param hora Hora de la reserva
     */
	
    public ReservaMaterial(String iDMaterial, es.deusto.spq.client.Cliente cliente, int anyo, int mes, int dia,
			int hora) {
		super();
		IDMaterial = iDMaterial;
		Cliente = cliente;
		this.anyo = anyo;
		this.mes = mes;
		this.dia = dia;
		this.hora = hora;
	}
    
    public ReservaMaterial() {
		super();
		IDMaterial = "";
		Cliente = null;
		this.anyo = 0;
		this.mes = 0;
		this.dia = 0;
		this.hora = 0;
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

	public int getAnyo() {
		return anyo;
	}

	public void setAnyo(int anyo) {
		this.anyo = anyo;
	}

	public int getMes() {
		return mes;
	}

	public void setMes(int mes) {
		this.mes = mes;
	}

	public int getDia() {
		return dia;
	}

	public void setDia(int dia) {
		this.dia = dia;
	}

	public int getHora() {
		return hora;
	}

	public void setHora(int hora) {
		this.hora = hora;
	}

	@Override
	public String toString() {
		return "ClaseReservaMaterial [IDMaterial=" + IDMaterial + ", Cliente=" + Cliente + ", anyo=" + anyo + ", mes="
				+ mes + ", dia=" + dia + ", hora=" + hora + "]";
	}
    
    

}

