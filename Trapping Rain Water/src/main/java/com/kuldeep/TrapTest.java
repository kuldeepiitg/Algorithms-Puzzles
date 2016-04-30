package com.kuldeep;

import junit.framework.TestCase;

/**
 * JUnit test for <code>Trap</code>
 * <p>
 * Created by kuldeep on 01/05/16.
 */
public class TrapTest extends TestCase {

    public void testCalculateWater() throws Exception {

        int volume = Trap.calculateWater(new int[]{1, 2, 3, 4, 5, 4, 3, 2, 1});
        assertEquals(20, volume);

        volume = Trap.calculateWater(new int[]{2, 5, 3, 6, 7, 2, 4, 1});
        assertEquals(27, volume);
    }
}