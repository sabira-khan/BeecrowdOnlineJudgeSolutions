package com.gitproject;

import java.util.Scanner;

public class Beecrowd1709_uri {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();

        int p = 2;
        int t = 1;

        while(p != 1) {

            if(p <= n/2) {
                p += p;
            }
            else {
                p -= (n - p + 1);
            }
            t++;
        }
        System.out.println(t);
    }
}
