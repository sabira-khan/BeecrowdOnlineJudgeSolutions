package com.gitproject;
import java.util.Scanner;

public class Beecrowd1219_uri {
    public static void main(String[] args) {

                Scanner n = new Scanner(System.in);

                while (n.hasNextInt()) {
                    double a = n.nextInt();
                    double b = n.nextInt();
                    double c = n.nextInt();

                    //area of triangle
                    double s =  (a + b + c) / 2;
                    double tri_a = Math.sqrt(s*(s-a)*(s-b)*(s-c));

                    //area of small circle
                    double small_c_r = Math.sqrt(((s - a)*(s - b)*(s - c)) / s);
                    double smallC_a = Math.PI * small_c_r * small_c_r;

                    //area of big circle
                    double big_c_r = (a*b*c) / Math.sqrt((a+b+c)*(b+c-a)*(c+a-b)*(a+b-c));
                    double bigC_a = Math.PI * big_c_r * big_c_r;

                    //area of yellow
                    double yellow = bigC_a - tri_a;

                    //area of violet
                    double violet = tri_a - smallC_a;

                    System.out.printf("%.4f %.4f %.4f\n", yellow, violet, smallC_a);

                }
            }
        }

