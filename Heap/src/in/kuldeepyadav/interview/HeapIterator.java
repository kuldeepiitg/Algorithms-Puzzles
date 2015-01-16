package in.kuldeepyadav.interview;

import java.util.Iterator;

/**
 * Iterator for {@link Heap}.
 * 
 * @author kuldeep
 */
public class HeapIterator<E> implements Iterator<E> {

	/**
	 * Local copy of heap.
	 */
	private HeapList<E> heapCopy;
	
	public HeapIterator(HeapList<E> heapCopy) {
		super();
		this.heapCopy = heapCopy;
	}

	@Override
	public boolean hasNext() {
		
		return heapCopy.size() > 1;
	}

	@Override
	public E next() {
		
		return heapCopy.pop();
	}
}
