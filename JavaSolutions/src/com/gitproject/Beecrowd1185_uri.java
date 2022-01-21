package com.gitproject;
import java.util.Scanner;

public class Beecrowd1185_uri {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        String op = s.next();
        double sum = 0;
        int index = 0;

        double[][] M = new double[12][12];
        int i , j;


        for (i = 0; i < 12; i++) {
            for (j = 0; j <12; j++) {
                M[i][j]= s.nextDouble();
                if (j<11-i) {
                    sum += M[i][j];
                    index++;
                }
            }
        }
        double avg = sum / index;

        if (op.equals("S"))
            System.out.printf("%.1f\n", sum);
        else if (op.equals("M"))
            System.out.printf("%.1f\n", avg);
    }
}

/*Assuming A is N×N and you use standard zero indexing

for (i=0; i < N; i++) diagsum += A[i][i];

for (i=0; i < N; i++) secondarydiagsum += A[i][N-i-1];

for (i=0; i < N; i++) for (j=i+1;j< N;j++) abovesum += A[i][j]; //i is row, j is column

for (i=0; i < N; i++) for (j=0;j< i;j++) belowsum += A[i][j]; //i is row, j is column

for (i=0; i < N; i++) for (j=0;j< N-i-1;j++) abovesecondarysum += A[i][j];

for (i=0; i < N; i++) for (j=N-i;j< N;j++) belowsecondarysum += A[i][j];*/
