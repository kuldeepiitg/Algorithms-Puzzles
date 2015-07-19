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
	
	/**
	 * Count of configurations for blocks count from 0 to blocksCount
	 */
	private TwoBlocks[] permutations;
	
	public Painter(int blocksCount) {
		super();
		this.blocksCount = blocksCount;
		this.permutations = new TwoBlocks[blocksCount + 1];
	}

	/**
	 * @return count of possible configurations, such that at max two blocks are painted with same color.
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
	 * 		count of blocks
	 * @return	count of possible configurations, such that at max two blocks are with same color.
	 */
	private TwoBlocks colorBlocks(int n) {
		
		if (permutations[n] != null) {
			return permutations[n];
		}
		
		if (n == 1 || n == 0) {
			return new TwoBlocks(0, 0, 0, 0);
		} else if (n == 2) {
			return new TwoBlocks(1, 1, 1, 1);
		}
		
		TwoBlocks permutationsForNminusOne = colorBlocks(n-1);
		permutations[n] = new TwoBlocks(permutationsForNminusOne.getBR(),
				permutationsForNminusOne.getRR() + permutationsForNminusOne.getBR(),
				permutationsForNminusOne.getRB() + permutationsForNminusOne.getBB(), 
				permutationsForNminusOne.getRB());
		return permutations[n];
	}
	
	
	/**
	 * Configuration where last two blocks can be 
	 * RR : red, red
	 * RB : red, black
	 * BR : black, red
	 * BB : black, black
	 * 
	 * @author kuldeep
	 *
	 */
	private class TwoBlocks {
		
		/**
		 * Count of configurations where last two blocks are
		 * colored with RR(Red, Red), RB, BR, BB respectively.
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
		 * @return the rr
		 */
		public int getRR() {
			return rr;
		}

		/**
		 * @return the rb
		 */
		public int getRB() {
			return rb;
		}

		/**
		 * @return the br
		 */
		public int getBR() {
			return br;
		}

		/**
		 * @return the bb
		 */
		public int getBB() {
			return bb;
		}
		
		/**
		 * @return count of all possible configurations.
		 */
		public int getAllPossible() {
			return rr + rb + br + bb;
		}
	}
	
}
