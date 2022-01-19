package com.gitproject;

public class Beecrowd1097_uri {

    public static void main(String[] args) {
        int a = 7;
        int b = 5;

        for (int i = 1; i <=9; i+=2) {
            for (int j = a; j >= b; j--) {
                System.out.print("I=" + i + " ");
                System.out.println("J=" + j);
            }
            a += 2;
            b += 2;
        }
    }
}
