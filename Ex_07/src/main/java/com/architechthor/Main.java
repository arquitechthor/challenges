package com.architechthor;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int q = scanner.nextInt();

        for (int i = 0; i<q; i++){
            int a = scanner.nextInt(); // 0
            int b = scanner.nextInt(); // 2
            int n = scanner.nextInt(); // 10

            Double sum = 0d;

            for (int j=0; j<=n-1; j++){
                sum=sum+(b*Math.pow(2,j));

                System.out.print(a+sum.intValue());

                if (j<n-1){
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }

        scanner.close();
    }
}