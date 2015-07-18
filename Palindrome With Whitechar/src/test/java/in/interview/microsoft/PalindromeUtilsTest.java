package in.interview.microsoft;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * Junit test for {@link PalindromeUtils}.
 * 
 * @author kuldeep
 */
public class PalindromeUtilsTest {

	@Test
	public void testIsPalindromIgnoreWhitespace() {
		
		assertTrue(PalindromeUtils.isPalindromIgnoreWhitespace(""));
		assertTrue(PalindromeUtils.isPalindromIgnoreWhitespace("abcba"));
		assertTrue(PalindromeUtils.isPalindromIgnoreWhitespace("abccba"));
		assertTrue(PalindromeUtils.isPalindromIgnoreWhitespace("a		bc b		a"));
		assertTrue(PalindromeUtils.isPalindromIgnoreWhitespace("	 	 	 	"));
		assertFalse(PalindromeUtils.isPalindromIgnoreWhitespace("abcb	ca"));
	}

}
