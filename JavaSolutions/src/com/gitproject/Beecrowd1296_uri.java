package com.gitproject;
import java.util.Scanner;

public class Beecrowd1296_uri {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        while (s.hasNextLine()) {
            String[] line = s.nextLine().split(" ");
            double a = Double.parseDouble(line[0]);
            double b = Double.parseDouble(line[1]);
            double c = Double.parseDouble(line[2]);

            double area = findArea(a,b,c);
            if (area > 0) {
                System.out.printf("%.3f\n",area);
            }
            else
                System.out.println("-1.000");

        }
    }

    public static double findArea(double a, double b, double c) {
        double x = (a+b+c)/2;
        double p = x-a;
        double q = x-b;
        double r = x-c;

        return (4/3.0) * Math.sqrt(x*p*q*r);
    }
}
