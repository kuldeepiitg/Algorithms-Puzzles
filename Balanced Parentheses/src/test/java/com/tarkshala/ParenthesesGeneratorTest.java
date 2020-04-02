package com.tarkshala;

import org.junit.Test;

public class ParenthesesGeneratorTest {

    @Test
    public void printAllParentheses() {

        ParenthesesGenerator parenthesesGenerator = new ParenthesesGenerator();
        parenthesesGenerator.generate(4);
    }
}
