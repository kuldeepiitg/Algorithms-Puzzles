package com.inbhiwadi;

/**
 * Methods related to arrays
 * <p>
 * Created by Kuldeep Yadav on 27/09/16.
 */
class MinimumSumArray {

    /**
     * Input array
     */
    private int[] array;

    /**
     * Store to keep already computed values
     */
    private int[][] computed;

    MinimumSumArray(int[] array) {
        this.array = array;
        // In 2-D matrix, each row tells least sum with 0,1,2 blanks
        this.computed = new int[array.length][3];
        for (int i = 0; i < computed.length; i++) {
            for (int j = 0; j < 3; j++) {
                computed[i][j] = -1;
            }
        }
    }

    private int sum(int start, int offsetAllowance) {

        if (computed[start][offsetAllowance] != -1) {
            return computed[start][offsetAllowance];
        }

        if (start == array.length - 1) {
            if (offsetAllowance == 0) {
                computed[start][offsetAllowance] = array[start];
            } else if (offsetAllowance == 1) {
                computed[start][offsetAllowance] = 0;
            } else if (offsetAllowance == 2) {
                computed[start][offsetAllowance] = 0;
            }
        } else {
            if (offsetAllowance == 0) {
                computed[start][offsetAllowance] = array[start] + sum(start + 1, 2);
            } else if (offsetAllowance == 1) {
                computed[start][offsetAllowance]
                        = Math.min(array[start] + sum(start + 1, 2), sum(start + 1, 0));
            } else if (offsetAllowance == 2) {
                computed[start][offsetAllowance]
                        = Math.min(array[start] + sum(start + 1, 2), sum(start + 1, 1));
            }
        }
        return computed[start][offsetAllowance];
    }

    /**
     * Minimum sum of array such that none of consecutive triplets are untouched
     * that is atleast one number of every triplet is taken into sum.
     *
     * @return minimum sum
     */
    int sum() {
        return sum(0, 2);
    }
}
