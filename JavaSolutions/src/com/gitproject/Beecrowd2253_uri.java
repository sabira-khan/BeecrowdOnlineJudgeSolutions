package com.gitproject;
import java.util.Scanner;

public class Beecrowd2253_uri {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        while (s.hasNextLine()) {
            String p = s.nextLine();
            boolean notValid = false;
            boolean Uppercase = false;
            boolean Lowercase = false;
            boolean Num = false;

            if (p.length() >= 6 && p.length() <= 32) {

                for (int i = 0; i < p.length(); i++) {
                    char c = p.charAt(i);
                    if ((c >= 48 && c <= 57) || (c >= 65 && c <= 90) || (c >= 97 && c <= 122)) {
                        if (c >= 48 && c <= 57 ) {
                            Num = true;
                        }
                        if (c >= 65 && c <= 90) {
                            Uppercase = true;
                        }
                        if (c >= 97 && c <= 122) {
                            Lowercase = true;
                        }
                    }
                    else {
                        notValid = true;
                    }
                }
                if (Uppercase && Lowercase && Num && !notValid) {
                    System.out.println("Senha valida.");
                }
                else {
                    System.out.println("Senha invalida.");
                }
            }
            else {
                System.out.println("Senha invalida.");
            }
        }
    }
}

