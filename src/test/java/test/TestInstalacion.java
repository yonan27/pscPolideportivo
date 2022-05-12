package test;

import static org.junit.Assert.*;

import org.junit.Test;

import es.deusto.spq.client.Instalacion;

public class TestInstalacion {
	Instalacion a = new Instalacion("2A", "Campo de futbol", 4.5, true);
	Instalacion b = new Instalacion();
	@Test
	public void testGetID() {
		assertEquals("2A", a.getID());
	
	}
	public void testGetNombre() {
		assertEquals("Campo de futbol", a.getNombre());
	
	}
	public void testGetPrecio(){
		assertEquals(4.5, a.getPrecio());
	
	}
	public void testGetlibre(){
		assertEquals(true, a.isLibre());
	
	}
	public void testSetID(){
		b.setID("3A");
		assertEquals("3A", b.getID());
	
	}
	public void testSetNombre() {
		b.setNombre("Campo de baloncesto");
		assertEquals("Campo de baloncesto", b.getNombre());
	
	}
	public void testSetPrecio(){
		b.setPrecio(5);
		assertEquals(5, b.getPrecio());
	
	}
	public void testSetlibre(){
		b.setLibre(false);
		assertEquals(false, b.isLibre());
	}
}
