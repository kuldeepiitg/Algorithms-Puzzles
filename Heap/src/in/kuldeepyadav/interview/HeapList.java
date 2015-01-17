package in.kuldeepyadav.interview;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;

/**
 * Heap Data Structure. This is a max-heap, 
 * so for min-heap comparator is needed to be changed accordingly.
 * 
 * @author kuldeep
 */
public class HeapList<E> extends ArrayList<E>{
	
	/**
	 * Serial version id.
	 */
	private static final long serialVersionUID = -6657316750434483630L;
	
	/**
	 * Start index of heap array.
	 */
	private static final int START_INDEX = 1;
	
	/**
	 * The {@link Comparator} to compare two instances of any type of {@link Object}s.
	 */
	private Comparator<E> comparator;
	
	public HeapList(Comparator<E> comparator) {
		super();
		this.comparator = comparator;
		// 0th element is always to be kept null.
		add(null);
	}

	/**
	 * Bubble up the element at index until it is 
	 * larger than all nodes below in its subtree.
	 * 
	 * @param index
	 * 		index of the element to be bubbled up.
	 * @return	Top(largest) element.
	 */
	private E bubbleUpFromBottom(int index) {
		
		while (index > START_INDEX) {
			if (comparator.compare(get(index), get(index/2)) > 0) {
				E upperElement = get(index/2);
				set(index/2, get(index));
				set(index, upperElement);
				index /= 2;
			} else {
				break;
			}
		}
		return get(START_INDEX);
	}
	
	/**
	 * Insert the element in heap.
	 * 
	 * @param element
	 * 			element to be inserted.
	 */
	public E insert(E element) {
		add(element);
		return bubbleUpFromBottom(size() - 1);
	}
	
	/**
	 * Drop down the element at index until it is
	 * larger than both the children in heap.
	 * @param index
	 * 		index of element to be dropped down.
	 * @return
	 * 		Top(largest) element.
	 */
	private E dropPebbleFromTop(int index) {
		
		int nextLevelIndex;
		while (true) {
			if(2*index+1 < size()) {
				nextLevelIndex = comparator.compare(get(2*index+1), get(2*index)) > 0 ? 
						2*index+1 : 2*index;
			} else if (2*index < size()) {
				nextLevelIndex = 2*index;
			} else {
				break;
			}
			
			if (comparator.compare(get(nextLevelIndex), get(index)) > 0) {
				E nextLevelElement = get(nextLevelIndex);
				set(nextLevelIndex, get(index));
				set(index, nextLevelElement);
			} else {
				break;
			}
			index = nextLevelIndex;
		}
		if(!isEmpty()) {
			return get(START_INDEX);
		} else {
			return null;
		}
	}
	
	/**
	 * @return top(largest) element.
	 */
	public E pop() {
		
		E top = get(START_INDEX);
		E last = remove(size() - 1);
		if (size() - 1 >= START_INDEX) {
			set(START_INDEX, last);
		}
		dropPebbleFromTop(START_INDEX);
		return top;
	}
	
	@Override
	public Iterator<E> iterator(){
		@SuppressWarnings("unchecked")
		HeapList<E> heapCopy = (HeapList<E>) clone();
		return new HeapIterator<E>(heapCopy);
	}
	
	@Override
	public boolean isEmpty(){
		return size() - 1 >= START_INDEX;
	}
	
	/**
	 * Set key on right place. It is needed to be called after
	 * key update operation.
	 * @param index 
	 * 		index of key
	 * @return
	 * 		top(largest) element.
	 */
	public E setKeyOnPlace(int index) {
		dropPebbleFromTop(index);
		bubbleUpFromBottom(index);
		return get(START_INDEX);
	}
}
