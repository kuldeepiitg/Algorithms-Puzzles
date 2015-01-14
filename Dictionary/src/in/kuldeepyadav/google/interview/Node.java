package in.kuldeepyadav.google.interview;


/**
 * A Node in a Tire
 * 
 * @author kuldeep
 */
public class Node {

	/**
	 * Size of alphabet.
	 */
	private static int ALPHABET_SIZE;
	
	/**
	 * All elements.
	 */
	private Element[] elementArray;
	
	public Node(){
		
		this.elementArray = new Element[ALPHABET_SIZE];
		for(int i = 0; i < ALPHABET_SIZE; i++) {
			this.elementArray[i] = new Element();
		}
	}

	/**
	 * @return the elementArray
	 */
	public Element[] getElementArray() {
		return elementArray;
	}

	/**
	 * @return the ALPHABET_SIZE
	 */
	public static int getAlphabetSize() {
		return Node.ALPHABET_SIZE;
	}

	/**
	 * @param alphabetSize the ALPHABET_SIZE to set
	 */
	public static void setAlphabetSize(int alphabetSize) {
		Node.ALPHABET_SIZE = alphabetSize;
	}
	
}
