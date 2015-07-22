package in.interview.google;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * Junit test for {@link Painter}.
 * 
 * @author kuldeep
 */
public class PainterTest {

	@Test
	public void testColorBlocks() {
		
		assertEquals(0, (new Painter(0)).colorBlocks());
		assertEquals(2, (new Painter(1)).colorBlocks());
		assertEquals(4, (new Painter(2)).colorBlocks());
		assertEquals(6, (new Painter(3)).colorBlocks());
		assertEquals(10, (new Painter(4)).colorBlocks());
		assertEquals(110, (new Painter(9)).colorBlocks());
		(new Painter(100)).colorBlocks();
	}
}
