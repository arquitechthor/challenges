package com.arquitechthor;

import java.util.*;
import java.util.regex.Pattern;
import java.util.stream.Stream;

public class Main {
    public static String FindIntersection(String[] strArr) {
        Stream<String> rightArray =
                Pattern.compile(",").splitAsStream(strArr[0]);

        rightArray.forEach(System.out::println);

        //Stream<String> leftArray = strArr[1];


        return strArr[0];
    }

    public static void main (String[] args) {
        // keep this function call here
        Scanner s = new Scanner(System.in);
        //System.out.print(FindIntersection(s.nextLine()));
    }
}