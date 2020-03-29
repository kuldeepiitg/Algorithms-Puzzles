package com.tarkshala;

import java.util.Arrays;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        int[] array = new int[]{0, -1, 2, -3, 1, 4, -4};
        Arrays.sort(array);
        bruteForce(array);
        System.out.println("========================");
        sortScanFromBothEnds(array);
    }

    public static void bruteForce(int[] array) {
        Arrays.sort(array);
        for (int i = 0; i < array.length; i++) {
            for (int j = i+1; j < array.length; j++) {
                for (int k = j+1; k < array.length; k++) {
                    if (array[i] + array[j] + array[k] == 0) {
                        System.out.println(array[i] + ", " + array[j] + ", " + array[k]);
                    }
                }
            }
        }
    }

    public static void sortScanFromBothEnds(int[] array) {
        Arrays.sort(array);
        for (int i = 1; i < array.length - 1; i++) {
            int j = 0;
            int k = array.length - 1;

            while (j < i && k > i) {
                int sum = array[j] + array[i] + array[k];
                if (sum == 0) {
                    do {
                        System.out.println(array[j] + ", " + array[i] + ", " + array[k]);
                        j++;
                    } while (j < i && array[j] == array[j-1]);
                    j--;
                    while (k-1 > i && array[k] == array[k-1]) {
                        k--;
                        System.out.println(array[j] + ", " + array[i] + ", " + array[k]);
                    }

                    j++;
                } else if (sum < 0) {
                    j++;
                } else {
                    k--;
                }
            }
        }

    }
}
