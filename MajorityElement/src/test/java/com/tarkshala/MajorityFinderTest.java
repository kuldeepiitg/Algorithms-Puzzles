package com.tarkshala;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class MajorityFinderTest {

    @Before
    public void setUp() throws Exception {
    }

    @Test
    public void findMajor() {

        MajorityFinder finder = new MajorityFinder(new int[]{2,2,2,1,3,4,5,2,6,7,2,2,2});
        System.out.println("Majority won by: " + finder.findMajor());

    }
}