package in.interview.google;

/**
 * Utilities related to LinkedList.
 * 
 * @author kuldeep
 */
public class LinkedlistUtils {

	/**
	 * @param head
	 * 			head of linked list
	 * @return	modified list with every two consecutive nodes swaped.
	 */
	public static Node reverseEveryTwoNodes(Node head){
		
		Node dummy = new Node(Integer.MIN_VALUE);
		dummy.next = head;
		
		Node firstPtr = dummy;
		Node secondPtr = firstPtr.next;
		
		while (true) {
			if (secondPtr != null) {
				Node thirdPtr = secondPtr.next;
				if (thirdPtr != null) {
					secondPtr.next = thirdPtr.next;
					thirdPtr.next = secondPtr;
					firstPtr.next = thirdPtr;
					firstPtr = secondPtr;
					secondPtr = firstPtr.next;
				} else {
					break;
				}
			} else {
				break;
			}
		}
		
		head = dummy.next;
		return head;
	}
	
	public static class Node {
		
		private int data;
		
		private Node next;
		
		public Node(int data){
			this.data = data;
		}
		
		public void setNext(Node next) {
			this.next = next;
		}
		
		public int getValue() {
			return data;
		}
		
		public Node getNext() {
			return next;
		}
	}
}

