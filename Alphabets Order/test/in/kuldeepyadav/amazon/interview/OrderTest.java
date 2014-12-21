package in.kuldeepyadav.amazon.interview;

import java.util.LinkedList;
import java.util.List;

import org.junit.Test;

public class OrderTest {

	@Test
	public void testGetAlphabetInOrder() {
		
		List<String> dictionary = new LinkedList<String>();
		dictionary.add("aaaaa");
		dictionary.add("aaaab");
		dictionary.add("aaac");
		dictionary.add("aadz");
		dictionary.add("abdaa");
		dictionary.add("ad");
		
		Order order = new Order();
		List<Character> list = order.getAlphabetInOrder(dictionary);
		System.out.println(list);
	}

}
