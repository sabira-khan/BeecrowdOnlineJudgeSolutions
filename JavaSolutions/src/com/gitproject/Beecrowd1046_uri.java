package com.gitproject;
import java.util.Scanner;

public class Beecrowd1046_uri {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int start = s.nextInt();
        int end = s.nextInt();
        int X;
        if ( start == end) {
            X = 24;
            System.out.printf("O JOGO DUROU %d HORA(S)\n",X);
        }
        else if ( start > end) {
            X = 24 - (start - end);
            System.out.printf("O JOGO DUROU %d HORA(S)\n",X);
        }
        else {
            X = end - start;
            System.out.printf("O JOGO DUROU %d HORA(S)\n",X);
        }
    }
}
