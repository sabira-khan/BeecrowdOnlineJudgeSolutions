package com.gitproject;
import java.util.Scanner;

public class Beecrowd2006_uri {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        int count = 0;
        for (int i = 0; i < 5; i++) {
            if (s.nextInt() == t) {
                count++;
            }
        }
        System.out.println(count);
    }
}
