package com.gitproject;

import java.util.Scanner;

public class Beecrowd1478_uri {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int order = s.nextInt();
        int sl = 2, sr;

        while (order!=0) {
            int[][] arr = new int[order][order];

            for(int i = 0; i < order; i++){
                sr = i + 1;

                for(int j = 0; j < order; j++){
                    if(i == j){
                        arr[i][j] = 1;
                    }
                    else if( j > i){
                        arr[i][j] = sl++;

                    }
                    else {
                        arr[i][j] = sr;
                    }

                    sr--;

                    if(j != (order-1))
                        System.out.printf("%3d ", arr[i][j]);
                    else
                        System.out.printf("%3d", arr[i][j]);
                }
                System.out.println();
                sl = 2;
            }
            System.out.println();
            order = s.nextInt();
        }
    }}

