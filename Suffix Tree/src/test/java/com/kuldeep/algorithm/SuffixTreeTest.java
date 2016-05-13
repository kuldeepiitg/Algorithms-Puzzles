package com.kuldeep.algorithm;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

// import java.util.Random;

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

        suffixTree = new SuffixTree();
        // Some issues with corner cases
        suffixTree.insert("TCGCCCCTTACTACTCGAGACCAAACACGTCCCCTCCCCACTGCCGCAGTAAGCGAAGCACCACGCTATACACCCCCACCCCCCTACCTTCTCCGCCCACCCCCCTCCCCCAATCCCAACAGAATCGACTACCCGCCACCCCGCCCACCCCACGCGGCGACACTTGAACTACCCGAATCCCCCACACCGCACAAAGCATACTAGAGCCGACCACCGCATGAAGTCACCGCCGCACATCCCCCCCCAACACGCAGGTTACCCAACCATTACACACCCTCCGCCAGCCGCGCCTGCCCCCGCCCTAAGGGTCGCAGTGCCATCTCTCTATTACCTCCAACCCCCACGCCCTGCAACCTATACTAAAACACACGCTCCTTCTCACCCAACCTCAACCAACCACCCCCCACTCCCCCCACACCTACCAGGTCAAATTAGAACACCCCGCAGCCAATCCACGACCCCGCCGACGCCCCACAACTACGCCGAACATCCCCAATCCCACCCCTTTTCTCCCACGAAAAATCCAAAGCACAACTCACTTACCCAACCACATGCCTATCCCAAAGCCACCCCCCCAACCACACATCATCCCAGTCATCTCTATATACCCTTCCTAACACACGTCTTACCGCCACTCGACCCCTATTCGAGCCACACAGACACCAAAATCGCCACCCCAATGCCGCCGCCGAACCGCCCTCCACCAAAGGGTGCACTGACCCACCATTAATGCGACGTACCCCCCCCGGCACCCACGGCTCCATGCCACGCGCACCTAAACTATCAGGGTCCCCCACCGTCATGCCCCCATTACCCGACGGCCCATCTCACCCCCCCCTTGGCACTCACTAGCCGCCAATCATCCACACAGCCCCCCGCCCCACCCCTCACCGACCACTCCCCCCTCACGCCCAGTCCACTCCCTCACTCCGCCGATCTCACCACGCACTATTATTCTCCCAACCCCCCCCGCCCCGTAACAAGGAAACCCCTAAATACA");


//        Random numberGenerator = new Random();
//        StringBuilder builder = new StringBuilder();
//        int dnaStrandLength = 1000;
//        for (int i = 0; i < dnaStrandLength; i++) {
//            int randomNumber = numberGenerator.nextInt();
//            if(randomNumber%4 == 0) {
//                builder.append('A');
//            } else if(randomNumber%4 == 1) {
//                builder.append('T');
//            } else if(randomNumber%4 == 2) {
//                builder.append('G');
//            } else {
//                builder.append('C');
//            }
//        }
//
//        String dnaStrand = builder.toString();
//        SuffixTree dnaSuffixTree = new SuffixTree();
//        dnaSuffixTree.insert(dnaStrand);
//        for (int i = 0; i < 10; i++) {
//            int start = numberGenerator.nextInt()%dnaStrandLength;
//            int end = start + numberGenerator.nextInt()%(dnaStrandLength - start - 1);
//            assertTrue(dnaSuffixTree.isPresent(dnaStrand.substring(start, end)));
//        }

    }
}