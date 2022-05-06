package com.gitproject;

import java.util.Scanner;
import java.util.Stack;

public class Beecrowd1062_uri {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        boolean t = true;

        while (s.nextInt() != 0) {
             int n = s.nextInt();

            System.out.print( t ? "" : "\n");

            while (s.nextInt() != 0) {
                Stack<Integer> stack = new Stack<>();
                s.nextLine();
                String line = s.nextLine();
                String[] train = line.split(" ");
                int current = 0;
                int coach = Integer.parseInt(train[current]);
                for (int i = 1; i <= n; i++) {
                    stack.push(i);
                    while (!stack.isEmpty() && coach == stack.lastElement()) {
                        if (++current < n) {
                            coach = Integer.parseInt(train[current]);
                        }
                        stack.pop();
                    }
                }
                System.out.println(stack.isEmpty() ? "Yes" : "No");
            }
            t = false;
        }
        System.out.println();
    }
}
