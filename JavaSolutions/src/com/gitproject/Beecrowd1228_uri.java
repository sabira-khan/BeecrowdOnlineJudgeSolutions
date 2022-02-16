package com.gitproject;

import java.util.Scanner;
public class Beecrowd1228_uri {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        while (s.hasNextInt()) {
            int n = s.nextInt();

            int[] x = new int[n];
            int[] y = new int[n];
            int[] z = new int[n];

            for (int i = 0; i < n; i++) {
                x[i] = s.nextInt();
            }
            for (int i = 0; i < n; i++) {
                y[i] = s.nextInt();
            }

            for(int i = 0; i < n; i++){
                for(int j = 0; j < n; j++){
                    if(x[i] == y[j]){
                        z[j] = i + 25;
                    }
                }
            }
            int t;
            int c = 0;
            for(int k = 0; k < n; k++){
                for(int li = k+1; li < n; li++){
                    if(z[k] > z[li]){
                        t = z[li];
                        z[li] = z[k];
                        z[k] = t;
                        c++;
                    }
                }
            }
            System.out.println(c);
        }
    }
}
