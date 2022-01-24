package com.gitproject;
import java.util.HashSet;
import java.util.Scanner;

public class Beecrowd1383_uri {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        char[][] arr = new char[9][9];

        int t = 0;
        while (t++ < n) {
            for (int i = 0; i < 9; i++) {
                for (int j = 0; j < 9; j++) {
                    arr[i][j] = s.next().charAt(0);
                }
            }System.out.printf("Instancia %d\n",t);
            if (checkSudoku(arr)) {
                System.out.println("SIM");
            }
            else {
                System.out.println("NAO");
            }
            System.out.println();

        }

    }
    public static boolean checkSudoku (char[][] board) {
        HashSet<String> seen = new HashSet<>();

        for (int i = 0; i < 9; i++) {
            for ( int j = 0; j < 9; j++) {
                char current = board[i][j];
                if ( !seen.add(current + " found in row " + i) ||
                        !seen.add(current + " found in col " + j) ||
                        !seen.add(current + " found in box " + i/3 +"-"+ j/3)) {
                    return false;
                }
            }
        }
        return true;
    }}