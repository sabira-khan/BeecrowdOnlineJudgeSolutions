package com.gitproject;
import java.util.Scanner;

public class Beecrowd1272_uri {
        public static void main(String[] args) {
            Scanner s = new Scanner(System.in);
            int t = s.nextInt();
            s.nextLine();
            for (int i = 0; i < t; i++) {
                String a = s.nextLine();
                int index = 0;
                while (index < a.length()) {
                    char c = a.charAt(index);
                    if (c == ' ') {
                        index++;
                        continue;}
                    System.out.print(c);
                    while (a.charAt(index) != ' ') {
                        index++;
                        if (index == a.length()) break;}}
                System.out.println();}

        }
}
