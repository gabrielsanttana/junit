import junit.framework.TestCase;

public class SushimanMatematicoTest extends TestCase {

	public void testEhPrimo() {
        // assert statements
        assertTrue(SushimanMatematico.ehPrimo(7));
        assertTrue(SushimanMatematico.ehPrimo(11));
        assertTrue(SushimanMatematico.ehPrimo(71));
        assertTrue(SushimanMatematico.ehPrimo(233));
        assertFalse(SushimanMatematico.ehPrimo(12));		
	}

	public void testGetPrimos() {
		fail("Not yet implemented");
	}

	public void testGetSuperPrimos() {
		fail("Not yet implemented");
	}

}
