package com.gitproject;
import java.util.Scanner;

public class Beecrowd1308_uri {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();


        for (int i = 0; i < t; i++) {
            long n = s.nextLong();
            long x = (long) (Math.sqrt(1 + 8*n) - 1) / 2;
            System.out.println(x);
        }
    }
}

