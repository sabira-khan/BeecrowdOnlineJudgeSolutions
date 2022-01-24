package com.gitproject;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Beecrowd1410_uri {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int x = s.nextInt();
        int y = s.nextInt();

        while (y != 0 && x != 0) {

            ArrayList<Integer> a = new ArrayList<>(x);
            ArrayList<Integer> d = new ArrayList<>(y);

            for (int i = 0; i < x; i++) {
                a.add(s.nextInt());
            }
            for (int i = 0; i < y; i++) {
                d.add(s.nextInt());
            }

            Collections.sort(a);
            Collections.sort(d);

            int closest = a.get(0);
            int second = d.get(1);

            if (closest < second) {
                System.out.println("Y");
            }
            else
                System.out.println("N");


            x = s.nextInt();
            y = s.nextInt();
        }

    }
}

