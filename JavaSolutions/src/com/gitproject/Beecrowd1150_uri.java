package com.gitproject;

import java.util.Scanner;

public class Beecrowd1150_uri {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b = s.nextInt();
        int i, sum = 0;

        while (b <= a)
            b = s.nextInt();

        for (i = 0; sum <= b; i++) {
            sum+=a;
            a++;
        }
        System.out.println(i);
    }
}
