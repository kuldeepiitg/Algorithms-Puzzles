package in.kuldeepyadav.google.interview;

import org.junit.Test;

public class AnagramSorting {

	@Test
	public void test() {
		
		String[] array = new String[]{"abc", "bca", "a", "b"};
		Sort<String> sort = new Sort<String>(new AnagramComparator());
		sort.sort(array);
		
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
	}

}
