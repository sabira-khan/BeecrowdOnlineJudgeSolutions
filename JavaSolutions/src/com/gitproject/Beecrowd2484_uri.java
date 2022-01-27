package com.gitproject;
import java.util.Scanner;

public class Beecrowd2484_uri {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        while (s.hasNext()) {
            String w = s.next();

            for (int i = 0; i < w.length(); i++) {
                for (int j = 0; j < i; j++) {
                    System.out.print(" ");
                }
                for (int j = 0; j < w.length()-i; j++) {
                    System.out.print(w.charAt(j));
                    if (j < w.length()- i-1) {
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }
            System.out.println();
        }
    }
}

