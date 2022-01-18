package com.gitproject;
import java.util.Scanner;

public class Bee_1069_uri {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        s.nextLine();

        while (t-- > 0) {
            String w = s.nextLine();
            String n = w.replaceAll("\\.","");
            int count = 0;

            while(n.contains("<>")) {
                n = n.replaceFirst("<>","");
                count++;
            }
            System.out.println(count);
        }
    }
}
