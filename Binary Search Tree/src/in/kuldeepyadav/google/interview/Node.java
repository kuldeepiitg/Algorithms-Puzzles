package in.kuldeepyadav.google.interview;

/**
 * Binary Tree node.
 * 
 * @author kuldeep
 */
public class Node<T> {

	/**
	 * Value stored at node.
	 */
	private T value;
	
	/**
	 * Left child.
	 */
	private Node<T> left;
	
	/**
	 * Right child.
	 */
	private Node<T> right;

	public Node(T value) {
		super();
		this.value = value;
	}

	/**
	 * @return left child node.
	 */
	public Node<T> getLeft() {
		return left;
	}

	/**
	 * Set the node as left child.
	 * 
	 * @param left node to be set in left.
	 */
	public void setLeft(Node<T> left) {
		this.left = left;
	}

	/**
	 * @return the right child.
	 */
	public Node<T> getRight() {
		return right;
	}

	/**
	 * Set the node as right child.
	 * 
	 * @param right node to be set in right.
	 */
	public void setRight(Node<T> right) {
		this.right = right;
	}

	/**
	 * @return the value stored in node.
	 */
	public T getValue() {
		return value;
	}
	
}
