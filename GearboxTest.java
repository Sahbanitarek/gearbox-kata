package electrics.industries;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class GearboxTest {

	@Before
	public void setUp() throws Exception {
		fail("exécution avant le test");
	}

	@After
	public void tearDown() throws Exception {
		fail("exécution après le test");
	}

	@Test
	public void testDoit() {
		int s, e, i, result;

		// pour s est négatif
		s = -1;
		e = 5;
		i = 5;
		assertTrue("S est négatif ; E égal à i", e == i);
		s = -1;
		e = 5;
		i = 6;
		assertTrue("S est négatif ; E est différent à i", e == i);

		// pour s >= 0 et s <1
		s = 0;
		result = s++;
		assertTrue(" s >= 0 et s < 1", s == result);

		// pour s >= 1 et s <= 5
		// pour i > 2000
		s = 3;
		i = 2500;
		result = s++;
		assertTrue(" s >= 1 et s <= 5 et i > 2000", s == result);
		// pour i <= 2000
		i = 1500;
		result = s--;
		assertTrue(" s >= 1 et s <= 5 et i <= 2000", s == result);

		fail("Not yet implemented");
	}

}
