package com.architechthor;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int c = Integer.parseInt(bufferedReader.readLine().trim());
        bufferedReader.close();

        boolean isOdd = (c & 1)==1;
        boolean isWeird = isOdd || (c>=6 && c<=20);

        if (isWeird){
            System.out.println("Weird");
        }else{
            System.out.println("Not Weird");
        }

    }
}