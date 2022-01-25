package com.gitproject;
import java.util.Scanner;

public class Beecrowd1558_uri {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        while (s.hasNextInt()) {
            int n = s.nextInt();

            int x = (int) Math.round(Math.sqrt(Math.abs(n)));
            boolean possible = false;

            for (int i = 0; i <= x ; i++) {
                for (int j =0; j <= x; j++) {
                    if ((Math.pow(i,2) + Math.pow(j,2)) == n) {
                        possible = true;
                        break;
                    }
                }
            }
            System.out.println(possible? "YES" : "NO");
        }
    }
}
