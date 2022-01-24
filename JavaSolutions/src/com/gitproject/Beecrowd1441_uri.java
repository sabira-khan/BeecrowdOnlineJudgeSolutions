package com.gitproject;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Beecrowd1441_uri {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();

        while (n!= 0) {

            ArrayList<Integer> num = new ArrayList<>();
            int temp = n;

            if (n== 1 || n== 2) {
                System.out.println(n);
            }
            else {
                while (!num.contains(1)) {
                    num.add(n);
                    if (temp % 2 == 0) {
                        temp = (temp / 2);
                        //System.out.println(temp);
                    } else {
                        temp = ((3 * temp) + 1);
                    }
                    num.add(temp);

                }

                //System.out.println(num);
                System.out.println(Collections.max(num));}
            n = s.nextInt();}
    }}