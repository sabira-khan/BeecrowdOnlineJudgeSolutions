package com.gitproject;
import java.util.Scanner;

public class Beecrowd2770_uri {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        while (s.hasNext()) {
            int x = s.nextInt();
            int y = s.nextInt();
            int m = s.nextInt();

            for (int i = 0; i < m; i++) {
                int xi = s.nextInt();
                int yi = s.nextInt();
                System.out.println( (xi <= x && yi <= y || xi <= y && yi <= x) ? "Sim" : "Nao");
            }
        }
    }
}
