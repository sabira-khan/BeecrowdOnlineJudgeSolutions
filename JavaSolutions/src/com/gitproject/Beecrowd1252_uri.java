package com.gitproject;

import java.util.ArrayList;
import java.util.Scanner;

public class Beecrowd1252_uri {
    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int m = s.nextInt();

        while( n != 0 && m != 0){
            ArrayList<Integer> list = new ArrayList<>(n);

            for(int i = 0; i < n; i++){
                list.add(s.nextInt());
            }
            final int temp = m;

            list.sort((a, b) -> {
                int d = (a % temp) - (b % temp);
                if(d == 0){
                    if( (a%2==0 && b%2==0) || (a%2!=0 && b%2!=0) )
                        return (a%2 ==0) ? a-b : b-a;
                    else{
                        return ( a%2 == 0) ? 1 : -1;
                    }
                }
                return d;
            });

            System.out.println(n+" "+m);
            for (int i = 0; i < n; i++) {
                System.out.println(list.get(i));
            }

            n = s.nextInt();
            m = s.nextInt();
        }
        System.out.println("0 0");
    }
}
