package in.kuldeepyadav.interview;

import static org.junit.Assert.*;

import java.util.Comparator;

import org.junit.Test;

public class HeapTest {

	@Test
	public void testInsert() {
		
		Comparator<Element> comparator = new Comparator<Element>() {

			@Override
			public int compare(Element o1, Element o2) {
				return o1.getValue() - o2.getValue();
			}
			
		};
		
//		Heap heap = new Heap(comparator);
		
	}

	
	public class Element {
		int value;

		public Element(int value) {
			super();
			this.value = value;
		}

		public int getValue() {
			return value;
		}
		
	}
}
