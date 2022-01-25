package com.gitproject;
import java.util.Scanner;

public class Beecrowd2203_uri {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        while (s.hasNextInt()) {
            int xf = s.nextInt();
            int yf = s.nextInt();
            int xi = s.nextInt();
            int yi = s.nextInt();
            int v = s.nextInt();
            int r1 = s.nextInt();
            int r2 = s.nextInt();

            double d = Math.sqrt(Math.pow((xi - xf),2.0) + Math.pow((yi - yf),2.0)); //distance b/w 2 points
            d += v * 1.5;  // final distance of prey after considering flight distance of the prey

            double r = r1 + r2; //range of attacker

            System.out.println( d > r ? "N" : "Y");

        }
    }
}
