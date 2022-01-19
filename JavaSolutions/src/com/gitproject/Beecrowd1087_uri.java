package com.gitproject;
import java.util.Scanner;

public class Beecrowd1087_uri {
        public static void main(String[] args) {
            Scanner s = new Scanner(System.in);

            while (s.hasNextLine()) {
                int x1 = s.nextInt();
                int y1 = s.nextInt();
                int x2 = s.nextInt();
                int y2 = s.nextInt();

                if (x1 == 0 && x2 == 0 && y1 == 0 && y2 == 0) {
                    break;
                }
                else if (x1 == x2 && y1 == y2) {
                    System.out.println(0);
                }
                else if (x1 == x2 || y1 == y2 || Math.abs(y2 - y1) == Math.abs(x2 - x1)) {
                    System.out.println(1);
                }
                else {
                    System.out.println(2);
                }
            }
        }
    }

