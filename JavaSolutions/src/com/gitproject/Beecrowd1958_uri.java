package com.gitproject;
import java.util.Scanner;

public class Beecrowd1958_uri {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        double n = s.nextDouble();
        System.out.printf((String.valueOf(n).startsWith("-")? "": "+")+ "%.4E", n);
        System.out.println();
    }
}

