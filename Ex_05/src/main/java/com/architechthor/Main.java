package com.architechthor;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int integerIn = scanner.nextInt();
        double doubleIn = scanner.nextDouble();

        String stringIn="";
        while(scanner.hasNext())
        {
            stringIn=scanner.nextLine();
        }

        scanner.close();

        System.out.println("String: "+stringIn);
        System.out.println("Double: "+doubleIn);
        System.out.println("Int: "+integerIn);

    }

}