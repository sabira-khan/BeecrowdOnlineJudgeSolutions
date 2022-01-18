package com.gitproject;
import java.util.Scanner;

public class Bee_1043_uri {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        double a = s.nextDouble();
        double b = s.nextDouble();
        double c = s.nextDouble();

        if ( a + b > c && b + c > a && c + a > b) {
            double p = a + b + c;
            System.out.printf("Perimetro = %.1f\n", p);
        }
        else {
            double q = c * ((a + b)/2);
            System.out.printf("Area = %.1f\n", q);
        }
    }
}
