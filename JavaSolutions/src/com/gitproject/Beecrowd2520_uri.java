package com.gitproject;
import java.util.Scanner;

public class Beecrowd2520_uri {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        while (s.hasNextInt()) {
            int x1 = 0;
            int x2 = 0;
            int y1 = 0;
            int y2 = 0;
            int a = s.nextInt();
            int b = s.nextInt();

            int[][] grid = new int[a][b];

            for (int i = 0; i < a; i++) {
                for (int j = 0; j < b; j++) {
                    grid [i][j] = s.nextInt();

                    if (grid[i][j] == 1) {
                        x1 = i;
                        y1 = j;
                    }

                    if (grid[i][j] == 2) {
                        x2 = i;
                        y2 = j;
                    }
                }
            }
            int distance = Math.abs((y2-y1)) + Math.abs(x2-x1);
            System.out.println(distance);

        }
    }
}

