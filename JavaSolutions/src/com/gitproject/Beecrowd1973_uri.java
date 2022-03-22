package com.gitproject;

import java.io.IOException;
import java.util.Scanner;
public class Beecrowd1973_uri {

public static void main(String[] args) throws IOException {

    //Recursive prob
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] stars = new int[n];
        int[] sheep = new int[n];
        long sum_st = 0;
        long sum_sh = 0;
        int x = 0;

        for (int i = 0; i < n; i++) {
            sheep[i] = s.nextInt();
            stars[i] = 0;
        }


        while (true) {
            if (x == 0 && sheep[x] % 2 == 0){
                stars[x] = 1;
            if (sheep[x] > 0)
                sheep[x]--;
                break;
            }
            else if (x == (n-1) && sheep[x] % 2 == 1) {
                stars[x] = 1;
                if (sheep[x] > 0)
                    sheep[x]--;
                break;
            }
            else if (sheep[x] % 2 == 1) {
                if (sheep[x] > 0)
                    sheep[x]--;
                stars[x] = 1;
                x++;
            }
            else if (sheep[x] % 2 == 0) {
                stars[x] = 1;
                if (sheep[x] > 0)
                    sheep[x]--;
                x--;
            }
        }

        for (int i = 0; i < n; i++) {
            sum_sh += sheep[i];
            sum_st += stars[i];
        }
        System.out.println(sum_st + " " + sum_sh); }
}