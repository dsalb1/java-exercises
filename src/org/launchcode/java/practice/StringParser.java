package org.launchcode.java.practice;

import java.util.Scanner;
import java.util.regex.*;
/**
 * Created by Dan on 5/9/2017.
 */
public class StringParser {
    public static void main(String[] args) {
        String sentence;
        String word;
        Scanner sent_in = new Scanner(System.in);
        Scanner word_in = new Scanner(System.in);

        System.out.println("Please enter a sentence that you would like to parse: ");
        sentence = sent_in.nextLine();

        System.out.println("Please enter a the word that you would like to search for: ");
        word = word_in.nextLine();

        //String[] words = sentence.split("\\s+");

        boolean hasWord = sentence.contains(word);

        System.out.println(hasWord);
        }
    }

