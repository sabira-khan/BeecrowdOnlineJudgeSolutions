package com.gitproject;
import java.util.Scanner;

public class Bee_1039_uri {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        while (s.hasNext()) {
            int R1 = s.nextInt();
            int X1 = s.nextInt();
            int Y1 = s.nextInt();

            int R2 = s.nextInt();
            int X2 = s.nextInt();
            int Y2 = s.nextInt();

            double distSq = Math.sqrt(((X1 - X2) * (X1 - X2)) + ((Y1 - Y2) * (Y1 - Y2)));
            System.out.println((distSq + R2) <= R1 ? "RICO": "MORTO" );

        }
    }
}
