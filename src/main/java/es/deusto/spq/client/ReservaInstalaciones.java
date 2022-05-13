package es.deusto.spq.client;

import javax.jdo.annotations.Inheritance;
import javax.jdo.annotations.InheritanceStrategy;
import javax.jdo.annotations.PersistenceCapable;
import javax.jdo.annotations.PrimaryKey;

@PersistenceCapable
@Inheritance(strategy=InheritanceStrategy.NEW_TABLE)
public class ReservaInstalaciones {
    @PrimaryKey
	private String IDReserva;
    private String IDInstalacion;
    private String emailUsuario;
    private int anyo;
    private int mes;
    private int dia;
    private int hora;
    
    /** Constructor de la clase reservas
     * @param IDReserva ID de la reserva de las instalaciones
     * @param IDInstalacion ID de la propia instalación
     * @param emailUsuario Email del usuario que realiza la reserva
     * @param anyo Año de la reserva
     * @param mes Mes de la reserva
     * @param dia Día de la reserva
     * @param hora Hora de la reserva
     */
    
    public ReservaInstalaciones() {
		super();
		IDReserva = "";
		IDInstalacion = "";
		this.emailUsuario = "";
		this.anyo = 2022;
		this.mes = 3;
		this.dia = 29;
		this.hora = 8;
	}
    
        
	public ReservaInstalaciones(String iDReserva, String iDInstalacion, String emailUsuario, int anyo, int mes, int dia, int hora) {
		super();
		IDReserva = iDReserva;
		IDInstalacion = iDInstalacion;
		this.emailUsuario = emailUsuario;
		this.anyo = anyo;
		this.mes = mes;
		this.dia = dia;
		this.hora = hora;
	}
	

	public String getIDReserva() {
		return IDReserva;
	}

	public void setIDReserva(String iDReserva) {
		IDReserva = iDReserva;
	}

	public String getIDInstalacion() {
		return IDInstalacion;
	}

	public void setIDInstalacion(String iDInstalacion) {
		IDInstalacion = iDInstalacion;
	}

	public String getEmailUsuario() {
		return emailUsuario;
	}

	public void setEmailUsuario(String emailUsuario) {
		this.emailUsuario = emailUsuario;
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
		return "ReservaInstalaciones [IDReserva=" + IDReserva + ", IDInstalacion=" + IDInstalacion + ", emailUsuario="
				+ emailUsuario + ", anyo=" + anyo + ", mes=" + mes + ", dia=" + dia + ", hora=" + hora + "]";
	}
    
    
	
}

