package org.launchcode.java.studios;

import java.util.Scanner;

/**
 * Created by Dan on 5/8/2017.
 */
public class Gas {
    public static void main (String[] args) {
        float miles;
        float gas;
        float miles_per_gallon;
        Scanner miles_in;
        Scanner gas_in;

        miles_in = new Scanner(System.in);
        gas_in = new Scanner(System.in);

        System.out.println("How many miles have you driven?");
        miles = miles_in.nextFloat();
        System.out.println("How many gallons of gas has your car consumed?");
        gas = gas_in.nextFloat();

        miles_per_gallon = miles * gas;

        System.out.println("You are getting approximately " + miles_per_gallon + " miles per gallon.");
    }
}
