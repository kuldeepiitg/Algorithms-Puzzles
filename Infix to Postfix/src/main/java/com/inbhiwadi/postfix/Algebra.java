package com.inbhiwadi.postfix;

import java.util.Stack;

/**
 * Utilities related to algebra
 * <p>
 * Created by Kuldeep Yadav on 09/11/16.
 */
public class Algebra {

    /**
     * Convert infix string to postfix.
     *
     * @param infixExpression original algebraic expression
     * @return postfix expression
     */
    public static String infixToPostfix(String infixExpression) {

        String[] array = infixExpression.split("\\s+");

        StringBuilder builder = new StringBuilder();
        Stack<String> operationStack = new Stack<String>();
        for (String element : array) {
            if (element.equalsIgnoreCase("(")) {
                operationStack.push(element);
            } else if (isOperator(element)) {
                operationStack.push(element);
            } else if (element.equalsIgnoreCase(")")) {
                if (isOperator(operationStack.peek())) {
                    builder.append(" ");
                    builder.append(operationStack.pop());
                }
                operationStack.pop();
            } else {

                if (builder.length() > 0) {
                    builder.append(" ");
                }
                builder.append(element);

                if (isOperator(operationStack.peek())) {
                    builder.append(" ");
                    builder.append(operationStack.pop());
                } else {
                    // Unused
                }
            }
        }
        return builder.toString();
    }

    /**
     * Check if given input is operator.
     *
     * @param input string
     * @return true if give input is operator.
     */
    private static boolean isOperator(String input) {
        return input.equalsIgnoreCase("+") ||
                input.equalsIgnoreCase("-") ||
                input.equalsIgnoreCase("*") ||
                input.equalsIgnoreCase("/");
    }

    /**
     * Evaluate postfix expression.
     *
     * @param postfixExpression the expression
     * @return solved value
     */
    public static int evaluate(String postfixExpression) {

        String[] array = postfixExpression.split("\\s+");
        Stack<Integer> stack = new Stack<Integer>();
        for (String element : array) {
            if (isOperator(element)) {
                int second = stack.pop();
                int first = stack.pop();
                if (element.equalsIgnoreCase("+")) {
                    stack.push(first + second);
                } else if (element.equalsIgnoreCase("-")) {
                    stack.push(first - second);
                } else if (element.equalsIgnoreCase("*")) {
                    stack.push(first * second);
                } else if (element.equalsIgnoreCase("/")) {
                    stack.push(first / second);
                }
            } else {
                stack.push(Integer.valueOf(element));
            }
        }

        return stack.peek();
    }
}
