package com.gitproject;
import java.util.Scanner;

public class Beecrowd2718_uri {

    public static void main(String[] strings)
    {
        Scanner s = new Scanner(System.in);
        long t = s.nextLong();
        while (t-- > 0) {
            long p = s.nextLong();
            System.out.println(maxConsecutiveOnes(p));
        }
    }
    private static long maxConsecutiveOnes(long n) {
        long count = 0;
        while (n!=0) {
            n = (n & (n << 1));
            count++;
        }
        return count;
    }
}