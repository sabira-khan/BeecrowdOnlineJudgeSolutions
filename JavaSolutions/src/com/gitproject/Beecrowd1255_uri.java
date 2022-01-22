package com.gitproject;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Beecrowd1255_uri {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        s.nextLine();

        while (t-- > 0) {

            String l = s.nextLine().toLowerCase();
            Map<Character,Integer> unique = new TreeMap<>();
            int max = 1;
            for (int i = 0; i < l.length(); i++) {
                char n = l.charAt(i);

                if (n >= 97 && n <= 122) {
                    if (!unique.containsKey(n)) {
                        unique.put(n,1);
                    }
                    else {
                        int value = unique.get(n);
                        value++;
                        unique.put(n,value);
                        max = Math.max(value, max);
                        //System.out.println(max);
                    }
                }
            }

            for (char x : unique.keySet()) {
                if (unique.get(x) == max) {
                    System.out.print(x);
                }
            }
            System.out.println();
        }
    }
}
