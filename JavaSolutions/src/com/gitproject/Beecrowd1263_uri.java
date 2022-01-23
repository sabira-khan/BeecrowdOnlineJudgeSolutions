package com.gitproject;
import java.util.Scanner;

public class Beecrowd1263_uri {

        public static void main(String[] args) {
            Scanner s = new Scanner(System.in);

            while (s.hasNextLine()) {
                String a = s.nextLine();
                String[] list = a.split(" ");
                int count = 0;
                boolean noAll = false;
                char x, y;


                for (int i = 0; i < list.length-1; i++) {
                    x = list[i].toLowerCase().charAt(0);
                    y = list[i+1].toLowerCase().charAt(0);
                    if (x == y && !noAll) {
                        count++;
                        noAll = true;
                    }
                    else if (x != y){
                        noAll = false;
                    }
                }
                System.out.println(count);
            }}}


