package com.gitproject;
import java.util.Scanner;

public class Beecrowd1238_uri {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        s.nextLine();

        while (n-- > 0) {

            String[] w = s.nextLine().split(" ");
            char[] x = w[0].toCharArray();
            char[] y = w[1].toCharArray();


            StringBuilder f = new StringBuilder();
            for (int j = 0; j < x.length + y.length; j++) {
                if (j < x.length) {
                    f.append(x[j]);

                }
                if (j < y.length) {
                    f.append(y[j]);

                }
            }
            System.out.println(f);
        }
    }}

