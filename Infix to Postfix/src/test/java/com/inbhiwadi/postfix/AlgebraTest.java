package com.inbhiwadi.postfix;

import org.junit.Test;

/**
 * Junit test for {@link Algebra}
 * <p>
 * Created by Kuldeep Yadav on 09/11/16.
 */
public class AlgebraTest {
    @Test
    public void infixToPostfix() throws Exception {

        String infixExpression = Algebra.infixToPostfix("( ( ( 1 + 2 ) * 3 ) - ( 4 + 5 ) )");

        System.out.println(infixExpression);
        System.out.println(Algebra.evaluate(infixExpression));

        infixExpression = Algebra.infixToPostfix("( ( ( 4 * 2 ) + ( 8 / 4 ) ) - ( 2 * ( 5 - 4 ) ) )");

        System.out.println(infixExpression);
        System.out.println(Algebra.evaluate(infixExpression));
    }

}