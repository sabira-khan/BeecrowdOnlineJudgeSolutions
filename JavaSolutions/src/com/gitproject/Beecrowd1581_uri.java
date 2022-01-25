package com.gitproject;
import java.util.Scanner;

public class Beecrowd1581_uri {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        for (int i = 0; i < t; i++) {
            int k = s.nextInt();
            String[] lang = new String[k];
            boolean check = true;

            for (int j = 0; j < k; j++) {
                lang[j] = s.next();
                String compare = lang[0];
                if (compare.contentEquals(lang[j])) continue;
                else
                    check = false;
            }
            if (check)
                System.out.println(lang[0]);
            else
                System.out.println("ingles");
        }
    }
}
