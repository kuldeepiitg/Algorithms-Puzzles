package in.kuldeepyadav.google.interview;

import in.kuldeepyadav.google.interview.PreorderToBST.Node;

import org.junit.Test;
import org.junit.runners.JUnit4;

/**
 * {@link JUnit4} test for {@link PreorderToBST}.
 * 
 * @author kuldeep
 */
public class PreorderToBSTTest {

	@Test
	public void test() {
		
		int[] preorder1 = new int[]{4,5,6};
		PreorderToBST preorderToBST = new PreorderToBST(preorder1);
		Node root = preorderToBST.makeBST();
		root.preOrder();
		System.out.println("#####################");
		
		int[] preorder2 = new int[]{5,4,6};
		preorderToBST = new PreorderToBST(preorder2);
		root = preorderToBST.makeBST();
		root.preOrder();
		System.out.println("#####################");
		
		int[] preOrder3 = new int[]{90,10,20,60,40,30,50,70,80};
		preorderToBST = new PreorderToBST(preOrder3);
		root = preorderToBST.makeBST();
		root.preOrder();
		
	}

}
