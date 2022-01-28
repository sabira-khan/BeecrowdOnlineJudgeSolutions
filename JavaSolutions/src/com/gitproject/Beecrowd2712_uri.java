package com.gitproject;
import java.util.Scanner;

public class Beecrowd2712_uri {

        public static void main(String[] args) {
            Scanner s = new Scanner(System.in);
            int t = s.nextInt();
            s.nextLine();

            while (t-- > 0) {
                String p = s.nextLine();
                if (!p.contains("-") || p.length()!=8) {
                    System.out.println("FAILURE");
                }
                else {
                    String[] x = p.split("-");
                    String a = x[0];
                    String n = x[1];
                    boolean o = true;

                    for (int i = 0; i < 3; i++) {
                        if (!(Character.isUpperCase(a.charAt(i)))) {
                            o = false;
                            break;
                        }
                    }
                    for (int i = 0; i < 4; i++) {
                        if (!(Character.isDigit(n.charAt(i)))) {
                            o = false;
                            break;
                        }
                    }
                    if (!o) {
                        System.out.println("FAILURE");
                    }
                    else {
                        if (n.charAt(3) == '1' || n.charAt(3) == '2') {
                            System.out.println("MONDAY");
                        }
                        if (n.charAt(3) == '3' || n.charAt(3) == '4') {
                            System.out.println("TUESDAY");
                        }
                        if (n.charAt(3) == '5' || n.charAt(3) == '6') {
                            System.out.println("WEDNESDAY");
                        }
                        if (n.charAt(3) == '7' || n.charAt(3) == '8') {
                            System.out.println("THURSDAY");
                        }
                        if (n.charAt(3) == '0' || n.charAt(3) == '9') {
                            System.out.println("FRIDAY");
                        }

                    }
                }
            }
        }
    }

