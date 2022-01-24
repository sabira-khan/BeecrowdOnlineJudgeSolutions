package com.gitproject;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class Beecrowd1540_uri {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();

        for (int i = 0; i < n; i++) {

            BigDecimal y1 = s.nextBigDecimal();
            BigDecimal c1 = s.nextBigDecimal();
            BigDecimal y2 = s.nextBigDecimal();
            BigDecimal c2 = s.nextBigDecimal();

            BigDecimal ud = c2.subtract(c1);
            BigDecimal ld = y2.subtract(y1);
            BigDecimal finals = ud.divide(ld,2, RoundingMode.DOWN);


            String f = String.valueOf(finals);
            String num = f.split("[.]")[0];
            String dec = f.split("[.]")[1];
            System.out.println(num+","+dec.charAt(0)+dec.charAt(1));

        }
    }
}
