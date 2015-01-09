package in.kuldeepyadav.google.interview;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.LinkedList;

import org.junit.Test;

/**
 * Junit test for {@link IntegerBinaryTree}
 * 
 * @author kuldeep
 */
public class IntegerBinaryTreeTest {

	@Test
	public void test() {
		
		IntegerBinaryTree binaryTree = new IntegerBinaryTree();
		
		// This is balanced binary tree just like a heap.
		binaryTree.insert(1,2,3,4,5,6,7,8,9);
		assertEquals(new LinkedList<Integer>(Arrays.asList(15, 23, 7)), 
				binaryTree.sumAlongDiagonals());
	}

}
