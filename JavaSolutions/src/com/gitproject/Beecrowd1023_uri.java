package com.gitproject;

import java.util.*;
public class Beecrowd1023_uri {
    public static void main(String[] args) {

        int n, x, y, test = 1;
        int sumRes, sumConsump, floorConsump;
        boolean c1 = true;
        double res;
        String temp;

        Scanner s = new Scanner(System.in);
        n = s.nextInt();
        while (n != 0) {

            HashMap<Integer, Integer> pairs = new HashMap<>();
            sumRes = 0;
            sumConsump = 0;

            while (n-- > 0) {
                x = s.nextInt();
                y = s.nextInt();
                sumRes += x;
                sumConsump += y;
                floorConsump = (int) Math.floor((double) y / (double) x);
                if (pairs.containsKey(floorConsump)) {
                    x += pairs.get(floorConsump);
                }
                pairs.put(floorConsump, x);
            }
            System.out.println("Cidade# " + test++ + ":");
            temp = "";
            TreeMap<Integer, Integer> sorted = new TreeMap<>(pairs);

            for (Integer p : sorted.keySet()) {
                temp += sorted.get(p) + "-" + p + " ";
            }
            System.out.println(temp.trim()); //strip w
            res = Math.floor(100 * (double)sumConsump/sumRes) / 100;
            System.out.printf("Consumo medio: %.2f m3.\n", res);

            if (c1) {
                c1 = false;
            } else {
                System.out.println();
            }
            n = s.nextInt();
        }
    }
}
