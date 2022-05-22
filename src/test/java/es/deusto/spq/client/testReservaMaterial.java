package test;

import static org.junit.Assert.*;

import org.junit.Test;

import es.deusto.spq.client.ReservaMaterial;

public class testReservaMaterial {
	ReservaMaterial a = new ReservaMaterial("5a", null);
	ReservaMaterial b = new ReservaMaterial();

	@Test
	public void GetIdMaterial() {
		assertEquals("5a", a.getIDMaterial());
	}

	public void GetCliente() {
		assertEquals(null, a.getCliente());
	}

	public void SetIDMaterial() {
		b.setIDMaterial("5b");
		assertEquals("5b", b.getIDMaterial());
	}
	public void SetCliente() {
		b.setCliente(null);
		assertEquals(null, b.getCliente());
	}
}
