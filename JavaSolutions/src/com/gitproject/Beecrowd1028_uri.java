package com.gitproject;
import java.util.Scanner;

public class Beecrowd1028_uri {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();

        while (t-- > 0) {
            int a = s.nextInt(), b = s.nextInt();
            System.out.println(gcd(a, b));
        }
    }

    public static int gcd(int m, int n)
    {
        if (n == 0)
            return m;
        return gcd(n, m % n);
    }
}
