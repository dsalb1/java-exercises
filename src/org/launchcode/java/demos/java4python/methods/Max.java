package org.launchcode.java.demos.java4python.methods;

/**
 * Created by Dan on 5/8/2017.
 */
public class Max {
    public static int arrayMax(int[] array) {
        int max = array[0];

        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }

        return max;
    }

    public static void main(String[] args) {
        int[] someNums = {5, 3, 10, 15, 19, 30, 7};
        int answer = Max.arrayMax(someNums);
        System.out.println(answer);
    }
}
