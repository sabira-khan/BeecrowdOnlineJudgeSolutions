package com.gitproject;
import java.util.Scanner;

public class Beecrowd1198_uri {
    public static void main(String[] args) {

            Scanner s = new Scanner(System.in);

            while (s.hasNextLine()) {
                String[] x = s.nextLine().split(" ");

                long r = Long.parseLong(x[1]) - Long.parseLong(x[0]);
                System.out.println(Math.abs(r));
            }
        }
    }


