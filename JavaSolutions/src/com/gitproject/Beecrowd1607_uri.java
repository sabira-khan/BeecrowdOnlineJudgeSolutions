package com.gitproject;
import java.util.Scanner;

public class Beecrowd1607_uri {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        char[] a, b;
        s.nextLine();

        while (t-- > 0) {
            String[] words = s.nextLine().split(" ");
            a = words[0].toCharArray();
            b = words[1].toCharArray();
            int count = 0;

            for (int i = 0; i < a.length; i++) {
                int x =  a[i];
                int y = b[i];

                if (y > x) {
                    count += y-x;
                }
                else if (x > y){
                    count += 26 + y - x;
                }
            }
            System.out.println(count);
        }
    }
}

