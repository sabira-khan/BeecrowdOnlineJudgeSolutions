package com.gitproject;
import java.util.Scanner;

public class Bee_1026_uri {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        while (s.hasNext()) {
            long x = s.nextLong();
            long y = s.nextLong();
            //xor
            System.out.println(x ^ y);
        }
    }
}
