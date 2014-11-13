package in.kuldeepyadav.interview;

import java.util.Comparator;

/**
 * Heap Data Structure. This is a max-heap, so for min-heap comparator is needed to be changed accordingly.
 * 
 * @author kuldeep
 */
public class Heap {
	
	/**
	 * The {@link Comparator} to compare two instances of any type of {@link Object}s.
	 */
	private Comparator<Object> comparator;
	
	/**
	 * Maximum size of heap. It will be doubled when heap overflows.
	 */
	private int size;
	
	/**
	 * Count of elements in heap.
	 */
	private int count;
	
	/**
	 * Array holding elements of heap.
	 */
	private Object[] heap;
	
	public Heap(Comparator<Object> comparator) {
		super();
		this.comparator = comparator;
		this.size = 256;
		this.count = 0;
		this.heap = new Object[size];
	}

	public void insert(Object obj){
		
		if(count >= size - 1) {
			extendHeap();
		}
		insertBubbleAtBottom(obj);
	}
	
	/**
	 * Extend heap size by making array twice the original size.
	 */
	private void extendHeap() {
		Object[] extendedArray = new Object[size*2];
		for (int i = 0; i < heap.length; i++) {
			extendedArray[i] = heap[i];
		}
		size *= 2;
	}
	
	/**
	 * Insert bubble(object) at bottom of heap, it will come up
	 * if it is larger than object at index equal to half of its index. 
	 */
	private void insertBubbleAtBottom(Object obj) {
		
		int lastIndex = count + 1;
		while (lastIndex/2 > 0 && comparator.compare(obj, heap[lastIndex/2]) > 0) {
			heap[lastIndex] = heap[lastIndex/2];
			lastIndex /= 2;
		}
		heap[lastIndex] = obj;
	}
	
	/**
	 * @return true if heap is not empty.
	 */
	public Boolean hasNext() {
		return count > 0;
	}
	
	/**
	 * Remove top(max) element from heap. And heapify again.
	 * @return {@link Object} at top of the {@link Heap}. 
	 */
	private Object next() {
		if (count <= 0){
			throw new RuntimeException("No such element exists.");
		}
		Object toReturn = heap[1];
		Object lastElement = heap[count];
		count--;
		dropPebbleFromTop(lastElement);
		
		return toReturn;
	}
	
	/**
	 * @param obj object to be dropped from top
	 */
	private void dropPebbleFromTop(Object obj){
		
		Object toReturn = heap[1];
		int lastIndex = 1;
		for (int childIndex = chooseChildIndex(lastIndex); childIndex > 0; childIndex = chooseChildIndex(lastIndex)) {
			
			if (comparator.compare(heap[childIndex], heap[lastIndex]) > 0) {
				heap[lastIndex] = heap[childIndex];
				lastIndex = childIndex;
			} else {
				break;
			}
		}
		heap[lastIndex] = obj;
		
	}
	
	/**
	 * @param parentIndex index of parent node.
	 * @return index of child who is larger
	 */
	private int chooseChildIndex(int parentIndex) {
		
		if (parentIndex*2+1 < heap.length) {
			if (comparator.compare(heap[parentIndex*2+1], heap[parentIndex*2]) > 0) {
				return parentIndex*2+1;
			} else {
				return parentIndex*2;
			}
		} else if (parentIndex*2 < heap.length) {
			return parentIndex*2;
		} else {
			return -1;
		}
	}
	
}
