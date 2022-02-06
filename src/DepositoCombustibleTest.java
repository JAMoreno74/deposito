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
		assertEquals(tank.getDepositoNivel(),40.0,0);
		System.out.print("deposito lleno");
	
	}

	@Test
	public void testEstaVacio() {
		fail("No implementado aun");
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
