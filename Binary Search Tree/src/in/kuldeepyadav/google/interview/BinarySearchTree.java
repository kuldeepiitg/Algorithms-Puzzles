package in.kuldeepyadav.google.interview;

import java.util.Comparator;

/**
 * The Binary Search tree.
 * 
 * @author kuldeep
 *
 * @param <T>
 */
public class BinarySearchTree<T> extends BinaryTree<T> {

	/**
	 * The {@link Comparator}.
	 */
	protected Comparator<T> comparator;
	
	public BinarySearchTree(Comparator<T> comparator) {
		super();
		this.comparator = comparator;
	}

	/**
	 * Insert new nodes in tree.
	 * 
	 * @param values stored in new nodes.
	 */
	@SuppressWarnings("unchecked")
	public void insert(T... values) {
		for (T value : values) {
			insert(value);
		}
	}
	
	/**
	 * Insert a new node in tree.
	 * 
	 * @param value value of the node.
	 */
	private void insert(T value) {
		
		if (root == null) {
			root = new Node<T>(value);
			return;
		}
		
		Node<T> ptr = root;
		while(true) {
			if(comparator.compare(value, ptr.getValue()) < 0) {
				if (ptr.getLeft() == null) {
					ptr.setLeft(new Node<T>(value));
					break;
				} else {
					ptr = ptr.getLeft();
				}
			} else if (comparator.compare(value, ptr.getValue()) > 0) {
				if (ptr.getRight() == null) {
					ptr.setRight(new Node<T>(value));
					break;
				} else {
					ptr = ptr.getRight();
				}
			} else {
				// TODO: we can take a decision for such values to be inserted in either left or right
				System.out.println("redundancy not allowed: " + value);
				break;
			}
		}
	}
	
	@Override
	public boolean search(T value) {
		
		Node<T> ptr = root;
		
		while(true) {
			if(comparator.compare(value, ptr.getValue()) == 0) {
				return true;
			} else if (comparator.compare(value, ptr.getValue()) < 0) {
				if (ptr.getLeft() != null) {
					ptr = ptr.getLeft();
				} else {
					return false;
				}
			} else {
				if (ptr.getRight() != null) {
					ptr = ptr.getRight();
				} else {
				return false;
				}
			}
		}
	}
}
