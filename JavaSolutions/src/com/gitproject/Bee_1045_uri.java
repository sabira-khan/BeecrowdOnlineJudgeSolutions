package com.gitproject;
import java.util.Scanner;

public class Bee_1045_uri {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        double a = 0.0, b = 0.0, c = 0.0;
        double p = s.nextDouble();
        double q = s.nextDouble();
        double r = s.nextDouble();

        if ( p > q && p > r) {
            a = p;
            b = q;
            c = r;
        }
        else if (q > p && q > r) {
            a = q;
            b = p;
            c = r;
        }
        else if ( r > p && r > q) {
            a = r;
            b = p;
            c = q;
        }
        else if ( p == q && p == r) //all 3 equal
        {
            a = p;
            b = q;
            c = r;
        }
        else if ( p < q && q == r) // isosceles p greatest
        {
            a = q;
            b = p;
            c = r;
        }
        else if ( q < p && p == r) //isosceles q greatest
        {
            a = p;
            b = q;
            c = r;
        }
        else if ( r < p && q == p) //isosceles r greatest
        {
            a = p;
            b = r;
            c = q;
        }

        if (a >= b + c) {
            System.out.println("NAO FORMA TRIANGULO");
        }
        while ( a != b + c && a < b + c) {
            if (a * a == (b * b + c * c))
                System.out.println("TRIANGULO RETANGULO");
            if (a * a > (b * b + c * c))
                System.out.println("TRIANGULO OBTUSANGULO");
            if (a * a < (b * b + c * c))
                System.out.println("TRIANGULO ACUTANGULO");
            if (a == b && b == c)
                System.out.println("TRIANGULO EQUILATERO");
            if (a == b && c != a || b == c && b != a || c == a && c != b)
                System.out.println("TRIANGULO ISOSCELES");

            break;

        }
    }
}
