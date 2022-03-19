package com.gitproject;

import java.util.Scanner;
public class Beecrowd2149_uri {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        long[] arr = new long[17];

        arr[0] = 0;
        arr[1] = 1;
        for(int i = 2; i < 17; i++){
            if(i % 2 == 0)
                arr[i] = arr[i-1] + arr[i-2];
            else
                arr[i] = arr[i-1] * arr[i-2];
        }

        while (s.hasNextInt()) {
            int n = s.nextInt();
            System.out.println(arr[n-1]);

        }
    }
}
