package com.gitproject;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Beecrowd1244_uri {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);


        int n = Integer.parseInt(s.nextLine());

        for(int i = 0 ; i < n ; i++){

            String[] word = s.nextLine().split(" ");

            ArrayList<String> list = new ArrayList<>(Arrays.asList(word));

            while(!list.isEmpty()) {
                String b = "";
                for(String w : list)
                    if(w.length() > b.length())
                        b = w;

                System.out.printf("%s",b);
                list.remove(b);
                if(!list.isEmpty())
                    System.out.print(" ");
            }
            System.out.println();
        }

    }
}