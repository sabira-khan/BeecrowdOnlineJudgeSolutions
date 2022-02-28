package com.gitproject;

import java.util.Scanner;
public class Beecrowd2143_uri {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        int n;

        while (t != 0) {
            for (int i = 0; i < t; i++) {
                n = s.nextInt();
                System.out.println(n % 2 != 0? ((n * 2) - 1) : ((n * 2) - 2));
            }
            t = s.nextInt();
        }
    }
}
