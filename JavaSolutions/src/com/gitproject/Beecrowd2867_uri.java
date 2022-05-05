package com.gitproject;

import java.math.BigInteger;
import java.util.Scanner;

public class Beecrowd2867_uri {
        public static void main(String[] args) {
            Scanner s = new Scanner(System.in);
            int t = s.nextInt();

            while (t-- > 0) {
                int n = s.nextInt();
                int m = s.nextInt();
                BigInteger x = new BigInteger(String.valueOf(n));
                BigInteger z = x.pow(m);
                int l = z.toString().length();

                System.out.println(l);
            }
        }
}
