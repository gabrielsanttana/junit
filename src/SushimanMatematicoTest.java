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
  }
  
	public void testGetSuperPrimos() {
	}
}
