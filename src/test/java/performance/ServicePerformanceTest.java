package performance;

import javax.ws.rs.core.Response;

import org.databene.contiperf.PerfTest;
import org.databene.contiperf.Required;
import org.databene.contiperf.junit.ContiPerfRule;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;

import es.deusto.spq.client.Cliente;
import es.deusto.spq.client.gui.VentanaLogin;

public class ServicePerformanceTest {
	private Cliente c;
	VentanaLogin vl;
	
	@Rule public ContiPerfRule rule = new ContiPerfRule();
	
	
	@Before
	public void setUp() {
		
		c= new Cliente();
		c.setDNI("123456");;
		c.setNombre("Markel");
		c.setEdad(23);
		c.setEmail("markel@gmail.com");
		c.setContrasenya("m");
		c.setAdmin(false);
		
	}
	
	
	@Test 
    @PerfTest(invocations = 1000, threads = 20)
    @Required(max = 2000, average = 160)
	public void testLogIn() {
		assertEquals(Response.Status.OK.getStatusCode(),vl.logIn(c).getStatus());
		
	}

}
