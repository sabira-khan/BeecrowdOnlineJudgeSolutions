package com.gitproject;
import java.util.Scanner;

public class Beecrowd1190_uri {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        double[][] arr = new double[12][12];
        double sum = 0;
        int count = 0;
        String op = s.next();

        for (int i = 0; i < 12; i++) {
            for (int j = 0; j < 12; j++) {
                arr[i][j] = s.nextDouble();
                if (j > 12 - i - 1 && i < j) {
                    sum += arr[i][j];
                    count++;
                }
            }
        }
        if (op.equals("S")) {
            System.out.printf("%.1f\n", sum);
        } else {
            System.out.printf("%.1f\n", (sum / count));

        }
    }
}
