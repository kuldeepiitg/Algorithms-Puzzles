package com.tarkshala;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class SubsequenceCounterTest {

    @Before
    public void setUp() throws Exception {

    }

    @Test
    public void count() {
        String sequence = "rabbbbiiiitit";
        String subsequence = "rabbit";
        SubsequenceCounter subsequenceCounter = new SubsequenceCounter(sequence, subsequence);
        System.out.println(subsequenceCounter.count());
    }
}