package com.gitproject;

import java.util.Scanner;

public class Beecrowd1332_uri {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();

        for (int i = 0; i < t; i++) {
            String n = s.next();
            if (n.length() == 5)
                System.out.println("3");
            else if (n.charAt(0) == 't' && n.charAt(1) == 'w' || n.charAt(0) == 't' && n.charAt(2) == 'o' ||
                    n.charAt(1) == 'w' && n.charAt(2) == 'o') {
                System.out.println("2");
            }
            else
                System.out.println("1");
        }
    }
}

