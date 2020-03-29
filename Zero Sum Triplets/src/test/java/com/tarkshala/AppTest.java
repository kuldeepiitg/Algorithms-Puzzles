package com.tarkshala;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );
    }

    @Test
    public void testApp() {
        int[] array = new int[20];
        for (int i = 0; i < 20; i++) {
            array[i] = ThreadLocalRandom.current().nextInt(-10,10);
        }
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));
        App.bruteForce(array);
        System.out.println("============================");
        App.sortScanFromBothEnds(array);
    }
}
