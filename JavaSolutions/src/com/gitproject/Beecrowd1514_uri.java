package com.gitproject;
import java.util.Scanner;

public class Beecrowd1514_uri {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int row_c = s.nextInt();
        int col_p = s.nextInt();

        while (row_c != 0 && col_p != 0) {

            int[][] arr = new int[row_c][col_p];
            int cond_count = 0;

            //iterating row wise
            //if count != num of probs in 1 row, cond1: nobody solved all prob, satisfied
            //if in each line, count >=1, cond4: everyone solved 1 prob, satisfied

            boolean all = false;
            int fourth_count = 0;

            for (int i = 0; i < row_c; i++) {
                int all_solved = 0;
                for (int j = 0; j < col_p; j++) {
                    arr[i][j] = s.nextInt();
                    if (arr[i][j] == 1) {
                        all_solved++;
                    }
                }
                if (all_solved == col_p) {
                    all = true;
                }
                if (all_solved >= 1) {
                    fourth_count++;
                }
            }

            //iterate col by col
            //if count >= 1; every problem was solved by 1 person, cond2 satisfied
            //if count != num of people, one prob was not solved by everyone, so cond3 satisfied

            boolean all_prob = false;
            int second_count = 0;
            for (int i = 0; i < col_p; i++) {
                int all_p = 0;
                for (int j = 0; j < row_c; j++) {
                    if (arr[j][i] == 1) {
                        all_p++;
                    }
                }

                if (all_p == row_c) {
                    all_prob = true;
                }
                if (all_p >= 1) {
                    second_count++;
                }
            }

            if (!all) {
                cond_count+=1;
            }
            if (fourth_count == row_c) {
                cond_count+=1;
            }
            if (!all_prob) {
                cond_count+=1;
            }
            if (second_count == col_p) {
                cond_count+=1;
            }

            System.out.println(cond_count);
            row_c = s.nextInt();
            col_p = s.nextInt();
        }
    }
}
