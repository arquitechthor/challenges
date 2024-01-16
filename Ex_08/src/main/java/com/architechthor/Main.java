package com.architechthor;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Main {
    public static String CodelandUsernameValidation(String str) {

        int length = str.length();

        if (length>25 && length<4){
            return "false";
        }

        String firstChar = String.valueOf(str.charAt(0));
        if(Pattern.compile("[^A-Za-z]").matcher(firstChar).matches()){
            return "false";
        }

        String lastChar =  String.valueOf(str.charAt(length-1));
        if(Pattern.compile("_").matcher(lastChar).matches()){
            return "false";
        }

        if(str.matches("[^A-Za-z0-9_]")){
            return "false";
        }

        return "true";
    }

    public static void main (String[] args) {
        // keep this function call here
        Scanner s = new Scanner(System.in);
        System.out.print(CodelandUsernameValidation(s.nextLine()));
    }
}