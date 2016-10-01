package com.inbhiwadi;

import junit.framework.TestCase;

/**
 * Junit test for {@link BitsCounter}.
 * <p>
 * Created by Kuldeep Yadav on 02/10/16.
 */
public class BitsCounterTest extends TestCase {
    public void testCountSumOfBitDifferences() throws Exception {

        int count = BitsCounter.countSumOfBitDifferences(new int[]{1, 2});
        assertEquals(4, count);
        count = BitsCounter.countSumOfBitDifferences(new int[]{1, 3, 5});
        assertEquals(8, count);
    }
}