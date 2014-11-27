package in.kuldeepyadav.google.interview;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * Junit test for {@link AnagramComparator}.
 * 
 * @author kuldeep
 */
public class AnagramComparatorTest {

	@Test
	public void testCompare() {
		
		AnagramComparator anagramComparator = new AnagramComparator();
		assertTrue(anagramComparator.compare("hello", "hello") == 0);
		assertTrue(anagramComparator.compare("hello", "olleh") == 0);
		assertTrue(anagramComparator.compare("abc", "abcd") < 0);
		assertTrue(anagramComparator.compare("abcd", "abce") < 0);
		assertTrue(anagramComparator.compare("abcd", "abced") < 0);
	}

}
