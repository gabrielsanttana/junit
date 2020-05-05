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
    int number = 23;

    ArrayList<Integer> expectedNumbers = new ArrayList<Integer>();
    expectedNumbers.add(0, 233);
    expectedNumbers.add(1, 239);

    assertEquals(expectedNumbers, SushimanMatematico.getPrimos(number));
  }
  
	public void testGetSuperPrimos() {
	}
}
