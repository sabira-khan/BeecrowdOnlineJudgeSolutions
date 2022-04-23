package com.gitproject;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

public class Beecrowd1063_uri {
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        while(n != 0)
        {
            Stack<Character> train= new Stack<>();

            ArrayList<Character> in = new ArrayList<>();
            ArrayList<Character> res = new ArrayList<>();
            for(int i=0;i<n;i++)
            {
                in.add(s.next().charAt(0));
            }
            for(int i=0;i<n;i++)
            {
                res.add(s.next().charAt(0));
            }
            int t = 0;
            for(int i=0;i<n;i++)
            {

                train.push(in.get(i));
                System.out.print("I");

                while (train.size() > 0 && res.get(t) == train.peek()) //coz we want combo same as res
                {
                    train.pop();
                    System.out.print("R");
                    t++;
                }
            }

            if (train.size() != 0)
                System.out.println(" Impossible");

            n = s.nextInt();
        }
    }
}
/*
Input goes as:
--bottom to top in stack/LIFO --

a
d
t
e

Output comes out as:
--top to bottom--
d
a
t
e
 */