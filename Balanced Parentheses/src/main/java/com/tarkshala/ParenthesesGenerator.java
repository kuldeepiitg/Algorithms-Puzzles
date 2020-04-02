package com.tarkshala;

import java.util.ArrayList;

public class ParenthesesGenerator {

    private ArrayList<String> list;

    public void generate(int max) {
        list = new ArrayList<>();
        generate("", 0, 0, max);
        printAllParentheses();
    }

    private void generate(String parentheses, int open, int closed, int max) {
        if (closed == max) {
            list.add(parentheses);
        }

        if (open < max) {
            parentheses += "{";
            generate(parentheses, open+1, closed, max);
            parentheses = parentheses.substring(0, parentheses.length()-1);
        }

        if (closed < open && closed < max) {
            parentheses += "}";
            generate(parentheses, open, closed + 1, max);
//            parentheses = parentheses.substring(0, parentheses.length()-1);
        }
    }

    private void printAllParentheses() {
        for (String parentheses: list) {
            System.out.println(parentheses);
        }
    }

}
