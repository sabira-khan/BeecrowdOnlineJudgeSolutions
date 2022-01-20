package com.gitproject;

import java.util.Scanner;

public class Beecrowd1180_uri {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int r = s.nextInt();
        int  min = 0, index = 0;

        if (1 < r && r < 1000) {
            int[] arr = new int[r];
            min = arr[0];
            for (int i = 0; i < arr.length; i++) {
                arr[i] = s.nextInt();
                if (i == 0) {
                    min = arr[i];
                    index = i;
                }
                else if (arr[i] < min) {
                    min = arr[i];
                    index = i;
                }
            }}
        System.out.printf("Menor valor: %d\n", min);
        System.out.printf("Posicao: %d\n", index);
    }
}
