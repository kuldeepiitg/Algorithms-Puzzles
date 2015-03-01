package in.kuldeepyadav.google.interview;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * Junit test for {@link Element}.
 * 
 * @author kuldeep
 */
public class ElementTest {

	@Test
	public void testElement() {
		Element element1 = new Element();
		Element element2 = new Element();
		
		assertNotEquals(element1.hashCode(), element2.hashCode());
	}
}
