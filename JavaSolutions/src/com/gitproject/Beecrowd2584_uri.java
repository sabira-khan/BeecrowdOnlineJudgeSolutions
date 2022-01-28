package com.gitproject;
import java.util.Scanner;

public class Beecrowd2584_uri {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t;
        double x, a;

        while (s.hasNextInt()) {

            t = s.nextInt();
            for (int i = 0; i < t; i++) {
                x = s.nextInt();

                a = (0.25) * (Math.sqrt(5*(5+(2*Math.sqrt(5)))))*x*x;
                System.out.printf("%.3f\n", a);
            }
        }
    }
}

