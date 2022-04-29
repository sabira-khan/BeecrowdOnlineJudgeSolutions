package com.gitproject;

import java.io.EOFException;
import java.util.Arrays;
import java.util.Scanner;


public class Beecrowd1211_uri {
    public static void main(String[] args) throws EOFException {
        Scanner s = new Scanner(System.in);

        while (s.hasNextInt()) {

            int t = s.nextInt();
            s.nextLine();

            String[] ff = new String[t];

            for (int i = 0; i < t; i++) {
                ff[i] = s.nextLine();
            }

            Arrays.sort(ff);
            int e = 0;

            for (int i = 0; i < t-1; i++) {
                for (int j = 0; j < ff[i].length(); j++) {
                    if (ff[i].charAt(j) == ff[i+1].charAt(j)) {
                        e++;
                    }
                    else
                        break;
                }
            }
            System.out.println(e);
        }
    }
}
