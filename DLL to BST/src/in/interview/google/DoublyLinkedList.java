package in.interview.google;

import java.util.Iterator;

/**
 * Doubly linked list.
 * 
 * @author kuldeep
 */
public class DoublyLinkedList<E extends Comparable<E>> {

	/**
	 * Head node of the list.
	 */
	private Node<E> head;
	
	/**
	 * Tail node of the list.
	 */
	private Node<E> tail;
	
	public DoublyLinkedList(Node<E> head, Node<E> tail) {
		this.head = head;
		this.tail = tail;
	}
	
	public DoublyLinkedList() {
		this.head = null;
		this.tail = null;
	}
	
	/**
	 * Append element at tail of list
	 * @param e element
	 */
	public void add(E e) {
		if(tail == null) {
			head = tail = new Node<E>(e);
		} else {
			Node<E> originalTail = tail;
			tail.setNext(new Node<E>(e));
			tail = tail.getNext();
			tail.setPrevious(originalTail);
		}
	}
	
	/**
	 * @return {@link Iterator} over linked list
	 */
	public Iterator<E> iterator(){
		
		return new Iterator<E>() {

			private Node<E> current = head;
			
			@Override
			public boolean hasNext() {
				return current != null;
			}

			@Override
			public E next() {
				E toReturn = current.getValue();
				current = current.getNext();
				return toReturn;
			}
			
		};
	}
}
