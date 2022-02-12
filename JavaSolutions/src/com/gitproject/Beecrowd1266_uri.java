package com.gitproject;

import java.util.Scanner;
public class Beecrowd1266_uri {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();

        while (n != 0) {

            int z = 0;
            int sum = 0;
            boolean start = false;
            int f = 0;

            for (int i = 0 ; i < n; i++) {
                int numero = s.nextInt();
                if (numero == 0 && !start) {
                    z++;
                    f++;
                }
                else if(numero == 0){
                    f++;
                }
                if(numero == 1){
                    start = true;
                    sum += f/2;
                    f = 0;
                }
            }
            if(f > 0){
                sum -= z/2;
                f += z;
                sum += f/2;
            }
            System.out.println(sum);
            n = s.nextInt();
        }
    }
}
