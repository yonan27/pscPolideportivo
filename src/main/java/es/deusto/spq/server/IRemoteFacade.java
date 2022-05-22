package es.deusto.spq.server;

import javax.ws.rs.core.Response;

import es.deusto.spq.client.Cliente;
import es.deusto.spq.client.ReservaInstalaciones;

public interface IRemoteFacade {
	
	public Response loginPolideportivo(Cliente cliente);
	public Response agregarClientePolideportivo(Cliente cliente);
	public Response realizarReservaInstalacion(ReservaInstalaciones reserva);
	public Response ModificarReservaInstalacion(ReservaInstalaciones reserva);

}
