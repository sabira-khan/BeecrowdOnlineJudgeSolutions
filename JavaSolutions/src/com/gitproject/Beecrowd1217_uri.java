package com.gitproject;
import java.util.Scanner;

public class Beecrowd1217_uri {

        public static void main(String[] args) {
            Scanner s = new Scanner(System.in);
            int n = s.nextInt();
            double total_price = 0.0;
            double total_count = 0.0;

            int i = 0;
            while (i++ < n) {
                double p = s.nextDouble();
                s.nextLine();
                String[] f = s.nextLine().split(" ");
                total_count+= f.length;
                total_price+=p;

                System.out.printf("day %d: %d kg\n", i, f.length);

            }
            double avg_count = total_count/n;
            double avg_price = total_price/n;
            System.out.printf("%.2f kg by day\n", avg_count);
            System.out.printf("R$ %.2f by day\n", avg_price);
        }
    }
