package com.gitproject;
import java.util.Scanner;

public class Bee_1041_uri {
    public static void main(String[] args) {
            Scanner s = new Scanner(System.in);

            double X = s.nextDouble();
            double Y = s.nextDouble();

            if(X == 0.0 && Y == 0.0){
                System.out.println("Origem");
            }
            else if(X > 0.0 && Y > 0.0){
                System.out.println("Q1");
            }
            else if(X == 0.0){
                System.out.println("Eixo Y");
            }
            else if(Y == 0.0){
                System.out.println("Eixo X");
            }
            else if(X < 0.0 && Y > 0.0){
                System.out.println("Q2");
            }
            else if(X < 0.0 && Y < 0.0){
                System.out.println("Q3");
            }
            else{
                System.out.println("Q4");
            }

    }
}
