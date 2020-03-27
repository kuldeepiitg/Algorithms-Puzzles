package com.tarkshala;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class AppTest 
    extends TestCase
{
    public void testGetLastManAlive() {
        assertEquals(73, App.getLastManAlive(100));
    }
}
