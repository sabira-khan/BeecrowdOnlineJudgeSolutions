package com.gitproject;
import java.util.Scanner;

public class Beecrowd1768_uri {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        while (s.hasNextInt()) {
            int t = s.nextInt();
            int lines =(t/2)+1;

            for (int i = 1; i <= lines; i++) {
                for (int j = i; j <=t/2; j++) {
                    System.out.print(" ");
                }
                int p = 2*i-1;
                for (int k = 1; k<=p; k++) {
                    System.out.print("*");
                }
                System.out.println();
            }
            int count=1;
            while(count<=2){
                for(int j=count;j<=t/2;j++)
                    System.out.print(" ");
                int p=2*count-1;
                for(int g=1;g<=p;g++)
                    System.out.print("*");
                System.out.println();
                count++;}
            System.out.println();
        }
    }
}
