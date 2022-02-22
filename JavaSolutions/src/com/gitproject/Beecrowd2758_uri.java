package com.gitproject;

import java.util.Scanner;

public class Beecrowd2758_uri {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        float a = s.nextFloat();
        float b = s.nextFloat();
        double c = s.nextDouble();
        double d = s.nextDouble();

        System.out.printf("A = %f, B = %f\n", a, b);
        System.out.printf("C = %f, D = %f\n", c, d);
        System.out.printf("A = %.1f, B = %.1f\n", a, b);
        System.out.printf("C = %.1f, D = %.1f\n", c, d);
        System.out.printf("A = %.2f, B = %.2f\n", a, b);
        System.out.printf("C = %.2f, D = %.2f\n", c, d);
        System.out.printf("A = %.3f, B = %.3f\n", a, b);
        System.out.printf("C = %.3f, D = %.3f\n", c, d);
        System.out.printf("A = %.3E, B = %.3E\n", a, b);
        System.out.printf("C = %.3E, D = %.3E\n", c, d);
        System.out.printf("A = %.0f, B = %.0f\n", a, b);
        System.out.printf("C = %.0f, D = %.0f\n", c, d);

        //this solution will give 5% error, to this date, idk why. if you solve the same way with c++ you'll get accepted.
        //no wonder c++ is the best lang for competitive programming
        //still posting this here, if you know how to solve this the right way in Java, please let me know
    }
}
