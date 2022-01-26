package com.gitproject;
import java.util.Scanner;

public class Beecrowd1847_uri {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int first = s.nextInt();
        int second = s.nextInt();
        int third = s.nextInt();
        int dec1, dec2, inc1, inc2;

        if (first > second) {
            dec1 = first - second;
            dec2 = second - third;
            if (second > third && dec2 >= dec1) {
                System.out.println(":(");
            }
            else
                System.out.println(":)");
        }
        else if (first < second) {
            inc1 = second - first;
            inc2 = third - second;
            if (second < third && inc2 >= inc1) {
                System.out.println(":)");
            }
            else
                System.out.println(":(");
        }
        else if (third > second) {
            System.out.println(":)");
        }
        else
            System.out.println(":(");
    }
}

