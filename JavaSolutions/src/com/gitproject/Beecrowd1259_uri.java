package com.gitproject;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Beecrowd1259_uri {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        ArrayList<Integer> odd = new ArrayList<>();
        ArrayList<Integer> even = new ArrayList<>();

        while (t-- > 0) {
            int n = s.nextInt();
            if (n % 2 == 0)
                even.add(n);
            else
                odd.add(n);
        }
        Collections.sort(even);
        Collections.sort(odd);
        Collections.reverse(odd);

        for (int i = 0; i < even.size(); i++) {
            System.out.println(even.get(i));
        }
        for (int i = 0; i < odd.size(); i++) {
            System.out.println(odd.get(i));
        }
    }
}
