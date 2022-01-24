package com.gitproject;
import java.util.Scanner;

public class Beecrowd1448_uri {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        s.nextLine();
        int instance = 1;
        boolean firstMatch;
        int trackFM, countA, countB;

        while (n-- > 0) {
            String o = s.nextLine();
            String a = s.nextLine();
            String b = s.nextLine();

            countA = 0;
            countB = 0;
            trackFM = -1;
            firstMatch = true;

            for (int i = 0; i <= o.length()-1; i++) { //here I had used o.length-1, but that gave me index out of
                // error, but why...

                boolean Amatch = o.charAt(i) == a.charAt(i);
                boolean Bmatch = o.charAt(i) == b.charAt(i);
                if (Amatch) {
                    countA++;
                }
                else{
                    if(firstMatch && Bmatch){
                        trackFM = 1;
                        firstMatch = false;
                    }}

                if (Bmatch) {
                    countB++;
                }
                else{
                    if(firstMatch && Amatch){
                        trackFM = 0;
                        firstMatch = false;
                    }}
            }

            System.out.println("Instancia " + instance);

            if (countA > countB) {
                System.out.println("time 1");
            }
            else if (countA < countB) {
                System.out.println("time 2");
            }
            else {
                if (trackFM == 0) {
                    System.out.println("time 1");
                }
                else if (trackFM == 1) {
                    System.out.println("time 2");
                }
                else {
                    System.out.println("empate");
                }
            }
            instance++;
            System.out.println();
        }
    }
}
