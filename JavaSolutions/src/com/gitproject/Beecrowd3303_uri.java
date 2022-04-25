package com.gitproject;

import java.io.IOException;
import java.util.Scanner;

public class Beecrowd3303_uri {
    public static void main(String[] args) throws IOException {
        Scanner s = new Scanner(System.in);
        while (s.hasNext()) {
            String w = s.nextLine();
            if (w.length() >= 10)
                System.out.println("palavrao");
            else
                System.out.println("palavrinha");
        }
    }
}
