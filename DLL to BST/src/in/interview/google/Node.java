package in.interview.google;

/**
 * Node of the doubly linked list
 * 
 * @author kuldeep
 */
public class Node<E> {

	/**
	 * Value contained in node.
	 */
	private E value;
	
	/**
	 * Next node after the node.
	 */
	private Node<E> next;
	
	/**
	 * Previous node before the node.
	 */
	private Node<E> previous;

	public Node(E value) {
		super();
		this.value = value;
	}

	/**
	 * @return the next
	 */
	public Node<E> getNext() {
		return next;
	}

	/**
	 * @param next the next to set
	 */
	public void setNext(Node<E> next) {
		this.next = next;
	}

	/**
	 * @return the previous
	 */
	public Node<E> getPrevious() {
		return previous;
	}

	/**
	 * @param previous the previous to set
	 */
	public void setPrevious(Node<E> previous) {
		this.previous = previous;
	}

	/**
	 * @return the value
	 */
	public E getValue() {
		return value;
	}
}
