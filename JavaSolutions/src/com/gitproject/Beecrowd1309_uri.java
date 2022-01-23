package com.gitproject;
import java.util.Scanner;

public class Beecrowd1309_uri {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        while (s.hasNextLine()) {
            for (int i = 0; i < 2 ; i++) {
                String x = s.nextLine();
                String y = s.nextLine();
                String z;
                if (Integer.parseInt(y) < 10) {
                    z = x + ".0"+y;
                }
                else {
                    z = x + "." + y;
                }

                double n = Double.parseDouble(z);
                z = String.format("%,.2f",n);
                System.out.println("$"+z);
            }
        }
    }
}
