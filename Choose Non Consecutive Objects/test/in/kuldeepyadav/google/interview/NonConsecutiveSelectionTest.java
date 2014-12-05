package in.kuldeepyadav.google.interview;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * Junit test for {@link NonConsecutiveSelection}.
 * 
 * @author kuldeep
 */
public class NonConsecutiveSelectionTest {

	@Test
	public void testSelect() {
		
		NonConsecutiveSelection nonConsecutiveSelection = new NonConsecutiveSelection();
		assertEquals(4368, nonConsecutiveSelection.select(20, 5));
	}
}
