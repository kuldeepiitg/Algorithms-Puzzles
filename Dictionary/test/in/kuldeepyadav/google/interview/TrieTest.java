package in.kuldeepyadav.google.interview;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * Junit test for {@link Trie}.
 * 
 * @author kuldeep
 */
public class TrieTest {

	@Test
	public void testSearch() {
		
		char[] alphabet = new char[]{'b','i','o','x', 'l'};
		Trie tire = new Trie(alphabet);
		tire.insert("box");
		tire.insert("ox");
		assertTrue(tire.search("box"));
		assertFalse(tire.search("lol"));
	}
}
