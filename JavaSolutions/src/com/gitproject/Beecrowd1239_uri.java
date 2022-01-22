package com.gitproject;
import java.util.Scanner;

public class Beecrowd1239_uri {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        while (s.hasNext()) {
            String sen = s.nextLine();
            char[] letter = new char[sen.length()];
            int dash = 1, star = 1;

            for (int i = 0; i < sen.length(); i++) {
                letter[i] = sen.charAt(i);
                if (letter[i]=='_' && dash % 2 != 0) {
                    System.out.print("<i>");
                    dash++;
                }
                else if (letter[i]=='_' && dash % 2 == 0){
                    System.out.print("</i>");
                    dash++;
                }
                else if (letter[i]=='*' && star % 2 != 0) {
                    System.out.print("<b>");
                    star++;

                }
                else if (letter[i]=='*' && star % 2 == 0){
                    System.out.print("</b>");
                    star++;
                }
                else
                    System.out.print(letter[i]);
            }
            System.out.println();
        }
    }
}
