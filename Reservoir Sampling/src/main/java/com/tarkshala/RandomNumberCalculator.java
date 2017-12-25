package com.tarkshala;

import java.util.Random;

/**
 * Random number calculator,
 *
 * 1. Primarily, it have a method to give a number with equal probability from the stream received.
 *
 * @author kuldeep@tarkshala.com
 */
public class RandomNumberCalculator {

    /**
     * Count of elements that have been received till now.
     */
    private int count;

    /**
     * Selected number to be returned. It was chosen with a probability [1/count].
     */
    private int selection;

    private Random random;

    public RandomNumberCalculator() {
        count = 0;
        selection = Integer.MIN_VALUE;
        this.random = new Random();
        this.random.setSeed(System.currentTimeMillis());
    }

    /**
     * Seed next number.
     */
    public void submitNextNumber(int number) {
        count++;
        if (shouldChangeWithIncoming()) {
            this.selection = number;
        }
    }

    /**
     * It decides whether the incoming number should replace the selection.
     * If true then replace, not otherwise.
     *
     * @return true with probability [1/count]
     */
    private boolean shouldChangeWithIncoming() {
        int randomNumber = random.nextInt();
        if(randomNumber%count == 0) {
            return true;
        } else {
            return false;
        }
    }

    /**
     * Get the selected number.
     *
     * @return randomly selected number from the set submitted by {@link #submitNextNumber(int)}.
     */
    public int getSelection() {
        return this.selection;
    }
}
