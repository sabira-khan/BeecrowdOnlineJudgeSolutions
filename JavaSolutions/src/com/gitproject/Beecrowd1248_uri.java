package com.gitproject;

import java.util.Arrays;
import java.util.Scanner;

public class Beecrowd1248_uri {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        s.nextLine();

        while (n--> 0) {
            String diet = s.nextLine();
            String breakfast = s.nextLine();
            String lunch = s.nextLine();

            if (diet.isEmpty() && (!breakfast.isEmpty() || !lunch.isEmpty())) {
                System.out.println("CHEATER");
            }
            else {
                char[] foods = (breakfast+lunch).toCharArray();
                boolean f = true;
                for (char food : foods) {
                    int temp = diet.length();
                    diet = diet.replaceFirst(String.valueOf(food), "");
                    if (temp == diet.length()) {
                        f = false;
                        break;
                    }
                }

                if (f) {
                    char[] d = diet.toCharArray();
                    Arrays.sort(d);
                    String res = String.valueOf(d);
                    System.out.println(res);
                } else {
                    System.out.println("CHEATER");
                }
            }
        }
    }
}
