package in.kuldeepyadav.google.interview;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;


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
	 * Top queue to help in insertion.
	 */
	private List<Node<T>> insertionQueue;
	
	/**
	 * Bottom queue to help in insertion.
	 */
	private List<Node<T>> nextInsertionQueue;
	
	/**
	 * Print preorder.
	 */
	public void preOrderTraversal(){
		preOrderTraversal(root);
		System.out.println();
	}
	
	/**
	 * Insert new elements into tree keeping it balanced.
	 * @param elements 
	 * 		elements to be inserted.
	 */
	@SuppressWarnings("unchecked")
	public void insert(T... elements) {
		
		int i = 0;
		if (root == null) {
			root = new Node<T>(elements[i]);
			insertionQueue = new LinkedList<Node<T>>();
			nextInsertionQueue = new LinkedList<Node<T>>();
			insertionQueue.add(root);
			i++;
		}
		
		for ( ;i < elements.length; i++) {
			Node<T> newNode = new Node<T>(elements[i]);
			Node<T> queueFront = insertionQueue.get(0);
			if(queueFront.getLeft() == null) {
				queueFront.setLeft(newNode);
			} else {
				queueFront.setRight(newNode);
				insertionQueue.remove(0);
			}
			nextInsertionQueue.add(newNode);
			
			if (insertionQueue.isEmpty()) {
				insertionQueue = nextInsertionQueue;
				nextInsertionQueue = new LinkedList<Node<T>>();
			}
		}
	}
	
	/**
	 * @param node root of subtree whose preorder is to be printed.
	 */
	private void preOrderTraversal(Node<T> node) {
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
		System.out.println();
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
		return toReturn;
	}
	
	/**
	 * @return {@link Iterator} which traverses the tree in preorder.
	 */
	public Iterator<T> preorderIterator(){
		
		return new PreorderIterator(root);
	}
	
	/**
	 * Preorder traversal iterator.
	 * @author kuldeep
	 */
	private class PreorderIterator implements Iterator<T> {
		
		/**
		 * Stack to fake recursion
		 */
		private Stack<NodeInStack> stack;
		
		public PreorderIterator(Node<T> node) {
			super();
			this.stack = new Stack<NodeInStack>();
			if(node != null) {
				stack.push(new NodeInStack(node, false, false));
			}
		}

		@Override
		public boolean hasNext() {
			return !stack.isEmpty();
		}

		@Override
		public T next() {
			
			BinaryTree<T>.NodeInStack topNodeInStack = stack.peek();
			setNext();
			return topNodeInStack.getNode().getValue();
		}
		
		/**
		 * Set next node at top of stack to be visited for preorder.
		 */
		private void setNext(){
			while (!stack.isEmpty()) {
				NodeInStack topNodeInStack = stack.peek();
				
				if (!topNodeInStack.hasVisitedLeft()) {
					topNodeInStack.setHasVisitedLeft(true);
					Node<T> node = topNodeInStack.getNode();
					if (node.getLeft() != null) {
						stack.push(new NodeInStack(node.getLeft(), false, false));
						return;
					}
				}
				
				if (!topNodeInStack.hasVisitedRight()) {
					topNodeInStack.setHasVisitedRight(true);
					Node<T> node = topNodeInStack.getNode();
					if (node.getRight() != null) {
						stack.push(new NodeInStack(node.getRight(), false, false));
						return;
					}
				}
				
				stack.pop();
			}
		}

	}
	
	/**
	 * @return {@link Iterator} traversing tree inorderly.
	 */
	public Iterator<T> inorderIterator() {
		return new InorderIterator(root);
	}
	
	/**
	 * Iterator traversing tree inorderly.
	 * 
	 * @author kuldeep
	 */
	private class InorderIterator implements Iterator<T> {
		
		private Stack<NodeInStack> stack;

		public InorderIterator(Node<T> root) {
			this.stack = new Stack<NodeInStack>();
			this.stack.push(new NodeInStack(root, false, false));
			setNextNode();
		}
		
		@Override
		public boolean hasNext() {
			return !stack.isEmpty();
		}

		@Override
		public T next() {
			NodeInStack topNodeInStack = stack.peek();
			setNextNode();
			return topNodeInStack.getNode().getValue();
		}
		
		/**
		 * Set next node in stack to return
		 */
		private void setNextNode() {
			
			while (!stack.isEmpty()) {
				
				NodeInStack topNodeInStack = stack.peek();
				if(!topNodeInStack.hasVisitedLeft()) {
					topNodeInStack.setHasVisitedLeft(true);
					Node<T> node = topNodeInStack.getNode();
					if (node.getLeft() != null) {
						stack.push(new NodeInStack(node.getLeft(), false, false));
						continue;
					} else {
						break;
					}
				}
				
				if(!topNodeInStack.hasVisitedRight()) {
					topNodeInStack.setHasVisitedRight(true);
					Node<T> node = topNodeInStack.getNode();
					stack.pop();
					if (node.getRight() != null) {
						stack.push(new NodeInStack(node.getRight(), false, false));
						continue;
					} else {
						break;
					}
				}
			}
			
			return;
		}
		
	}
	
	/**
	 * @return {@link PostorderIterator}
	 */
	public Iterator<T> postorderIterator(){
		return new PostorderIterator(root);
	}
	
	/**
	 * {@link Iterator} traversing the tree postorderly.
	 * 
	 * @author kuldeep
	 */
	private class PostorderIterator implements Iterator<T> {

		private Stack<NodeInStack> stack;
		
		public PostorderIterator(Node<T> root) {
			super();
			this.stack = new Stack<BinaryTree<T>.NodeInStack>();
			stack.push(new NodeInStack(root, false, false));
			setNextNode();
		}

		@Override
		public boolean hasNext() {
			return !stack.isEmpty();
		}

		@Override
		public T next() {
			
			NodeInStack topNodeInStack = stack.peek();
			setNextNode();
			return topNodeInStack.getNode().getValue();
		}
		
		/**
		 * Set next node on top of stack
		 */
		private void setNextNode(){
			
			NodeInStack topNodeInStack = stack.peek();
			if (topNodeInStack.hasVisitedLeft() && topNodeInStack.hasVisitedRight()) {
				stack.pop();
			}
			
			while(!stack.isEmpty()) {
				topNodeInStack = stack.peek();
				
				Node<T> node = topNodeInStack.getNode();
				if (!topNodeInStack.hasVisitedLeft()) {
					topNodeInStack.setHasVisitedLeft(true);
					if(node.getLeft() != null) {
						stack.push(new NodeInStack(node.getLeft(), false, false));
						continue;
					}
				}
				
				if (!topNodeInStack.hasVisitedRight()) {
					topNodeInStack.setHasVisitedRight(true);
					if (node.getRight() != null) {
						stack.push(new NodeInStack(node.getRight(), false, false));
						continue;
					}
				}
				
				break;
			}
		}
		
	}
	
	
	/**
	 * Node and side.
	 * 
	 * @author kuldeep
	 */
	private class NodeInStack {
		
		/**
		 * BST node
		 */
		private Node<T> node;
		
		/**
		 * true if left child node have been visited
		 */
		private boolean hasVisitedLeft;
		
		/**
		 * true if right child node have been visited
		 */
		private boolean hasVisitedRight;
		
		public NodeInStack(Node<T> node, boolean hasVisitedLeft, boolean hasVisitedRight) {
			super();
			this.node = node;
			this.hasVisitedLeft = hasVisitedLeft;
			this.hasVisitedRight = hasVisitedRight;
		}

		/**
		 * @return the node
		 */
		public Node<T> getNode() {
			return node;
		}

		/**
		 * @return true if left child have been visited
		 */
		public boolean hasVisitedLeft() {
			return hasVisitedLeft;
		}

		/**
		 * @return true if right child have been visited
		 */
		public boolean hasVisitedRight() {
			return hasVisitedRight;
		}
		
		/**
		 * @param hasVisitedLeft the hasVisitedLeft to set
		 */
		public void setHasVisitedLeft(boolean hasVisitedLeft) {
			this.hasVisitedLeft = hasVisitedLeft;
		}

		/**
		 * @param hasVisitedRight the hasVisitedRight to set
		 */
		public void setHasVisitedRight(boolean hasVisitedRight) {
			this.hasVisitedRight = hasVisitedRight;
		}
	}
	
}
