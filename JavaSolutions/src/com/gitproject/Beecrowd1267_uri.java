package com.gitproject;

import java.util.Scanner;
public class Beecrowd1267_uri {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int d = s.nextInt();

       while ( n != 0 && d != 0) {

           int[][] arr = new int[d][n];
           for(int j = 0; j < d; j++){
               for(int i = 0; i < n; i++){
                   arr[j][i] = s.nextInt();
               }
           }

           int check = 0; int t;
           for(int i = 0; i < n; i++){
               t = 0;
               for(int j = 0; j < d; j++){
                   t = t + arr[j][i];
                   if( t == d){
                       check = 1;
                       break;
                   }
               }
           }

           System.out.println(check == 1? "yes" : "no");

           n = s.nextInt();
           d = s.nextInt();
       }

    }
}
