package com.gitproject;
import java.util.Scanner;

public class Beecrowd1197_uri {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        while (s.hasNextInt()) {
            int v = s.nextInt();
            int t = s.nextInt();
            int d = v * (t*2);
            System.out.println(d);
        }
    }
}
