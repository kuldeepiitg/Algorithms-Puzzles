package in.kuldeepyadav.google.interview;

import in.kuldeepyadav.google.interview.ConvertBST.BST;
import in.kuldeepyadav.google.interview.ConvertBST.BST.Node;

import org.junit.Test;

/**
 * Junit test for {@link Convert}
 * 
 * @author kuldeep
 *
 */
public class ConvertTest {

	@SuppressWarnings("unchecked")
	@Test
	public void test() {
		
		@SuppressWarnings("rawtypes")
		BST bst = new BST();
		
		bst.insert(4);
		bst.insert(2);
		bst.insert(6);
		bst.insert(1);
		bst.insert(3);
		bst.insert(5);
		bst.insert(7);
		
		bst.traverseInorder();
		System.out.println();
		bst.traversePreorder();
		System.out.println();
		
		@SuppressWarnings("rawtypes")
		Node root = ConvertBST.convert(bst);
		while(root != null) {
			System.out.println(root.getValue());
			
			if (root.getRight() == null) {
				break;
			}
			root = root.getRight();
		}
		System.out.println();
		while (root != null) {
			System.out.println(root.getValue());
			root = root.getLeft();
		}
		
	}

}
