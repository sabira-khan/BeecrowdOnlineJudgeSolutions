package com.gitproject;
import java.util.Scanner;

    public class Beecrowd1029_uri {
        static long calls = 0;

        public static long fib(int n) {
            calls++;
            if(n==0)
                return 0L;
            else if(n==1)
                return 1L;
            else
                return fib(n-1) + fib(n-2);
        }

        public static void main(String[] args) {
            Scanner s = new Scanner(System.in);
            int t =s.nextInt();
            while(t-- > 0) {
                int num = s.nextInt();
                long sum = fib(num-1)+fib(num-2);
                System.out.printf("fib(%d) = %d calls = %d\n",num,calls,sum);
                calls=0L;
            }
        }
    }
