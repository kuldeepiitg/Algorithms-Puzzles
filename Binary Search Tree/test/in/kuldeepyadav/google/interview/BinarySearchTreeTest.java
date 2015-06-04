package in.kuldeepyadav.google.interview;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

import org.apache.commons.lang3.ArrayUtils;
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
		
		int[] expectedPreorder = new int[]{8,4,2,1,3,6,5,7,12,10,11,14};
		int[] expectedInorder = new int[]{1,2,3,4,5,6,7,8,10,11,12,14};
		int[] expectedPostorder = new int[]{1,3,2,5,7,6,4,11,10,14,12,8};
		
		assertTrue(binarySearchTree.search(3));
		assertFalse(binarySearchTree.search(23));
		
		List<Integer> outputPreorder = new ArrayList<Integer>();
		Iterator<Integer> itr = binarySearchTree.preorderIterator();
		while (itr.hasNext()) {
			Integer integer = (Integer) itr.next();
			outputPreorder.add(integer);
		}
		assertArrayEquals(expectedPreorder, ArrayUtils.toPrimitive(outputPreorder.toArray(new Integer[0])));
		
		List<Integer> outputInorder = new ArrayList<Integer>();
		itr = binarySearchTree.inorderIterator();
		while (itr.hasNext()) {
			Integer integer = (Integer) itr.next();
			outputInorder.add(integer);
		}
		assertArrayEquals(expectedInorder, ArrayUtils.toPrimitive(outputInorder.toArray(new Integer[0])));
		
		List<Integer> outputPostorder = new ArrayList<Integer>();
		itr = binarySearchTree.postorderIterator();
		while (itr.hasNext()) {
			Integer integer = itr.next();
			outputPostorder.add(integer);
		}
		assertArrayEquals(expectedPostorder, ArrayUtils.toPrimitive(outputPostorder.toArray(new Integer[0])));
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
		
		int[] expectedInorder = new int[]{1,2,3,4,5,6,7,8,10,11,12,14};
		List<Integer> outputInorder = new ArrayList<Integer>();
		Iterator<Integer> itr = binaryTree.inorderIterator();
		while (itr.hasNext()) {
			Integer integer = (Integer) itr.next();
			outputInorder.add(integer);
		}
		assertArrayEquals(expectedInorder, ArrayUtils.toPrimitive(outputInorder.toArray(new Integer[0])));
		
		binaryTree = new BinaryTree<Integer>();
		binaryTree.insert(1,2,3,4,5,6,7,8,9);
		binaryTree.insert(10,11);
		assertFalse(binarySearchTree.isBST(binaryTree));
	}

	@Test
	public void testArrayToTree(){
		
		Comparator<Integer> comparator = new Comparator<Integer>() {

			@Override
			public int compare(Integer o1, Integer o2) {
				return o1-o2;
			}
		};
		
		Integer[] sortedArray = new Integer[]{1,2,3,4,5,6,7};
		BinarySearchTree<Integer> binarySearchTree = new BinarySearchTree<Integer>(comparator, sortedArray);
		
		Iterator<Integer> itr = binarySearchTree.inorderIterator();
		List<Integer> outputInorder = new ArrayList<Integer>();
		while (itr.hasNext()) {
			Integer integer = (Integer) itr.next();
			outputInorder.add(integer);
		}
		assertArrayEquals(ArrayUtils.toPrimitive(sortedArray), ArrayUtils.toPrimitive(outputInorder.toArray(new Integer[0])));
	}
	
}
