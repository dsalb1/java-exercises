package org.launchcode.java.studios;

import java.util.Scanner;

/**
 *
 * Created by Dan on 5/8/2017.
 */
public class Area {
    public static void main (String[] args) {
        double r;
        double area;
        Scanner in;

        in = new Scanner(System.in);
        System.out.println("Please enter the radius of your circle:");
        r = in.nextDouble();

        while (r < 0) {
            in = new Scanner(System.in);
            System.out.println("Please enter a positve number for the radius:");
            r = in.nextDouble();
        }

        area = Math.PI * r * r;

        System.out.println("The area of the circle is " + area);
        }
    }

