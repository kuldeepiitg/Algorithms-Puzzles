package in.kuldeepyadav.google.interview;

/**
 * Reverse the preorder traversal to get back the BST.
 * 1. Initialize root pointing node having last value. 
 * 2. Iterate preorder in reverse order. 
 * 
 * 	2.1 If next node is smaller than root then make the right of new node point to current subtree.
 * 		And make the new node root child of tree.
 * 
 * 	2.2 If next node is larger than root then go on traversing rightmost series of edges and stop 
 * 		at the first node which is larger than next node. That means the found node and all its children 
 * 		are smaller than the next node. Also  all skiped nodes and their left children are smaller than 
 * 		next node. Make larger subtree as right child of new node and skipped one as left subtree. Take 
 * 		new node as root.
 * 
 * Time: O(n)
 * Space: O(1)
 * 
 * @author kuldeep
 */
public class PreorderToBST {
	
	/**
	 * The array containing preorder of a BST.
	 */
	private int[] preorder;

	public PreorderToBST(int[] preorder) {
		super();
		this.preorder = preorder;
	}
	
	/**
	 * @return Binary search tree for given preorder.
	 */
	public Node makeBST() {
		
		Node root = null;
		
		for (int i = preorder.length-1; i >= 0; i--) {
			root = insert(preorder[i], root);
		}
		return root;
	}
	
	/**
	 * Insert a value in binary search tree such that
	 * preorder for new BST is value followed by preorder of 
	 * old BST.
	 * 
	 * @param value value of new {@link Node} to insert.
	 * @param root root of existing BST.
	 * @return root of new BST.
	 */
	private Node insert(int value, Node root) {
		
		if (root == null) {
			return new Node(value);
		}
		
		Node largerThanValue = root;
		Node parent = null;
		
		while (largerThanValue.getValue() < value && largerThanValue.hasRight()) {
			parent = largerThanValue;
			largerThanValue = largerThanValue.getRight();
		}
		
		if (parent != null) {
			parent.setRight(null);
		}
		
		Node node = new Node(value);
		node.setRight(largerThanValue);
		if (largerThanValue != root) {
			node.setLeft(root);
		}
		root = node;
		return root;
	}
	
	
	
	/**
	 * Binary search tree node.
	 * 
	 * @author kuldeep
	 */
	public class Node {
		
		/**
		 * The value stored in node.
		 */
		private int value;
		
		/**
		 * The left child node.
		 */
		private Node left;
		
		/**
		 * The right child node.
		 */
		private Node right;

		public Node(int value) {
			super();
			this.value = value;
		}

		/**
		 * @return the left
		 */
		public Node getLeft() {
			return left;
		}

		/**
		 * @param left the left to set
		 */
		public void setLeft(Integer leftValue) {
			this.left = new Node(leftValue);
		}
		
		public void setLeft (Node node) {
			this.left = node;
		}

		/**
		 * @return the right
		 */
		public Node getRight() {
			return right;
		}

		/**
		 * @param right the right to set
		 */
		public void setRight(int rightValue) {
			this.right = new Node(rightValue);
		}
		
		public void setRight(Node node) {
			this.right = node;
		}

		/**
		 * @return the value
		 */
		public int getValue() {
			return value;
		}
		
		/**
		 * @return true if node have a left child.
		 */
		public boolean hasLeft() {
			return left != null;
		}
		
		/**
		 * @return true if node has a right child.
		 */
		public boolean hasRight() {
			return right != null;
		}
		
		/**
		 * Print preorder of subtree considering this node as root.
		 */
		public void preOrder() {
			System.out.println(value);
			if (left != null) {
				left.preOrder();
			}
			if (right != null) {
				right.preOrder();
			}
		}
	}
}
