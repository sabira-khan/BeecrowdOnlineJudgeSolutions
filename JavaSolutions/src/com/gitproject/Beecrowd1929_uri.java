package com.gitproject;
import java.util.Scanner;

public class Beecrowd1929_uri {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int[] num = new int[4];
        boolean p = false;

        for (int i = 0; i < 4; i++) {
            num[i] = s.nextInt();
        }

        for (int i = 0; i < 4; i++) {
            for (int j = i + 1; j < 4; j++) {
                for (int k = j + 1; k < 4; k++) {
                    if (num[i] + num[j] > num[k]
                            && num[i] + num[k] > num[j]
                            && num[k] + num[j] > num[i]) {
                        p = true;
                        break;
                    }
                }
            }
        }

        System.out.println(p ? "S" : "N");
    }
}

