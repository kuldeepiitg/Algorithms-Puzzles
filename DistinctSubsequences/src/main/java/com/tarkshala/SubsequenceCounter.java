package com.tarkshala;

public class SubsequenceCounter {

    private String sequence;

    private String subsequence;

    private int[][] counts;

    public SubsequenceCounter (String sequence, String subsequence) {
        this.sequence = sequence;
        this.subsequence = subsequence;
        this.counts = new int[sequence.length()][subsequence.length()];
        for (int i = 0; i < counts.length; i++) {
            for (int j = 0; j < counts[i].length; j++) {
                counts[i][j] = -1;
            }
        }
    }

    public int count(){
        return count(0,0);
    }

    private int count(int sequenceStartIndex, int subsequenceStartIndex) {

        if (subsequenceStartIndex == subsequence.length()) {
            return 1;
        }
        if (sequenceStartIndex == sequence.length()) {
            return 0;
        }

        if (counts[sequenceStartIndex][subsequenceStartIndex] >= 0) {
            return counts[sequenceStartIndex][subsequenceStartIndex];
        } else {

            int computedCount;
            if (sequence.charAt(sequenceStartIndex) == subsequence.charAt(subsequenceStartIndex)) {
                computedCount = count(sequenceStartIndex + 1, subsequenceStartIndex + 1) +
                        count(sequenceStartIndex + 1, subsequenceStartIndex);
            } else {
                computedCount = count(sequenceStartIndex + 1, subsequenceStartIndex);
            }
            counts[sequenceStartIndex][subsequenceStartIndex] = computedCount;
            return computedCount;
        }
    }

}
