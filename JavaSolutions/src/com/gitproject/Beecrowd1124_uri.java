package com.gitproject;
import java.util.Scanner;

public class Beecrowd1124_uri {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int l = s.nextInt();
        int c = s.nextInt();
        int r1 = s.nextInt();
        int r2 = s.nextInt();

        while ( l != 0 && c != 0 && r1 != 0 && r2 != 0) {

            char f = 'N';
            int max = r1 > r2 ? r1+r1 : r2+r2;

            if(max <= l && max <= c)
            {
                if(Math.sqrt(Math.pow((l - r2 - r1), 2) + Math.pow((c - r2 - r1), 2)) >=  (r1 + r2))
                {
                    f = 'S';
                }
            }
            System.out.println(f);

            l = s.nextInt();
            c = s.nextInt();
            r1 = s.nextInt();
            r2 = s.nextInt();

        }
    }
}