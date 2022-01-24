package com.gitproject;
import java.util.Scanner;

public class Beecrowd1305_uri {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        while (s.hasNextLine()) {
            String n = s.nextLine();
            double num = Double.parseDouble(n);              //number
            double cutoff = Double.parseDouble(s.nextLine());//cutoff

            String p;
            if (n.contains(".") && (n.charAt((n.length()-1)) != '.')) {
                String[] m = n.split("\\.");
                p = "0." + m[1];
            }
            else if (n.charAt((n.length()-1)) == '.') {
                p = "0.0";
            }
            else
                p = "0.0";
            double temp = Double.parseDouble(p); //decimal part of num
            int ans = temp > cutoff ? (int) Math.ceil(num) : (int) Math.floor(num);  //final int
            System.out.println(ans);


        }
    }
}
