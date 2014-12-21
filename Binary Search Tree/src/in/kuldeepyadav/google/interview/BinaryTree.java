package in.kuldeepyadav.google.interview;


/**
 * Binary Search Tree.
 * 
 * @author kuldeep
 */
public class BinaryTree<T> {
	
	/**
	 * The root node of tree.
	 */
	protected Node<T> root;
	
	/**
	 * Print preorder.
	 */
	public void preOrderTraversal(){
		preOrderTraversal(root);
	}
	
	/**
	 * @param node root of subtree whose preorder is to be printed.
	 */
	private void preOrderTraversal(Node<T> node){
		if (node != null) {
			System.out.print(node.getValue() + ", ");
		}
		if (node.getLeft() != null) {
			preOrderTraversal(node.getLeft());
		}
		if (node.getRight() != null) {
			preOrderTraversal(node.getRight());
		}
	}
	
	/**
	 * Print inorder traversal.
	 */
	public void inOrderTraversal() {
		inOrderTraversal(root);
	}
	
	/**
	 * @param node root of the subtree whose inorder is to be printed.
	 */
	private void inOrderTraversal(Node<T> node) {
		if (node.getLeft() != null) {
			inOrderTraversal(node.getLeft());
		}
		if (node != null) {
			System.out.print(node.getValue() + ", ");
		}
		if (node.getRight() != null) {
			inOrderTraversal(node.getRight());
		}
	}
	
	/**
	 * @param value 
	 * 			value to be searched.
	 * @return true if a node exists in tree with given value.
	 */
	public boolean search(T value) {
		return search(root, value);
	}
	
	/**
	 * @param root
	 * 			root of subtree, where searching is to be done.
	 * @param value 
	 * 			value to be searched
	 * @return true 
	 * 			if node with asked value is present in tree.
	 */
	private boolean search(Node<T> root, T value) {
		
		boolean toReturn = false;
		if (root.getValue() == value) {
			toReturn = true;
		}
		if (toReturn) {
			return toReturn;
		}
		if (root.getLeft() != null) {
			toReturn |= search(root.getLeft(), value);
		}
		if (toReturn) {
			return toReturn;
		}
		if (root.getRight() != null) {
			toReturn |= search(root.getRight(), value);
		}
		return true;
	}
}
