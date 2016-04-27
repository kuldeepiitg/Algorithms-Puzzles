package com.kuldeep;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * JUnit test for <code>SubarrayFinder</code>
 *
 * Created by kuldeep on 27/04/16.
 */
public class SubarrayFinderTest {

    @Test
    public void testSubarrayWithSum() throws Exception {

        int[] array = new int[]{20,34,23,6,8,9,1,27,36,10};
        int sum = 24;
        int[] subarray = SubarrayFinder.subarrayWithSum(array, sum);
        int[] expected = new int[]{6,8,9,1};
        assertArrayEquals(expected, subarray);
    }
}