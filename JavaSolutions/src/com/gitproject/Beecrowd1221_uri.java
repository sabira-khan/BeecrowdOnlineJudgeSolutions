package com.gitproject;
import java.util.Scanner;

public class Beecrowd1221_uri {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();

        for (int i = 0; i < t; i++) {
            boolean p = isPrime(s.nextInt());
            if (p)
                System.out.println("Prime");
            else
                System.out.println("Not Prime");

        }
    }
    public static boolean isPrime(int num)
    {
        if (num < 2)
            return false;
        if (num % 2 == 0)
            return (num == 2);

        int r = (int)Math.sqrt((double)num);

        for (int i = 3; i <= r; i += 2)
        {
            if (num % i == 0)
                return false;
        }
        return true;
    }
}
