package com.gitproject;
import java.util.Scanner;

public class Beecrowd1051_uri {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        double salary = s.nextDouble();
        double netTax;
        double tempTax1, tempTax2, tempTax3;
        double rate1 = 0.08, rate2 = 0.18, rate3 = 0.28;

        if (salary >= 0.0 && salary <= 2000.00)
            System.out.println("Isento");

        else if (salary >= 2000.01 && salary <= 3000.00 ){
            netTax = rate1 * (salary - 2000);
            System.out.printf("R$ %.2f\n", netTax);
        }
        else if (salary >= 3000.01 && salary <= 4500.00) {
            tempTax1 = 1000 * rate1;
            tempTax2 = (salary - 3000.00) * rate2;
            netTax = tempTax1 + tempTax2;
            System.out.printf("R$ %.2f\n", netTax);
        }
        else if (salary >= 4500.00) {
            tempTax1 = 1000 * rate1;
            tempTax2 = 1500.00 * rate2;
            tempTax3 = (salary - 4500.00) * rate3;
            netTax = tempTax1 + tempTax2 + tempTax3;
            System.out.printf("R$ %.2f\n", netTax);
        }
    }
}
