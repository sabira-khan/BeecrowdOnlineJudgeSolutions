package com.gitproject;

import java.util.Scanner;

public class Beecrowd1151_uri {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();

        switch (a) {
            case 1 -> System.out.print("0");
            case 2 -> System.out.println("0 1");
            default -> {
                int num1 = 0, num2 = 1;
                System.out.print("0 1");

                for (int i = 3; i <= a; ++i) {
                    int numN = num1 + num2;
                    System.out.print(" " + numN);
                    num1 = num2;
                    num2 = numN;
                }
            }
        }
        System.out.println();
    }
}
