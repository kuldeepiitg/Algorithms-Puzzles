package com.inbhiwadi;

import static org.junit.Assert.assertEquals;

/**
 * Junit test for {@link MinimumSumArray}
 * <p>
 * Created by Kuldeep Yadav on 28/09/16.
 */
public class MinimumSumArrayTest {
    @org.junit.Before
    public void setUp() throws Exception {

    }

    @org.junit.After
    public void tearDown() throws Exception {

    }

    @org.junit.Test
    public void sum() throws Exception {

        MinimumSumArray minimumSumArray = new MinimumSumArray(new int[]{1, 2, 3});
        assertEquals(1, minimumSumArray.sum());

        minimumSumArray = new MinimumSumArray(new int[]{1, 2, 3, 6, 7, 1});
        assertEquals(4, minimumSumArray.sum());

        minimumSumArray = new MinimumSumArray((new int[]{1, 2, 3, 6, 7, 1, 8, 6, 2, 7, 7, 1}));
        assertEquals(7, minimumSumArray.sum());
    }
}