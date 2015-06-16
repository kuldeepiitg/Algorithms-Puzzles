package in.interview.ola;

import static org.junit.Assert.*;

import java.util.Comparator;

import org.junit.Test;

/**
 * Junit test for {@link BinarySearchTree}
 * 
 * @author kuldeep
 */
public class BinarySearchTreeTest {

	@Test
	public void testInorderPredecessorSuccessor() {
		
		BinarySearchTree<Integer> tree = new BinarySearchTree<Integer>(new Comparator<Integer>() {

			@Override
			public int compare(Integer o1, Integer o2) {
				return o1 - o2;
			}
		});
		tree.insert(8,4,12,10,14,2,6,3,5,7);
		
		Integer predecessor = tree.inorderPredecessor(2);
		assertNull(predecessor);
		predecessor = tree.inorderPredecessor(4);
		assertEquals(3, predecessor.intValue());
		assertEquals(5, tree.inorderSucessor(4).intValue());
	}

}
