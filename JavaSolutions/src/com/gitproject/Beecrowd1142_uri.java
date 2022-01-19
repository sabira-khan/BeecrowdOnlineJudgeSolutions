package com.gitproject;
import java.util.Scanner;

public class Beecrowd1142_uri {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int x = s.nextInt();
        int q = 1;

        for (int i = 1; i <= x; i++) {
            for (int j = 1; j <= 3; j++) {
                System.out.print(q + " ");
                q += 1;
            }
            System.out.println("PUM");
            q += 1;
        }
    }
}
