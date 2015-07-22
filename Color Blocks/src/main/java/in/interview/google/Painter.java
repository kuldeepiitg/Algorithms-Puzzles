package in.interview.google;

/**
 * Painter who paints the blocks keeping conditions in mind.
 * 
 * @author kuldeep
 */
public class Painter {

	/**
	 * Count of blocks.
	 */
	private int blocksCount;

	public Painter(int blocksCount) {
		super();
		this.blocksCount = blocksCount;
	}

	/**
	 * @return count of possible configurations, such that at max two blocks are
	 *         painted with same color.
	 */
	public int colorBlocks() {

		if (blocksCount == 0) {
			return 0;
		} else if (blocksCount == 1) {
			return 2;
		} else {
			return colorBlocks(blocksCount).getAllPossible();
		}
	}

	/**
	 * @param n
	 *            count of blocks
	 * @return count of possible configurations, such that at max two blocks are
	 *         with same color.
	 */
	private TwoBlocks colorBlocks(int n) {

		if (n == 1 || n == 0) {
			return new TwoBlocks(0, 0, 0, 0);
		} else if (n == 2) {
			return new TwoBlocks(1, 1, 1, 1);
		}

		int rr = 1, rb = 1, br = 1, bb = 1;

		for (int i = 3; i <= n; i++) {
			int nextRR = br, nextRB = rr + br, nextBR = rb + bb, nextBB = rb;

			rr = nextRR;
			rb = nextRB;
			br = nextBR;
			bb = nextBB;
		}

		return new TwoBlocks(rr, rb, br, bb);
	}
	

	/**
	 * @return count of possible configurations, such that at max two blocks are
	 *         painted with same color.
	 */
	public int colorBlocksEfficient(){
		
		if (blocksCount == 0) {
			return 0;
		} else if (blocksCount == 1) {
			return 2;
		} else {
			return colorBlocksEfficient(blocksCount).getAllPossible();
		}

	}
	
	/**
	 * @param n
	 *            count of blocks
	 * @return count of possible configurations, such that at max two blocks are
	 *         with same color.
	 */
	private TwoBlocks colorBlocksEfficient(int n) {
		
		if (n == 1 || n == 0) {
			return new TwoBlocks(0, 0, 0, 0);
		} else if (n == 2) {
			return new TwoBlocks(1, 1, 1, 1);
		}
		
		return new TwoBlocks(
				Fibonacci.number(n-1),
				Fibonacci.number(n),
				Fibonacci.number(n),
				Fibonacci.number(n-1));
	}

	/**
	 * Configuration where last two blocks can be RR : red, red RB : red, black
	 * BR : black, red BB : black, black
	 * 
	 * @author kuldeep
	 *
	 */
	private class TwoBlocks {

		/**
		 * Count of configurations where last two blocks are colored with
		 * RR(Red, Red), RB, BR, BB respectively.
		 */
		private int rr, rb, br, bb;

		public TwoBlocks(int rr, int rb, int br, int bb) {
			super();
			this.rr = rr;
			this.rb = rb;
			this.br = br;
			this.bb = bb;
		}

		/**
		 * @return count of all possible configurations.
		 */
		public int getAllPossible() {
			return rr + rb + br + bb;
		}
	}

}
