package com.kuldeep;

import static org.junit.Assert.assertEquals;

/**
 * Junit test for PalindromeUtilsTest.
 * <p>
 * Created by kuldeep on 01/05/16.
 */
public class PalindromeUtilsTest {

    @org.junit.Test
    public void testCountInsertions() throws Exception {

        int count = PalindromeUtils.countInsertions("a");
        assertEquals(0, count);

        count = PalindromeUtils.countInsertions("ab");
        assertEquals(1, count);

        count = PalindromeUtils.countInsertions("geeks");
        assertEquals(3, count);

        PalindromeUtils utils = new PalindromeUtils();

        count = utils.countInsertionsDP("a");
        assertEquals(0, count);

        count = utils.countInsertionsDP("ab");
        assertEquals(1, count);

        count = utils.countInsertionsDP("geeks");
        assertEquals(3, count);
    }
}