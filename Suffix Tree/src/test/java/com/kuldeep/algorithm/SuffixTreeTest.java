package com.kuldeep.algorithm;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * Junit test for SuffixTree
 * <p>
 * Created by kuldeep on 12/05/16.
 */
public class SuffixTreeTest {

    @Test
    public void testInsert() throws Exception {

        SuffixTree suffixTree = new SuffixTree();
        suffixTree.insert("banana");
        assertTrue(suffixTree.isPresent("anan"));
        assertTrue(suffixTree.isPresent("nan"));
        assertTrue(suffixTree.isPresent("a"));
        assertTrue(suffixTree.isPresent("ba"));
        assertFalse(suffixTree.isPresent("ab"));
    }
}