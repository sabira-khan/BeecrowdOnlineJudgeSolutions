package com.gitproject;

import java.util.Scanner;
public class Beecrowd1257_uri {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int a = s.nextInt();

        while (a-- > 0) {
            int sum = 0;
            int c = s.nextInt();
            s.nextLine();

            for(int i = 0; i < c; i++){
                String r = s.nextLine();
                for(int j = 0; j < r.length(); j++){
                    sum += r.charAt(j)- 65 + j + i ;
                }
            }
            System.out.println(sum);
        }
    }
}

