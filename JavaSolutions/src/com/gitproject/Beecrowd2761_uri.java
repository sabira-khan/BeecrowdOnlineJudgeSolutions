package com.gitproject;
import java.io.IOException;
import java.util.Scanner;

public class Beecrowd2761_uri {

    public static void main(String[] args) throws IOException {
        Scanner s = new Scanner(System.in);

        int a = s.nextInt();
        float b = s.nextFloat(); //double will give error, idk why
        char c = s.next().charAt(0);
        String line = s.nextLine();
        char[] all = line.toCharArray();
        String d = "";
        for (int i = 1; i < all.length; i++) {
            d += all[i];
        }

        System.out.printf("%d%.6f%c%s\n", a, b, c, d);
        System.out.printf("%d\t%.6f\t%c\t%s\n", a, b, c, d);
        System.out.printf("%10d%10.6f%10c%10s\n", a, b, c, d);
    }

}
