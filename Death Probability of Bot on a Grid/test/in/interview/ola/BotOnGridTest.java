package in.interview.ola;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * Junit test for {@link BotOnGrid}.
 * 
 * @author kuldeep
 */
public class BotOnGridTest {

	@Test
	public void testDeathProbability() {
		
		double probability = BotOnGrid.deathProbability(4, 4, 0, 0, 1);
		assertEquals(0.5, probability, 0);
		probability = BotOnGrid.deathProbability(4, 4, 0, 0, 2);
		assertEquals(0.625, probability, 0);
		probability = BotOnGrid.deathProbability(4, 4, 1, 1, 1);
		assertEquals(0, probability, 0);
		probability = BotOnGrid.deathProbability(4, 4, 1, 1, 2);
		assertEquals(0.125, probability, 0);
		probability = BotOnGrid.deathProbability(4, 4, 1, 1, 3);
		assertEquals(0.28125, probability, 0);
		
		probability = BotOnGrid.deathProbability(1000, 1000, 430, 756, 10);
		assertEquals(0, probability, 0);
		
		BotOnGrid.deathProbability(500, 500, 230, 156, 240);
	}

}
