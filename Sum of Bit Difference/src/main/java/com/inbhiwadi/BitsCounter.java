package com.inbhiwadi;

/**
 * Bits counter.
 * <p>
 * Created by Kuldeep Yadav on 02/10/16.
 */
public class BitsCounter {

    /**
     * Count sum of bit differences for every pair of numbers.
     *
     * @param input input array
     * @return count
     */
    public static int countSumOfBitDifferences(int[] input) {

        int[] setBitsAccumulation = new int[32];
        for (int number : input) {
            for (int i = 0; i < 32; i++) {
                if (number % 2 == 1) {
                    setBitsAccumulation[i] += 1;
                }
                number /= 2;
            }
        }

        int count = 0;
        for (int bitAccumulationValue : setBitsAccumulation) {
            count += (bitAccumulationValue * (input.length - bitAccumulationValue));
        }
        return 2 * count;
    }
}
