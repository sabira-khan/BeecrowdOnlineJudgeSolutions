package com.gitproject;

import java.util.Scanner;

public class Beecrowd1164_uri {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();

        for (int i = 1; i <= t; i++) {
            int x = s.nextInt();
            int j = 1;
            int sum = 0;

            while ( j < x) {
                if (x % j == 0) {
                    sum += j;
                }
                j++;
            }
            System.out.println(sum==x? " eh perfeito" : " nao eh perfeito");
        }
    }
}
