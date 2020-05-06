import junit.framework.TestCase;
import java.util.ArrayList;

public class SushimanMatematicoTest extends TestCase {

	public void testEhPrimo() {
		assertTrue(SushimanMatematico.ehPrimo(7));
		assertTrue(SushimanMatematico.ehPrimo(11));
		assertTrue(SushimanMatematico.ehPrimo(71));
		assertTrue(SushimanMatematico.ehPrimo(233));
		assertFalse(SushimanMatematico.ehPrimo(12));
	}

	public void testGetPrimos() {
		ArrayList<Integer> expectedNumbers = SushimanMatematico.getPrimos(23);

		assertTrue(expectedNumbers.contains(233));
		assertTrue(expectedNumbers.contains(239));
		assertFalse(expectedNumbers.contains(16));
		assertFalse(expectedNumbers.contains(8));
	}

	public void testGetSuperPrimos() {
		ArrayList<Integer> expectedNumbers = SushimanMatematico.getSuperPrimos(8);

		assertTrue(expectedNumbers.contains(23399339));
		assertTrue(expectedNumbers.contains(37337999));
		assertTrue(expectedNumbers.contains(73939133));
		assertFalse(expectedNumbers.contains(0));
		assertFalse(expectedNumbers.contains(4));
		assertFalse(expectedNumbers.contains(8));
	}
}
