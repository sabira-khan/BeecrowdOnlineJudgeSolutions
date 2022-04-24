package com.gitproject;

import java.util.Hashtable;
import java.util.Scanner;

public class Beecrowd1256_uri {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int t = s.nextInt();

        while (t-- > 0) {
            Hashtable<Integer, int[]> ht = new Hashtable<>();
            int m = s.nextInt();
            int n = s.nextInt();

            int[][] a=new int[m][n];
            for(int i=0;i<n;i++)       {
                int b= s.nextInt();
                a[b%m][i]=b;
            }
            for(int i=0;i<m;i++)
            {
                ht.put(i,a[i]);
            }
            for(int i=0;i<m;i++)
            {
                System.out.print(i+" -> ");
                for(int j=0;j<n;j++)
                    if(a[i][j]!=0)
                        System.out.print((ht.get(i))[j]+" -> ");
                System.out.println("\\");  //escape
            }

            if (t > 0) {
                System.out.println();
            }
        }
    }
}
