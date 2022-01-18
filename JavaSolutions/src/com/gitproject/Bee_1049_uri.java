package com.gitproject;

import java.util.Scanner;

public class Bee_1049_uri {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        String c1 = s.next();
        String c2 = s.next();
        String c3 = s.next();

        if(c1.equals("vertebrado") && c2.equals("ave") && c3.equals("carnivoro")){
            System.out.println("aguia");
        }
        else if(c1.equals("vertebrado") && c2.equals("ave") && c3.equals("onivoro")){
            System.out.println("pomba");
        }
        else if(c1.equals("vertebrado") && c2.equals("mamifero") && c3.equals("onivoro")){
            System.out.println("homem");
        }
        else if(c1.equals("vertebrado") && c2.equals("mamifero") && c3.equals("herbivoro")){
            System.out.println("vaca");
        }
        else if(c1.equals("invertebrado") && c2.equals("inseto") && c3.equals("hematofago")){
            System.out.println("pulga");
        }
        else if(c1.equals("invertebrado") && c2.equals("inseto") && c3.equals("herbivoro")){
            System.out.println("lagarta");
        }
        else if(c1.equals("invertebrado") && c2.equals("anelideo") && c3.equals("hematofago")){
            System.out.println("sanguessuga");
        }
        else if(c1.equals("invertebrado") && c2.equals("anelideo") && c3.equals("onivoro")){
            System.out.println("minhoca");
        }
    }
}
