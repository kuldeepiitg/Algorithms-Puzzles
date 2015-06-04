/**
 * 
 */
package in.interview.google;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Iterator;

import org.apache.commons.lang3.ArrayUtils;
import org.junit.Test;

/**
 * @author kuldeep
 *
 */
public class DoublyLinkedListTest {

	/**
	 * Test method for {@link in.interview.google.DoublyLinkedList#iterator()}.
	 */
	@Test
	public void testIterator() {
		
		DoublyLinkedList<Integer> list = new DoublyLinkedList<Integer>();
		list.add(1);
		list.add(2);
		list.add(3);
		
		Iterator<Integer> iterator = list.iterator();
		
		ArrayList<Integer> output = new ArrayList<Integer>();
		while (iterator.hasNext()) {
			Integer integer = (Integer) iterator.next();
			output.add(integer);
		}
		
		assertArrayEquals(new int[]{1,2,3}, ArrayUtils.toPrimitive(output.toArray(new Integer[0])));
	}

}
