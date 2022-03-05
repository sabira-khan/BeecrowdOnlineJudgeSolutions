package com.gitproject;

import java.util.Scanner;

public class Beecrowd2722_uri {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        s.nextLine();

        while (n-- > 0) {
            String p1 = s.nextLine();
            String p2 = s.nextLine();

            String name = "";

            for (int i = 0; i < p1.length()-1; i+=2) {
                name += p1.substring(i,i+2) + p2.substring(i,i+2);
            }

            System.out.println(name);

        }
    }
}
