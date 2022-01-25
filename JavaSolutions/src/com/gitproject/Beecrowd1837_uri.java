package com.gitproject;
import java.util.Scanner;

public class Beecrowd1837_uri {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b = s.nextInt();
        int q = 0;
        int r = 0;

        if (a > 0) {
            r = a % b;
            q = (a-r)/b;
        }
        else {
            for (int i = 0; i <= Math.abs(b); i++) {
                if ((a - i) % b == 0) {
                    q = (a - i) / b;
                    r = i;
                    break;
                } }
        }
        System.out.println(q + " " + r);
    }
}
