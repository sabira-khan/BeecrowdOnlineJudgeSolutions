package com.gitproject;

import java.util.Scanner;

public class Beecrowd1160_uri {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //get input
        int testC = input.nextInt();

        //repeat for number of times of tests
        for(int i = 0; i < testC; i++) {
            int a = input.nextInt();
            int b = input.nextInt();
            double popA = input.nextDouble();
            double popB = input.nextDouble();

            //track num of years
            int countY = 0;

            //repeat till population of a exceeds b
            while (a <= b) {

                //increment city by current population times rate and divide by 100 since rate in % form
                a += (int) ((a * popA) / 100);
                b += (int) ((b * popB) / 100);
                countY++;
            }

            //print output
            if (countY > 100)
                System.out.println("Mais de 1 seculo.");
            else
                System.out.println(countY + " anos.");
        }
    }
}
