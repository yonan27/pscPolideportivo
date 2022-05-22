package test;

import static org.junit.Assert.*;

import org.junit.Test;

import es.deusto.spq.client.Material;

public class testMaterial {
	Material a = new Material("Balon", "4A", 3);
	Material b = new Material();
	@Test
	public void testGetNombre() {
		assertEquals("Balon", a.getNombre());
	}
	public void testGetID() {
		assertEquals("4a", a.getId());
	}
	public void testGetPrecio() {
		assertEquals(3, a.getNombre());
	}
	public void testSetNombre() {
		b.setNombre("Raqueta");
		assertEquals("Balon", b.getNombre());
	}
	public void testSetID() {
		b.setId("4b");
		assertEquals("4b", b.getId());
	}
	public void testSetPrecio() {
		b.setPrecio(5);
		assertEquals(5, a.getNombre());
	}

}
