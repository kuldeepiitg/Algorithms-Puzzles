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

	@Test
	public void test() {
		
		BST bst = new BST();
		
		bst.insert(4);
		bst.insert(2);
		bst.insert(6);
		bst.insert(1);
		bst.insert(3);
		bst.insert(5);
		bst.insert(7);
		
//		bst.traverseInorder();
//		System.out.println();
//		bst.traversePreorder();
//		System.out.println();
		
		Node root = ConvertBST.convert(bst);
		while(root != null) {
			System.out.println(root.value);
			
			if (root.right == null) {
				break;
			}
			root = root.right;
		}
		System.out.println();
		while (root != null) {
			System.out.println(root.value);
			root = root.left;
		}
		
	}

}
