package com.gitproject;
import java.util.Scanner;

public class Beecrowd2691_uri {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        s.nextLine();

        while (t-- > 0) {
            String l = s.nextLine();
            String[] w = l.split("x");

            int a = Integer.parseInt(w[0]);
            int b = Integer.parseInt(w[1]);

            if (a == b)
                for (int j = 5; j <= 10; j++)
                    System.out.printf("%d x %d = %d\n", a, j, a*j);
            else
                for (int j = 5; j <= 10; j++)
                    System.out.printf("%d x %d = %d && %d x %d = %d\n", a, j, a*j, b, j, b*j);
        }
    }
}
