package com.gitproject;
import java.util.Scanner;

public class Beecrowd1196_uri {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        String row1 = "`1234567890-=";
        String row2 = "QWERTYUIOP[]\\";
        String row3 = "ASDFGHJKL;'";
        String row4 = "ZXCVBNM,./";

        while (s.hasNextLine()) {
            String line = s.nextLine();
            StringBuilder n = new StringBuilder();

            for (int i = 0; i < line.length(); i++) {

                if (line.charAt(i) == ' ') {
                    n.append(' ');
                }
                for (int j = 1; j < row1.length(); j++) {
                    if (line.charAt(i) == row1.charAt(j)) {
                        n.append(row1.charAt(j - 1));
                    }
                }
                for (int j = 1; j < row2.length(); j++) {
                    if (line.charAt(i) == row2.charAt(j)) {
                        n.append(row2.charAt(j - 1));
                    }
                }
                for (int j = 1; j < row3.length(); j++) {
                    if (line.charAt(i) == row3.charAt(j)) {
                        n.append(row3.charAt(j - 1));
                    }
                }
                for (int j = 1; j < row4.length(); j++) {
                    if (line.charAt(i) == row4.charAt(j)) {
                        n.append(row4.charAt(j - 1));
                    }
                }
            }
            System.out.println(n);
        }
    }
}
