package com.gitproject;
import java.util.Scanner;

public class Beecrowd1153_uri {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int f = 1;
        int i = 1;

        while ( i <= n) {
            f *= i;
            i++;
        }
        System.out.println(f);
    }
}
