package com.gitproject;
import java.util.Scanner;

public class Beecrowd1534_uri {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int x;

        while (s.hasNext()) {
            x = s.nextInt();
            for (int i = 0; i < x; i++) {
                for (int j = 0; j < x; j++) {
                    if (j == x-i-1)
                        System.out.print(2);
                    else if (i == j)
                        System.out.print(1);
                    else
                        System.out.print(3);
                }
                System.out.println();
            }
        }
    }
}
