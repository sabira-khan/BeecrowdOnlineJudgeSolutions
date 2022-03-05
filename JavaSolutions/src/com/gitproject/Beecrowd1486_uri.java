package com.gitproject;

import java.util.Scanner;

public class Beecrowd1486_uri {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        while (true) {
            int p = s.nextInt();
            int n = s.nextInt();
            int c = s.nextInt();

            if (p==0 && n==0 && c==0)
                break;

            int[][] arr = new int[n][p];
            int count;
            int res = 0;

            for (int i = 0; i < n; ++i) {
                for (int j = 0; j < p; ++j) {
                    arr[i][j] = s.nextInt();
                }
            }

            for (int k = 0; k < p; ++k) {
                count = 0;
                for (int i = 0; i < n; ++i) {

                    if(arr[i][k] != 0) {
                        count++;
                    }
                    else {
                        count = 0;
                    }
                    if(count == c) {
                        res++;
                    }
                }
            }
            System.out.println(res);
        }
    }
}
