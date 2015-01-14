package in.kuldeepyadav.google.interview;

/**
 * Elements to be wrapped in {@link Node}.
 * 
 * @author kuldeep
 */
public class Element {

	/**
	 * Count of words ending here.
	 * For a dictionary it is either 0 if no word ends here,
	 * 1 if there is such word in dictionary.
	 */
	private int wordCount;
	
	/**
	 * Next {@link Node} from this Element.
	 */
	private Node nextNode;

	public Element() {
		super();
		this.wordCount = 0;
	}
	
	/**
	 * @return increase count by 1 and return updated value of count.
	 */
	public int incrementWordCount() {
		wordCount++;
		return wordCount;
	}

	/**
	 * @return the wordCount
	 */
	public int getWordCount() {
		return wordCount;
	}

	/**
	 * @return the nextNode
	 */
	public Node getNextNode() {
		return nextNode;
	}
	
	/**
	 * Set the next {@link Node}.
	 */
	public Node setNextNode() {
		nextNode = new Node();
		return nextNode;
	}
}
