package com.arquitechthor;

import java.util.*;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static String findIntersection(String[] strArr) {
        Stream <Integer> leftElement =
                Pattern.compile(",").splitAsStream(strArr[0].replace(" ",""))
                        .map(Integer::parseInt);

        Set <Integer> rightElement =
                Pattern.compile(",").splitAsStream(strArr[1].replace(" ",""))
                        .map(Integer::parseInt).collect(Collectors.toSet());

        List <Integer> result =
                leftElement.filter(rightElement::contains).toList();

        if (result.isEmpty())
        {
            return "false";
        }

        return result.toString();
    }

    public static void main (String[] args) {
        // keep this function call here
        String[] testCase = new String[] {"1, 3, 4, 7, 13", "1, 2, 4, 13, 15"};

        System.out.print(findIntersection(testCase));
    }
}