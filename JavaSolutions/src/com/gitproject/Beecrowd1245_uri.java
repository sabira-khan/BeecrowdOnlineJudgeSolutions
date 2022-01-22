package com.gitproject;
import java.util.ArrayList;
import java.util.Scanner;

public class Beecrowd1245_uri {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        while (s.hasNextInt()) {
            ArrayList<String> left = new ArrayList<>();
            ArrayList<String> right = new ArrayList<>();

            int count = 0;
            int n = s.nextInt();
            s.nextLine();
            for (int i = 0; i < n; i++) {
                String line = s.nextLine();
                String size = (line.substring(0,2));
                if (line.contains("D")) {
                    left.add(size);
                }
                if (line.contains("E")) {
                    right.add(size);
                }
            }

            for (String x : left) {
                if (right.contains(x)) {
                    count++;
                    right.remove(x);
                }
            }
            System.out.println(count);
        }
    }
    }