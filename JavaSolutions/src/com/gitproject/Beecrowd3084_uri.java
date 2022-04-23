package com.gitproject;

import java.util.Scanner;

public class Beecrowd3084_uri {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);


        while (s.hasNext()) {
            String input = s.nextLine();
            String[] list = input.split(" ");

            int x = Integer.parseInt(list[0]);
            int y = Integer.parseInt(list[1]);

            if (x== 0 && y==0) {
                System.out.println("00:00");
            }
            else {
                x /= 30;
                y /= 6;
                if (x < 10 && y >= 10) {
                    System.out.printf("0%d:%d\n", x, y);
                }
                else if (y < 10 && x >= 10) {
                    System.out.printf("%d:0%d\n", x, y);
                }
                else if (y < 10) {
                    System.out.printf("0%d:0%d\n", x, y);
                }
                else
                    System.out.printf("%d:%d\n", x,y);
            }

        }
    }
    }




