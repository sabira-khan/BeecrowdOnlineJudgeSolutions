package com.gitproject;

import java.util.ArrayList;
import java.util.Scanner;

public class Beecrowd1110_uri {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();

        while (t != 0) {
            if (t==1) {
                System.out.println("Discarded cards:" + "\nRemaining card: 1");
            }
            else {
                ArrayList<Integer> arr = new ArrayList<>();
                for (int i = 1; i <= t; i++) {
                    arr.add(i);
                }
                ArrayList<Integer> dis = new ArrayList<>();
                while (arr.size() >= 2) {
                    int temp = arr.get(1);
                    dis.add(arr.get(0));
                    arr.remove(0); //remove index 0
                    arr.remove(0); //remove index 1
                    arr.add(temp);
                }
                int rem = arr.get(arr.size() - 1);
                String a = dis.toString().replaceAll("\\[", "").replaceAll("]", "");
                String b = "Discarded cards: " + a.stripTrailing();
                System.out.println(b + "\nRemaining card: " + rem);

                t = s.nextInt();
            }
        }
    }
}
