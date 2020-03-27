package com.tarkshala;

/**
 * To run the program from command line
 * ```
 * $ mvn clean install
 * $ mvn exec:java -Dexec.mainClass="com.tarkshala.App" -Dexec.args="2"
 * ```
 */
public class App 
{
    public static void main( String[] args )
    {

        int size = Integer.parseInt(args[0]);
        int lastMan = getLastManAlive(size);
        System.out.println("============ Last man alive =============");
        System.out.println(lastMan);
        System.out.println("============ Last man alive =============");
    }

    public static int getLastManAlive(int totalMen) {

        int[] array = new int[totalMen];
        for (int i = 0; i < totalMen; i++) {
            array[i] = i + 1;
        }

        if (totalMen < 3) {
            return 1;
        }

        int index = 1;
        int previouslyLeft = 0;
        array[index] *= -1;
        int remaining = totalMen - 1;

        while (true) {

            do {
                index = (index + 1) % totalMen;
            } while (array[index] < 0);
            previouslyLeft = index;

            do {
                index = (index + 1) % totalMen;
            } while (array[index] < 0);

            array[index] *= -1;
            remaining--;

            if (remaining == 1) {
                return array[previouslyLeft];
            }
        }
    }
}
