package com.gitproject;
import java.util.HashMap;
import java.util.Scanner;

public class Beecrowd1318_uri {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int o = s.nextInt();
        int n = s.nextInt();

        while (o != 0 && n != 0) {

            HashMap<Integer, Integer> unique = new HashMap<>();
            int count = 0;

            for (int i = 0; i < n; i++) {

                int temp = s.nextInt();
                if (unique.containsKey(temp)) {
                    unique.put(temp, unique.get(temp)+1);
                }
                else {
                    unique.put(temp, 1);
                }
            }

            for (Integer x : unique.keySet()) {
                if (unique.get(x) > 1) {
                    count++;
                }
            }
            System.out.println(count);
            o = s.nextInt();
            n = s.nextInt();
        }
    }
}
