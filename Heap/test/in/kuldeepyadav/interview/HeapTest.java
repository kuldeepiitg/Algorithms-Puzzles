package in.kuldeepyadav.interview;

import static org.junit.Assert.*;

import java.util.Comparator;
import java.util.Iterator;

import org.junit.Test;

/**
 * Junit test for {@link Heap} and {@link HeapIterator}.
 * 
 * @author kuldeep
 */
public class HeapTest {

	@Test
	public void testInsert() {
		
		HeapList<Integer> heap = new HeapList<Integer>(new Comparator<Integer>() {

			@Override
			public int compare(Integer o1, Integer o2) {
				return o1-o2;
			}
		});

		for (int i = 1; i < 10; i++) {
			heap.insert(i);
		}
		
		int i = 9;
		Iterator<Integer> it = heap.iterator();
		while (it.hasNext()) {
			assertEquals((Integer)i, it.next());
			i--;
		}
		
		i = 9;
		while (heap.size() > 1) {
			assertEquals((Integer)i, heap.pop());
			i--;
		}
		
	}

}
