package com.gitproject;
import java.util.Scanner;

public class Beecrowd1182_uri {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);

        int line = s.nextInt();
        String op = s.next();
        double sum = 0;

        double[][] M = new double[12][12];
        int i , j;



        for (i = 0; i < 12; i++) {
            for (j = 0; j <12; j++) {
                M[i][j]= s.nextDouble();

            }
            j = line;
            if (M[0][j]==M[0][line]) {
                sum += M[i][line];
            }
        }

        double avg = sum / 12.0;

        if (op.equals("S"))
            System.out.printf("%.1f\n", sum);
        else if (op.equals("M"))
            System.out.printf("%.1f\n", avg);


    }}