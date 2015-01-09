package in.kuldeepyadav.google.interview;

import java.util.LinkedList;
import java.util.List;


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
}
