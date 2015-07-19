package in.interview.google;

import static org.junit.Assert.*;

import java.util.LinkedList;
import java.util.List;

import org.apache.commons.lang3.ArrayUtils;
import org.junit.Test;

import in.interview.google.LinkedlistUtils.Node;

/**
 * Junit test for {@link LinkedlistUtils}
 * 
 * @author kuldeep
 */
public class LinkedlistUtilsTest {

	@Test
	public void testReverseEveryTwoNodes() {
		
		Node head = new Node(11);
		
		for (int i = 10; i > 0; i--) {
			Node node = new Node(i);
			node.setNext(head);
			head = node;
		}
		
		head = LinkedlistUtils.reverseEveryTwoNodes(head);
		
		int[] expected = new int[]{2,1,4,3,6,5,8,7,10,9,11};
		List<Integer> outputList = new LinkedList<Integer>();
		while (head != null) {
			outputList.add(head.getValue());
			head = head.getNext();
		}
		int[] output = ArrayUtils.toPrimitive(outputList.toArray(new Integer[0]));
		assertArrayEquals(expected, output);
	}

}
