package com.inbhiwadi;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Kuldeep Yadav on 03/10/16.
 */
public class ArraySwap {

    private int[] array;
    private Map<Integer, Integer> mapping;
    private Map<Integer, Integer> indexes;

    public ArraySwap(int[] array, int[] mapping) {
        this.array = array;
        this.mapping = new HashMap<Integer, Integer>();
        this.indexes = new HashMap<Integer, Integer>();

        for (int i = 0; i < array.length; i++) {
            this.indexes.put(array[i], i);
        }

        for (int i = 0; i < mapping.length; i++) {
            if (i % 2 == 0) {
                this.mapping.put(mapping[i], mapping[i + 1]);
            } else {
                this.mapping.put(mapping[i], mapping[i - 1]);
            }
        }
    }

    public int minSwapCount() {
        // TODO: 04/10/16 implementation yet not done, not very hard. Just an enumeration. 
        int swapCount = 0;
        for (int i = 0; i < array.length; i++) {

        }
        return 0;
    }

}
