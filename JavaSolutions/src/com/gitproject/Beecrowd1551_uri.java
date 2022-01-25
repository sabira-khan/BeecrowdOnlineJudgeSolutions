package com.gitproject;
import java.util.Scanner;

public class Beecrowd1551_uri {
    public static void main(String[] args){

        String[] alphabet = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r",
                "s", "t", "u", "v", "w", "x", "y", "z"};
        int count;
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        s.nextLine();

        while (t-- > 0) {
            String line;
            count = 0;
            line = s.nextLine();

            for (String letter : alphabet) {
                if (line.contains(letter)) {
                    count++;
                }

            }
            if (count == 26) {
                System.out.println("frase completa");}
            else if (count > 12) {
                System.out.println("frase quase completa");}
            else {
                System.out.println("frase mal elaborada");}

        }
    }
}


