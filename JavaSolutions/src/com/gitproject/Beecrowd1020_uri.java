package com.gitproject;
import java.util.Scanner;

public class Beecrowd1020_uri {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int age = input.nextInt();
        int year = age / 365;
        int month = (int) (age % 365) / 30;
        int day = (int) (age%365)%30;


        System.out.printf("%d ano(s)\n", year);
        System.out.printf("%d mes(es)\n", month);
        System.out.printf("%d dia(s)\n", day);
    }

}
