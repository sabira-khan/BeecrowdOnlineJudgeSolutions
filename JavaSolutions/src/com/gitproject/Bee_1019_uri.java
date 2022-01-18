package com.gitproject;
import java.util.Scanner;

public class Bee_1019_uri {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int time = input.nextInt();
        int hour = time / 3600;
        int minute = (time % 3600)/60;
        int second = ((time%3600)%60)%60;


        System.out.printf("%d:%d:%d\n", hour, minute,second);

    }

}