package in.kuldeepyadav.google.interview;

import java.util.LinkedList;
import java.util.List;

public class IntegerBinaryTree extends BinaryTree<Integer> {

	/**
	 * @param root root of the tree.
	 * 
	 * @return {@link List} of sum along left diagonals.
	 */
	public List<Integer> sumAlongDiagonals() {
		
		List<Node<Integer>> firstQueue = new LinkedList<Node<Integer>>();
		List<Node<Integer>> secondQueue = new LinkedList<Node<Integer>>();
		List<Integer> sums = new LinkedList<Integer>();
		
		firstQueue.add(root);
		while (!firstQueue.isEmpty() || !secondQueue.isEmpty()) {
			
			int diagonalSum = 0;
			while(!firstQueue.isEmpty()) {
				Node<Integer> node = firstQueue.remove(0);
				while (node != null) {
					if (node.getRight() != null) {
						secondQueue.add(node.getRight());
					}
					diagonalSum += node.getValue();
					node = node.getLeft();
				}
			}
			sums.add(diagonalSum);
			
			firstQueue = secondQueue;
			secondQueue = new LinkedList<Node<Integer>>();
		}
		
		return sums;
	}
}
