package com.gitproject;

import java.util.Scanner;

public class Beecrowd1512_uri {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int n = s.nextInt();
        int a = s.nextInt();
        int b = s.nextInt();

        while (n != 0 && a != 0 && b != 0) {
            int lcm = ( a * b )/ gcd( a, b);
            int res = (n/ a) + (n/ b) - (n/ lcm);

            System.out.println(res);

            n = s.nextInt();
            a = s.nextInt();
            b = s.nextInt();
        }
    }

    public static int gcd(int a, int b) {
        return (b == 0 ? a : gcd(b, a % b));
    }
}
