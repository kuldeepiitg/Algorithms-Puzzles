package in.kuldeepyadav.google.interview;

import java.util.Comparator;

import org.junit.Test;

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
		System.out.println();
		binarySearchTree.preOrderTraversal();
		System.out.println();
		System.out.println(binarySearchTree.search(23));
		System.out.println(binarySearchTree.search(3));
	}

}
