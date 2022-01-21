package com.gitproject;
import java.util.Scanner;

public class Beecrowd1181_uri {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int line = s.nextInt();
        String op = s.next();
        double sum = 0;

        double[][] M = new double[12][12];

        for (int i = 0; i < M.length; i++) {
            for (int j = 0; j <M[i].length; j++) {
                M[i][j]= s.nextDouble();
            }
            if (i == line) {
                for (int j = 0; j <M[i].length; j++) {
                    sum += M[i][j];
                }
            }
        }
        double avg = sum/12.0;
        if (op.equals("S"))
            System.out.printf("%.1f\n", sum);
        else if (op.equals("M"))
            System.out.printf("%.1f\n", avg);
    }
}
