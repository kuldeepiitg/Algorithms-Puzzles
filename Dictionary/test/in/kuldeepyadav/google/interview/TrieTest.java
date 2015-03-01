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
		assertTrue(tire.isPresent("box"));
		assertFalse(tire.isPresent("lol"));
		tire.delete("box");
		assertFalse(tire.isPresent("box"));
		assertTrue(tire.isPresent("ox"));
	}
}
