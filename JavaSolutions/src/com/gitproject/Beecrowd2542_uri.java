package com.gitproject;
import java.io.IOException;
import java.util.Scanner;

public class Beecrowd2542_uri {
        public static void main(String[] args) throws IOException {
            Scanner s = new Scanner(System.in);

            while(s.hasNext()){
                int a = s.nextInt(); //attribute num
                int m = s.nextInt(); //m cards num
                int l = s.nextInt(); //l cards num

                //choose long as 10^9
                long[][] marco_deck = new long[m][a];
                for(int i = 0 ; i < m ; i++){
                    for(int j = 0 ; j<  a ; j++) {
                        marco_deck[i][j] = s.nextLong();
                    }}

                long[][] leo_deck = new long[l][a];
                for(int i = 0 ; i < l ; i++) {
                    for(int j = 0 ; j<  a ; j++) {
                        leo_deck[i][j] = s.nextLong();
                    }}

                int mi = s.nextInt()-1;  //index of marco card
                int li = s.nextInt()-1;  //index of leo card
                int da = s.nextInt()-1;   //attribute index

                long cm   = marco_deck[mi][da];  //card being compared from marco deck
                long cl = leo_deck[li][da];   //card being compared from leo deck

                if (cm > cl)
                    System.out.println("Marcos");
                else if (cl > cm)
                    System.out.println("Leonardo");
                else
                    System.out.println("Empate");
            }
        }
    }
