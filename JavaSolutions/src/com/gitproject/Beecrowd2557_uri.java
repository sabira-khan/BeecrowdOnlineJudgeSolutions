package com.gitproject;
import java.util.Scanner;

public class Beecrowd2557_uri {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        while (s.hasNext()) {
            String w = s.next();

            String[] tt = w.split("\\+");
            String[] uu = tt[1].split("=");
            String p = tt[0];
            String q = uu[0];
            String r = uu[1];

            int a = 0;
            int b = 0;
            int c = 0;

            if (!p.equals("R") && !p.equals("L") && !p.equals("J")) {
                a = Integer.parseInt(p);
            }
            if (!q.equals("R") && !q.equals("L") && !q.equals("J")) {
                b = Integer.parseInt(q);
            }
            if (!r.equals("R") && !r.equals("L") && !r.equals("J")) {
                c = Integer.parseInt(r);
            }
            if (a==0) {
                System.out.println(c - b);
            }
            else if (b==0) {
                System.out.println(c - a);
            }
            else if (c==0) {
                System.out.println(a + b);
            }
        }}
}

