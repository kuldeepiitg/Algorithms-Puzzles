package in.kuldeepyadav.google.interview;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

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
	
	/**
	 * @param tree {@link BinaryTree} to be checked.
	 * @return true if given tree is {@link BinarySearchTree}.
	 */
	public boolean isBST(BinaryTree<T> tree) {
		Map<String, Object> map = isBSTsubTree(tree.root);
		return (boolean) map.get("bst");
	}
	
	/**
	 * @param node root {@link Node} of subtree.
	 * @return true if subtree is a {@link BinarySearchTree}.
	 */
	@SuppressWarnings("unchecked")
	private Map<String, Object> isBSTsubTree(Node<T> node) {
		Map<String, Object> toReturn = new HashMap<String, Object>();
		
		if (node.getLeft() == null && node.getRight() == null) {
			toReturn.put("bst",true);
			toReturn.put("min", node.getValue());
			toReturn.put("max", node.getValue());
		} else if (node.getLeft() == null) {
			Map<String, Object> rightMap = isBSTsubTree(node.getRight());
			if ((boolean) rightMap.get("bst") && comparator.compare((T) rightMap.get("min"), node.getValue()) >= 0) {
				toReturn.put("bst", true);
				toReturn.put("min", node.getValue());
				toReturn.put("max", rightMap.get("max"));
			} else {
				toReturn.put("bst", false);
			}
		} else if (node.getRight() == null) {
			Map<String, Object> leftMap = isBSTsubTree(node.getLeft());
			if ((boolean) leftMap.get("bst") && comparator.compare((T) leftMap.get("max"), node.getValue()) <= 0) {
				toReturn.put("bst", true);
				toReturn.put("min", leftMap.get("min"));
				toReturn.put("max", node.getValue());
			} else {
				toReturn.put("bst", false);
			}
		} else {
			Map<String, Object> leftMap = isBSTsubTree(node.getLeft());
			Map<String, Object> rightMap = isBSTsubTree(node.getRight());
			if ((boolean) leftMap.get("bst") && (boolean) rightMap.get("bst") &&
					comparator.compare((T) leftMap.get("max"), node.getValue()) <= 0 &&
					comparator.compare((T) rightMap.get("min"), node.getValue()) >= 0) {
				toReturn.put("bst", true);
				toReturn.put("min", leftMap.get("min"));
				toReturn.put("max", rightMap.get("max"));
			} else {
				toReturn.put("bst", false);
			}
		}
		return toReturn;
	}
}
