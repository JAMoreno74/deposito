import static org.junit.Assert.*;

import org.junit.Test;

public class DepositoCombustibleTest {

	@Test
	public void testGetDepositoNivel() {
		
		DepositoCombustible tank = new DepositoCombustible(40.0,0.0);
		assertEquals(tank.getDepositoNivel(),0.0,0);
	
	}

	@Test
	public void testGetDepositoMax() {
		
		DepositoCombustible tank = new DepositoCombustible(40.0,40.0);
		assertEquals(tank.getDepositoMax(),40.0,0);
			
	}

	@Test
	public void testEstaVacio() {
		
		DepositoCombustible tank = new DepositoCombustible(40.0,0.0);
		assertTrue(tank.estaVacio());
		
	}

	@Test
	public void testEstaLleno() {
		fail("No implementado aun");
	}

	@Test
	public void testFill() {
		fail("No implementado aun");
	}

	@Test
	public void testConsumir() {
		fail("No implementado aun");
	}

}
