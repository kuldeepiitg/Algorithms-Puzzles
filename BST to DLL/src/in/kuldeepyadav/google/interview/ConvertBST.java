package in.kuldeepyadav.google.interview;

import in.kuldeepyadav.google.interview.ConvertBST.BST.Node;

/**
 * Convert a Binary Search Tree to Doubly Linked List.
 * 
 * @author kuldeep
 */
public class ConvertBST {

	/**
	 * Conver BST to DLL.
	 * 
	 * @param bst BST to be converted.
	 * 
	 * @return root of DLL.
	 */
	public static Node convert(BST bst) {
		
		return convert(bst.root).first;
	}
	
	/**
	 * Convert BST to DLL.
	 * 
	 * @param node root of subtree.
	 * 
	 * @return {@link Pair} containing start and end nodes.
	 */
	private static Pair<Node> convert(Node node) {
		
		Pair<Node> leftDLL = null, rightDLL = null;
		if (node.left != null) {
			leftDLL = convert(node.left);
		}
		if (node.right != null) {
			rightDLL = convert(node.right);
		}
		
		if (leftDLL != null) {
			leftDLL.second.right = node;
			node.left = leftDLL.second;
			leftDLL.second = node;
		} else {
			leftDLL = new Pair<Node>();
			leftDLL.first = node;
			leftDLL.second = node;
		}
		
		if (rightDLL != null) {
			leftDLL.second.right = rightDLL.first;
			rightDLL.first.left = leftDLL.second;
			leftDLL.second = rightDLL.second;
		}
		return leftDLL;
	}
	
	/**
	 * Pair of Object
	 * 
	 * @author kuldeep
	 *
	 * @param <T>
	 */
	public static class Pair<T> {
		
		public T first;
		
		public T second;
	}
	
	/**
	 * The Binary Search Tree.
	 * 
	 * @author kuldeep
	 */
	public static class BST {
		
		/**
		 * The root Node.
		 */
		Node root;
		
		/**
		 * Insert new node in tree.
		 * 
		 * @param value value of new node to be inserted.
		 */
		public void insert(int value) {
			Node newNode = new Node(value);
			insert(newNode);
		}
		
		/**
		 * Insert new Node in tree.
		 * 
		 * @param newNode node to be inserted.
		 */
		public void insert(Node newNode) {
			if (root == null) {
				root = newNode;
			} else {
				
				Node ptr = root;
				while(true) {
					if (newNode.value > ptr.value && ptr.right != null) {
						ptr = ptr.right;
					} else if (newNode.value < ptr.value && ptr.left != null) {
						ptr = ptr.left;
					} else if (newNode.value > ptr.value) {
						ptr.right = newNode;
						return;
					} else if (newNode.value < ptr.value) {
						ptr.left = newNode;
						return;
					} else if (newNode.value == ptr.value) {
						throw new RuntimeException("Numbers should be distinct");
					}
				}
			}
		}
		
		/**
		 * Traverse BST in Inorder fashion.
		 */
		private void traverseInorder(Node ptr) {
			
			if (ptr.left != null) {
				traverseInorder(ptr.left);
			}
			System.out.println(ptr.value);
			if (ptr.right != null) {
				traverseInorder(ptr.right);
			}
		}
		
		/**
		 * Traverse the tree in Inorder fashion.
		 */
		public void traverseInorder(){
			traverseInorder(root);
		}
		
		/**
		 * Traverse subtree rooted at ptr in preorder fashion.
		 * 
		 * @param ptr root of subtree.
		 */
		private void traversePreorder(Node ptr){
			
			System.out.println(ptr.value);
			if (ptr.left != null) {
				traversePreorder(ptr.left);
			}
			if (ptr.right != null) {
				traversePreorder(ptr.right);
			}
		}
		
		/**
		 * Traverse tree in preorder fashion.
		 */
		public void traversePreorder() {
			traversePreorder(root);
		}
		
		/**
		 * Binary Search Tree node.
		 * 
		 * @author kuldeep
		 */
		public class Node {
			
			/**
			 * Value stored.
			 */
			public int value;
			
			/**
			 * Left child.
			 */
			public Node left;
			
			/**
			 * Right child.
			 */
			public Node right;

			public Node(int value) {
				super();
				this.value = value;
			}
		}
	}
}
