package in.kuldeepyadav.google.interview;

import static org.junit.Assert.*;

import java.util.Comparator;
import java.util.Iterator;

import org.junit.Test;

/**
 * Junit test for BST.
 * 
 * @author kuldeep
 */
public class BinarySearchTreeTest {

	@Test
	public void testInsert() {
		
		BinarySearchTree<Integer> binarySearchTree = new BinarySearchTree<Integer>(new Comparator<Integer>() {

			@Override
			public int compare(Integer o1, Integer o2) {
				return o1-o2;
			}
		});
		
		binarySearchTree.insert(8,4,12,10,14,2,6,1,3,5,7);
		binarySearchTree.insert(11);
		binarySearchTree.inOrderTraversal();
		binarySearchTree.preOrderTraversal();
		assertTrue(binarySearchTree.search(3));
		assertFalse(binarySearchTree.search(23));
		
		Iterator<Integer> itr = binarySearchTree.preorderIterator();
		while (itr.hasNext()) {
			Integer integer = (Integer) itr.next();
			System.out.println(integer);
		}
	}
	
	@Test
	public void testIsBST() {
		
		BinaryTree<Integer> binaryTree = new BinarySearchTree<Integer>(new Comparator<Integer>() {

			@Override
			public int compare(Integer o1, Integer o2) {
				return o1-o2;
			}
		});
		((BinarySearchTree<Integer>) binaryTree).insert(8,4,12,10,14,2,6,1,3,5,7,11);
		
		BinarySearchTree<Integer> binarySearchTree = new BinarySearchTree<Integer>(new Comparator<Integer>() {

			@Override
			public int compare(Integer o1, Integer o2) {
				return o1-o2;
			}
		});
		assertTrue(binarySearchTree.isBST(binaryTree));
		
		binaryTree = new BinaryTree<Integer>();
		binaryTree.insert(1,2,3,4,5,6,7,8,9);
		binaryTree.insert(10,11);
		binaryTree.inOrderTraversal();
		binaryTree.preOrderTraversal();
		assertFalse(binarySearchTree.isBST(binaryTree));
	}

}
