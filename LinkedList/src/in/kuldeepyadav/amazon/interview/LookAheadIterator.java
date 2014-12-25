package in.kuldeepyadav.amazon.interview;

import java.util.Iterator;

/**
 * Iterator to look ahead without going to next element of list.
 * 
 * @author kuldeep
 */
public class LookAheadIterator<T> implements Iterator<T>{

	/**
	 * The look ahead element.
	 */
	private T lookAhead;
	
	/**
	 * Enclosed Iterator.
	 */
	private Iterator<T> iterator;
	
	@Override
	public boolean hasNext() {
		return lookAhead != null || iterator.hasNext();
	}

	@Override
	public T next() {
		// TODO Auto-generated method stub
		T toReturn = lookAhead;
		if (iterator.hasNext()) {
			lookAhead = iterator.next();
		} else {
			lookAhead = null;
		}
		return toReturn;
	}

	
}
