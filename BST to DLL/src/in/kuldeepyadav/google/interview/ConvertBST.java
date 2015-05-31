package in.kuldeepyadav.google.interview;

import in.kuldeepyadav.google.interview.ConvertBST.BST.Node;

/**
 * Convert a Binary Search Tree to Doubly Linked List.
 * 
 * @author kuldeep
 */

@SuppressWarnings("rawtypes")
public class ConvertBST {

	/**
	 * Convert BST to DLL.
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
	
	@SuppressWarnings("unchecked")
	private static Pair<Node> convert(Node node) {
		
		Pair<Node> leftDLL = null, rightDLL = null;
		if (node.getLeft() != null) {
			leftDLL = convert(node.getLeft());
		}
		if (node.getRight() != null) {
			rightDLL = convert(node.getRight());
		}
		
		if (leftDLL != null) {
			leftDLL.getSecond().setRight(node);;
			node.setLeft(leftDLL.getSecond());
			leftDLL.setSecond(node);
		} else {
			leftDLL = new Pair<Node>(node, node);
		}
		
		if (rightDLL != null) {
			leftDLL.getSecond().setRight(rightDLL.getFirst());
			rightDLL.getFirst().setLeft(leftDLL.getSecond());
			leftDLL.setSecond(rightDLL.getSecond());
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
		
		private T first;
		
		private T second;

		public Pair(T first, T second) {
			super();
			this.first = first;
			this.second = second;
		}
		
		/**
		 * @return the first
		 */
		public T getFirst() {
			return first;
		}

		/**
		 * @return the second
		 */
		public T getSecond() {
			return second;
		}

		/**
		 * @param first the first to set
		 */
		public void setFirst(T first) {
			this.first = first;
		}

		/**
		 * @param second the second to set
		 */
		public void setSecond(T second) {
			this.second = second;
		}
		
	}
	
	/**
	 * The Binary Search Tree.
	 * 
	 * @author kuldeep
	 */
	public static class BST<E extends Comparable<E>> {
		
		/**
		 * The root Node.
		 */
		Node<E> root;
		
		/**
		 * Insert new node in tree.
		 * 
		 * @param value value of new node to be inserted.
		 */
		public void insert(E value) {
			Node<E> newNode = new Node<E>(value);
			insert(newNode);
		}
		
		/**
		 * Insert new Node in tree.
		 * 
		 * @param newNode node to be inserted.
		 */
		public void insert(Node<E> newNode) {
			if (root == null) {
				root = newNode;
			} else {
				
				Node<E> ptr = root;
				
				while (true){
					if (newNode.getValue().compareTo(ptr.getValue()) > 0 && ptr.getRight() != null) {
						ptr = ptr.getRight();
					} else if (newNode.getValue().compareTo(ptr.getValue()) < 0 && ptr.getLeft() != null) {
						ptr = ptr.getLeft();
					} else if (newNode.getValue().compareTo(ptr.getValue()) > 0) {
						ptr.setRight(newNode);
						return;
					} else if (newNode.getValue().compareTo(ptr.getValue()) < 0) {
						ptr.setLeft(newNode);
						return;
					} else if (newNode.getValue().compareTo(ptr.getValue()) == 0) {
						throw new RuntimeException("Numbers should be distinct");
					}
				}
			}
		}
		
		/**
		 * Traverse BST in Inorder fashion.
		 */
		private void traverseInorder(Node<E> ptr) {
			
			if (ptr.getLeft() != null) {
				traverseInorder(ptr.getLeft());
			}
			System.out.println(ptr.getValue());
			if (ptr.getRight() != null) {
				traverseInorder(ptr.getRight());
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
		private void traversePreorder(Node<E> ptr){
			
			System.out.println(ptr.getValue());
			if (ptr.getLeft() != null) {
				traversePreorder(ptr.getLeft());
			}
			if (ptr.getRight() != null) {
				traversePreorder(ptr.getRight());
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
		@SuppressWarnings("hiding")
		public class Node<E extends Comparable<E>> {
			
			/**
			 * Value stored.
			 */
			private E value;
			
			/**
			 * Left child.
			 */
			private Node<E> left;
			
			/**
			 * Right child.
			 */
			private Node<E> right;

			public Node(E value) {
				super();
				this.value = value;
			}

			/**
			 * @return the value
			 */
			public E getValue() {
				return value;
			}

			/**
			 * @return the left
			 */
			public Node<E> getLeft() {
				return left;
			}

			/**
			 * @return the right
			 */
			public Node<E> getRight() {
				return right;
			}

			/**
			 * @param left the left to set
			 */
			public void setLeft(Node<E> left) {
				this.left = left;
			}

			/**
			 * @param right the right to set
			 */
			public void setRight(Node<E> right) {
				this.right = right;
			}
			
		}
	}
}
