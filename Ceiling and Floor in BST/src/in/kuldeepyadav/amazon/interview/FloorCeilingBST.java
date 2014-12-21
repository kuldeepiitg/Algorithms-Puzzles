package in.kuldeepyadav.amazon.interview;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

import in.kuldeepyadav.google.interview.BinarySearchTree;
import in.kuldeepyadav.google.interview.Node;

/**
 * {@link BinarySearchTree} with Floor and Ceiling methods.
 * 
 * @author kuldeep
 *
 * @param <T>
 */
public class FloorCeilingBST<T> extends BinarySearchTree<T> {

	public FloorCeilingBST(Comparator<T> comparator) {
		super(comparator);
	}

	/**
	 * @param value 
	 * @return {@link Node}s which are floor and ceiling to value.
	 */
	public Map<String, Node<T>> getFloorCeiling(T value){
		
		Node<T> floor = null,ceiling = null;
		Node<T> ptr = root;
		while (true) {
			if (comparator.compare(value, ptr.getValue()) < 0) {
				ceiling = ptr;
				if (ptr.getLeft() != null) {
					ptr = ptr.getLeft();
				} else {
					break;
				}
			} else if (comparator.compare(value, ptr.getValue()) > 0) {
				floor = ptr;
				if (ptr.getRight() != null) {
					ptr = ptr.getRight();
				} else {
					break;
				}
			} else {
				floor = ceiling = ptr;
				break;
			}
		}
		
		Map<String,Node<T>> floorCeiling = new HashMap<String, Node<T>>();
		floorCeiling.put("floor", floor);
		floorCeiling.put("ceiling", ceiling);
		return floorCeiling;
	}
}
