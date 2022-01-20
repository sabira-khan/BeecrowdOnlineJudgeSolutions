package com.gitproject;

import java.util.Arrays;
import java.util.Scanner;

public class Beecrowd1171_uri {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n= s.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = s.nextInt();
        }
        Arrays.sort(arr);
        sortPrint(arr, n);

    }

    public static void sortPrint(int[] arr, int n ) {
        for (int i = 0; i < n; i++) {
            int count = 1;
            while (i < n - 1 && arr[i] == arr[i + 1]) {
                i++;
                count++;}
            System.out.println(arr[i] + " aparece " + count + " vez(es)");
        }
    }
}
