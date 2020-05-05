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
    int number1 = 23;
    int number2 = 72;
    int number3 = 56;
    int number4 = 30;

    ArrayList<Integer> expectedNumbers1 = new ArrayList<Integer>();
    expectedNumbers1.add(0, 233);
    expectedNumbers1.add(1, 239);

    ArrayList<Integer> expectedNumbers2 = new ArrayList<Integer>();
    expectedNumbers2.add(0, 233);
    expectedNumbers2.add(1, 239);

    ArrayList<Integer> expectedNumbers3 = new ArrayList<Integer>();
    expectedNumbers3.add(0, 233);
    expectedNumbers3.add(1, 239);
    
    ArrayList<Integer> expectedNumbers4 = new ArrayList<Integer>();
    expectedNumbers4.add(0, 233);
    expectedNumbers4.add(1, 239);
    

    assertEquals(expectedNumbers1, SushimanMatematico.getPrimos(number1));
    assertEquals(expectedNumbers1, SushimanMatematico.getPrimos(number2));
    assertEquals(expectedNumbers1, SushimanMatematico.getPrimos(number3));
    assertEquals(expectedNumbers1, SushimanMatematico.getPrimos(number4));
  }
  
	public void testGetSuperPrimos() {
	}
}
