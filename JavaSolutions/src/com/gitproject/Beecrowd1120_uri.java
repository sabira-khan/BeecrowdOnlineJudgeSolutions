package com.gitproject;
import java.util.Scanner;

public class Beecrowd1120_uri {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String input = s.nextLine();

        while (!input.equals("0 0")) {

            String[] num = input.split(" ");
            String letter = num[0];
            String sentence =num[1];
            String r = sentence.replace(letter,"");
            r = r.replaceFirst("0*", "");
            System.out.println(r.length() > 0 ? r : 0);

            input = s.nextLine();
        }
    }
}
