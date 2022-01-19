package com.gitproject;
import java.util.Scanner;

public class Beecrowd1103_uri {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        while (s.hasNextInt()) {
            int h1 = s.nextInt();
            int m1 = s.nextInt();
            int h2 = s.nextInt();
            int m2 = s.nextInt();
            int initial;
            int finalz;

            if (h1 == 0 && h2 == 0 && m1 == 0 && m2 == 0) {
                break;
            }
            else {
                if (h1 == 0) {
                    initial = (24 * 60) + m1;
                }
                else {
                    initial = (h1 * 60) + m1;
                }
                if (h2 == 0) {
                    finalz = (24 * 60) + m2;
                }
                else {
                    finalz = (h2 * 60) + m2;
                }

                System.out.println(finalz - initial > 0 ? finalz - initial : ((24*60)-(initial-finalz)));

            }
        }
    }
}
