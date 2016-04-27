package com.kuldeep;

import java.util.Arrays;

/**
 * Find contiguous subarray in given array with given sum
 *
 * Created by kuldeep on 27/04/16.
 */
public class SubarrayFinder {

    /**
     * @param array original array containing random positive integers
     * @param sum sum of required subarray
     * @return contiguous part of original array with given sum, null if not present.
     */
    public static int[] subarrayWithSum(int[] array, int sum) {

        int left = 0;
        int right = -1;
        int closestSum = 0;

        while (++right < array.length) {
            closestSum += array[right];
            if(closestSum == sum) {
                return Arrays.copyOfRange(array, left, right+1);
            }

            while (closestSum > sum && left <= right) {
                closestSum -= array[left++];

                if(closestSum == sum) {
                    return Arrays.copyOfRange(array, left, right+1);
                }
            }
        }

        return null;
    }
}
