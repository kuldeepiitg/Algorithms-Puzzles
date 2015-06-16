package in.interview.ola;

import java.util.Comparator;

import in.kuldeepyadav.google.interview.Node;

/**
 * Extended binary search.
 * 
 * Have inorder predecessor and successor of a node.
 * 
 * @author kuldeep
 *
 * @param <T>
 */
public class BinarySearchTree<T> extends
		in.kuldeepyadav.google.interview.BinarySearchTree<T> {

	public BinarySearchTree(Comparator<T> comparator) {
		super(comparator);
	}

	/**
	 * @param key
	 * @return inorder predecessor of node containing value equal to key
	 */
	public T inorderPredecessor(T key) {

		Node<T> node = searchNode(key);
		if (node.getLeft() == null) {
			return null;
		}

		return findRightMostNode(node.getLeft()).getValue();
	}
	
	/**
	 * @param key
	 * @return inorder successor of node containing value equal to key
	 */
	public T inorderSucessor(T key) {
		
		Node<T> node = searchNode(key);
		if (node.getRight() == null) {
			return null;
		}
		
		return findLeftMostNode(node.getRight()).getValue();
	}
	
	/**
	 * For the given tree
	 * 			1
	 * 		2		3
	 * 			4 5		6
	 * 		7
	 * 	8
	 * 
	 * 2 is leftmost node, 
	 * the node which is in left of left of ... left of root 
	 * and it doesn't have left child
	 * 
	 * @param root
	 * 		root node of tree
	 * @return leftmost node
	 */
	private Node<T> findLeftMostNode(Node<T> root) {

		while (root.getLeft() != null) {
			root = root.getLeft();
		}
		return root;
	}
	
	/**
	 * @param root
	 * 		the root node of tree
	 * @return	rightmost node
	 */
	private Node<T> findRightMostNode(Node<T> root) {
		
		while(root.getRight() != null) {
			root = root.getRight();
		}
		return root;
	}
}
