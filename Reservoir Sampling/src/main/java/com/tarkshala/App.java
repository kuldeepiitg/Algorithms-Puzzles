package com.tarkshala;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        RandomNumberCalculator randomNumberCalculator = new RandomNumberCalculator();

        int[] input = new int[]{1,2,3,4,5,6,7};

//        Scanner in = new Scanner(System.in);
//        int num;
//        while (true) {
//            System.out.print("Please give next number in stream: ");
//            num = in.nextInt();
//            randomNumberCalculator.submitNextNumber(num);
//            System.out.println("The random number selected: " + randomNumberCalculator.getSelection());
//        }

        for (int number: input) {
            randomNumberCalculator.submitNextNumber(number);
            System.out.println("The random number selected: " + randomNumberCalculator.getSelection());
        }
    }
}
