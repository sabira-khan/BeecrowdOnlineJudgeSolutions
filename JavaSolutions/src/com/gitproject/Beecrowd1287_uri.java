package com.gitproject;
import java.math.BigInteger;
import java.util.Scanner;

public class Beecrowd1287_uri {
        public static void main(String[] args) {
            Scanner s = new Scanner(System.in);

            while(s.hasNextLine()) {

                String w = s.nextLine();
                w = w.replaceAll(",", "").replaceAll("O","0").replaceAll("o","0").replaceAll("l","1").replaceAll(" ","");
                boolean num = true;
                if (w.equals("")) {
                    System.out.println("error");
                }
                else {
                    for (int i = 0; i < w.length(); i++) {
                        if (Character.isAlphabetic(w.charAt(i))) {
                            num = false;
                            break;
                        }
                    }
                    if (!num) {
                        System.out.println("error");
                    }
                    else {
                        BigInteger n = new BigInteger(w);
                        BigInteger x = new BigInteger("2147483647");
                        if (x.compareTo(n) < 0 ) {
                            System.out.println("error");
                        }
                        else {
                            System.out.println(Integer.parseInt(w));
                        }
                    }
                }

            }
        }
}

