package com.gitproject;
import java.util.Scanner;

public class Beecrowd1094_uri {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int caseT = s.nextInt();

        int num, countC = 0, countS = 0, countR = 0, countAll;
        double perC ,perR ,perS;
        String name;

        for (int i = 0; i < caseT; i++) {
            num = s.nextInt();
            name = s.nextLine();

            switch (name) {
                case " C" -> countC += num;
                case " R" -> countR += num;
                case " S" -> countS += num;
            }

        }
        countAll = countC + countS + countR;
        perC =  ((double) countC / countAll) * 100.00;
        perR = ((double) countR / countAll) * 100.00;
        perS = ((double) countS / countAll) * 100.00;

        System.out.println("Total: " + countAll + " cobaias");
        System.out.println("Total de coelhos: " + countC);
        System.out.println("Total de ratos: " + countR);
        System.out.println("Total de sapos: " + countS);
        System.out.printf("Percentual de coelhos: %.2f", perC);
        System.out.println(" %");
        System.out.printf("Percentual de ratos: %.2f", perR);
        System.out.println(" %");
        System.out.printf("Percentual de sapos: %.2f", perS);
        System.out.println(" %");

    }
}
