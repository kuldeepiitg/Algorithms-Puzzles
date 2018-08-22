package com.tarkshala;

public class MinimumJumpComputer {

    private int[] jumps;

    private int[] minJumps;

    public MinimumJumpComputer(int[] jumps) {
        this.jumps = jumps;
        this.minJumps = new int[jumps.length];
        for (int i = 0; i < minJumps.length; i++) {
            minJumps[i] = -1;
        }
    }

    public int compute() {
        minJumps[minJumps.length - 1] = 0;
        for (int i = jumps.length - 2; i >= 0; i--) {
            int min = findMinimum(i, jumps[i]);
            min += 1;
            minJumps[i] = min;
        }
        return minJumps[0];
    }

    private int findMinimum(int startIndex, int count) {
        int min = Integer.MAX_VALUE - 100;  // Take a sufficient large values
        for (int i = 1; i <= count; i++) {
            if (startIndex + i < jumps.length &&
                    minJumps[startIndex + i] < min) {
                min = minJumps[startIndex + i];
            }
        }
        return min;
    }
}
