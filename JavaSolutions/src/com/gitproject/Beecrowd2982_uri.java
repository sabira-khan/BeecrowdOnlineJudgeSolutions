package com.gitproject;

import java.util.Scanner;

public class Beecrowd2982_uri {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        long x = 0;

        while (t-- > 0) {
            char c = s.next().charAt(0);
            int n = s.nextInt();

            x = c == 'G'? x - n : x + n;
        }
        System.out.println( x >= 0 ? "A greve vai parar." : "NAO VAI TER CORTE, VAI TER LUTA!");
    }
}
