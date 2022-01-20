package com.gitproject;
import java.util.Scanner;

public class Beecrowd1157_uri {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int x = s.nextInt();
        int i = 1;

        while (i <= x) {
            if (x % i == 0) {
                System.out.println(i);
            }
            i++;
        }
    }
}
