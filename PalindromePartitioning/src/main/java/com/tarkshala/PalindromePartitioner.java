package com.tarkshala;

import java.util.LinkedList;
import java.util.Queue;

public class PalindromePartitioner {

    private String line;

    private boolean[][] palindromeMarkers;

    public PalindromePartitioner(String line) {
        this.line = line;
        this.palindromeMarkers = new boolean[line.length()][line.length()];
    }

    public void findPalindromes() {
        for (int i = 0; i < line.length(); i++) {
            int start = i;
            int end = i;
            palindromeMarkers[start][end] = true;
            while (true) {
                if (start - 1 >= 0 && end + 1 < line.length() && line.charAt(start - 1) == line.charAt(end + 1)) {
                    start--;
                    end++;
                    palindromeMarkers[start][end] = true;
                } else {
                    break;
                }
            }

            start = i;
            if (start + 1 < line.length() && line.charAt(start) == line.charAt(start + 1)) {
                end = start + 1;
                palindromeMarkers[start][end] = true;
            } else {
                break;
            }

            while (true) {
                if (start - 1 >= 0 && end + 1 < line.length() && line.charAt(start - 1) == line.charAt(end + 1)) {
                    start--;
                    end++;
                    palindromeMarkers[start][end] = true;
                } else {
                    break;
                }
            }
        }
    }

    public int breadthFirstSearch() {
        // To implement
        return -1;
    }
}
