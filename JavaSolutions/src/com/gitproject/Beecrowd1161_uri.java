package com.gitproject;

import java.util.Scanner;

public class Beecrowd1161_uri {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        while (s.hasNextInt()) {
            long a = s.nextLong();
            long b = s.nextLong();

            System.out.println(factorial(a) + factorial(b));
        }
    }

    public static long factorial(long n)
    {
        long f = 1;
        for (long i = 1; i <= n; i++) {
            f *= i;
        }
        return f;
    }
}
