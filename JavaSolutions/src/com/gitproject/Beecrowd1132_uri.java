package com.gitproject;

import java.util.Scanner;

public class Beecrowd1132_uri {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b = s.nextInt();
        int sum = 0;

        if (a < b) {
            for ( int j = a; j <= b; j++) {
                if (j % 13 != 0) {
                    sum+= j;
                }
            }
        }
        else {
            for ( int j = b; j <= a; j++) {
                if (j % 13 != 0) {
                    sum+= j;
                }
            }
        }
        System.out.println(sum);
    }
}
