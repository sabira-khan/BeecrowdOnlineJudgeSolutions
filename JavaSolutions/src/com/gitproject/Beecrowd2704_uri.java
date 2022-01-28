package com.gitproject;
import java.util.Scanner;

public class Beecrowd2704_uri {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        while (s.hasNextInt()) {
            int order = s.nextInt();
            int[] arr = new int[order];

            for (int i = 0; i < order; ++i) {
                arr[i] = s.nextInt();
            }
            int jump = s.nextInt();
            int sum = 0;
            boolean notPrime = false;

            for (int i = order-1; i >= 0; i-=jump) {
                sum += arr[i];
            }
            if (sum != 1 ) {
                for (int i = 2; i < sum; i++)
                    if (sum % i == 0) {
                        notPrime = true;
                        break;}
                if (notPrime)
                    System.out.println("Bad boy! I’ll hit you.");
                else
                    System.out.println("You’re a coastal aircraft, Robbie, a large silver aircraft.");
            }
            else
                System.out.println("Bad boy! I’ll hit you."); //cuz 1 is not prime
        }
    }
}

