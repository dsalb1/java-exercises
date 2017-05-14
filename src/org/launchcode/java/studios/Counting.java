package org.launchcode.java.studios;
import java.util.HashMap;
import java.util.Scanner;
/**
 * Created by Dan on 5/11/2017.
 */
public class Counting {
    public static HashMap<Character, Integer> charCount(String myStr) {
        HashMap<Character, Integer> map = new HashMap<>();
        /*
        for (char ch = 'A'; ch <= 'Z'; ++ch) {
            map.put(Character.valueOf(ch), 0);
        }
        */

        char[] charactersInString = myStr.toUpperCase().replaceAll("[^A-Z]","").toCharArray();
        for (char ch : charactersInString) {
            if (!map.containsKey(ch))  {
                map.put(ch, 1);
                }
            else {
                Integer value = map.get(ch) + 1;
                map.replace(ch, value);
            }
            }


        return map;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter the phrase that you'd like to parse for character count: ");
        String phrase = in.nextLine();

        HashMap<Character, Integer> result = charCount(phrase);
        for (Character key: result.keySet()) {
            System.out.println(key + ": " + result.get(key));
        }
    }
}
