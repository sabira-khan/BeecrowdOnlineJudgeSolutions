package com.gitproject;

public class Beecrowd1156_uri {
    public static void main(String[] args) {
        int a = 3;
        int b = 2;
        double c;
        double d = 0.0;

        while ( a <= 39)  {
            c = (double) a/b;
            a+=2;
            b*=2;
            d= d + c;
        }
        d+=1;
        System.out.printf("%.2f\n",d);

    }
}
