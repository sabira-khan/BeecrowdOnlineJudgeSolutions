package com.gitproject;

import java.util.HashMap;
import java.util.Scanner;

public class Beecrowd1367_uri {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();

        while (n != 0) {

            HashMap<Character, Integer> solveP = new HashMap<>();
            HashMap<Character, Integer> p = new HashMap<>();

            for (int i = 0; i < n; i++) {

                char c = s.next().charAt(0);
                int t = s.nextInt();
                String j = s.next();
                int penalty = 20;

                if (j.equals("correct")) {
                    if (p.containsKey(c) ) {
                        t += p.get(c);
                    }
                    solveP.put(c, t);
                }
                else {
                    if (p.containsKey(c) ) {
                        penalty += p.get(c);
                    }
                    p.put(c, penalty);
                }
            }
            int sum = 0;
            for (int num : solveP.values()) {
                sum += num;
            }
            System.out.println(solveP.size() + " " + sum);

        n = s.nextInt();
        }
    }
}
