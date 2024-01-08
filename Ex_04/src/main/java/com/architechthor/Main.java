package com.architechthor;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Main {
    public static String LongestWord(String sen) {

        String response =
                Pattern.compile(" ")
                        .splitAsStream(sen.replaceAll("[^a-zA-Z 0-9]", ""))
                        .reduce(
                                "", (init, curr) ->
                                {
                                    return (init.toString().length() >= curr.toString().length() ?
                                            init : curr);
                                }
                        );

        return response;
    }

    public static void main(String[] args) {
        // keep this function call here
        Scanner s = new Scanner(System.in);
        System.out.print(LongestWord(s.nextLine()));
    }
}