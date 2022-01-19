package com.gitproject;
import java.util.Scanner;

public class Beecrowd1068_uri {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        while (s.hasNextLine()) {
            String w = s.nextLine();
            String n = w.replaceAll("[^()]","");

            while(n.contains("()")) {
                n = n.replace("()","");
            }
            System.out.println( n.isEmpty()? "correct": "incorrect");
        }
    }
}
