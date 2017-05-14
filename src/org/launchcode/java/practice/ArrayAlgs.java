package org.launchcode.java.practice;
import java.util.ArrayList;
/**
 * Created by Dan on 5/9/2017.
 */
public class ArrayAlgs {



    public static int getSum(ArrayList<Integer> numList) {
        int sum = 0;
        for (int num : numList) {
            if (num % 2 == 0) {
                sum += num;
            }
        }
        return sum;
    }

    public static void getString(ArrayList<String> stringList) {
        for (String word : stringList) {
            if (word.length() >= 5) {
                System.out.println(word);
            }
        }
    }

    public static void printNum (int[] numbers) {
        for (int num : numbers) {
            System.out.println(num);
        }
    }

    public static ArrayList<Integer> addLists(ArrayList<Integer> a, ArrayList<Integer> b) {

        ArrayList<Integer> result = new ArrayList<Integer>();
        ArrayList<Integer> bigger = a;
        ArrayList<Integer> smaller = b;


        if (a.size() < b.size()) {
            bigger = b;
            smaller = a;
        }

        for (int i = 0; i < bigger.size(); i++) {
            if (i < smaller.size()) {
                result.add(bigger.get(i) + smaller.get(i));
            } else {
                result.add(bigger.get(i));
            }
        }
        return result;
    }

    public static void main(String[] args) {
        ArrayList<Integer> a = new ArrayList<Integer>();
        a.add(1);
        a.add(5);
        a.add(9);
        a.add(13);
        a.add(100);
        a.add(9);
        ArrayList<Integer> b = new ArrayList<Integer>();
        b.add(5);
        b.add(3);
        b.add(-5);
        System.out.println(addLists(a,b));
    }
}

