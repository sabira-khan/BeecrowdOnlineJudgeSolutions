package com.gitproject;
import java.util.Scanner;

public class Beecrowd2356_uri {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        while (s.hasNextLine()) {
            String d = s.nextLine();
            //s.nextLine();
            String g = s.nextLine();

            int original = d.length();
            String n = d.replaceAll(g,"");
            int changed = n.length();

            System.out.println(changed == original? "Nao resistente" : "Resistente");
        }
    }
}

