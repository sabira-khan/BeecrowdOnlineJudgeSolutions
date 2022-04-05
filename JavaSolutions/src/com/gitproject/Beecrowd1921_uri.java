package com.gitproject;

import java.util.Scanner;

public class Beecrowd1921_uri {
    public static void main(String[] args) {
        Scanner s = new Scanner( System . in );

        long n = s.nextLong();
        long res = ( n * ( n - 3 )) / 2 ;
        System.out.println(res);
    }
}
