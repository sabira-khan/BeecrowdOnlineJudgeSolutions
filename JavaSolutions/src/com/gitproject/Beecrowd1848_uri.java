package com.gitproject;
import  java.util.Scanner ;

public  class  Beecrowd1848_uri {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String c;
        int n, t = 0;

        while(s.hasNextLine()) {

            c = s.nextLine();
            if (c.equals("caw caw")) {
                System.out.println(t);
                t = 0;
            }
            else {
                n = blink(c);
                t += n;
            }
        }
    }

    public static int blink(String s) {
        return switch (s) {
            case "--*" -> 1;
            case "-*-" -> 2;
            case "-**" -> 3;
            case "*--" -> 4;
            case "*-*" -> 5;
            case "**-" -> 6;
            case "***" -> 7;
            default -> 8;
        };
    }
}