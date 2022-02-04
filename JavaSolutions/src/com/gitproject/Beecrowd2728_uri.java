package com.gitproject;

import java.util.Scanner;

public class Beecrowd2728_uri {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        while (s.hasNextLine()) {
            String n = s.nextLine();
            String[] l = n.split("-");

            if (l.length != 5) {
                System.out.println("BUG");
            }
            else {
                String k = "";

                //first word
                if (l[0].startsWith("c") || l[0].startsWith("C") || l[0].endsWith("c") || l[0].endsWith("C")) {
                    k += "c";
                }

                //second word
                if (l[1].startsWith("o") || l[1].startsWith("O") || l[1].endsWith("o") || l[1].endsWith("O")) {
                    k += "o";
                }

                //third word
                if (l[2].startsWith("B") || l[2].startsWith("b") || l[2].endsWith("B") || l[2].endsWith("b")) {
                    k += "b";
                }

                //fourth word
                if (l[3].startsWith("o") || l[3].startsWith("O") || l[3].endsWith("o") || l[3].endsWith("O")) {
                    k += "o";
                }

                //fifth word
                if (l[4].startsWith("L") || l[4].startsWith("l") || l[4].endsWith("L") || l[4].endsWith("l")) {
                    k += "l";
                }

                System.out.println(k.equals("cobol") ? "GRACE HOPPER" : "BUG");
            }
        }
    }
}
