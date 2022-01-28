package com.gitproject;
import java.util.Scanner;

public class Beecrowd2551_uri {
        public static void main(String[] args) {
            Scanner s = new Scanner(System.in);

            while (s.hasNext()) {
                int n = s.nextInt();
                double r = 0;

                for (int i = 1; i <= n; i++) {
                    double t = s.nextInt();
                    double d = s.nextInt();
                    if ((d / t) > r) {
                        System.out.println(i);
                        r = d / t;
                    }
                }
            }
        }
    }

