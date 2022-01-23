package com.gitproject;
import java.util.Scanner;

public class Beecrowd1277_uri {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();

        while (n-- > 0) {
            int p = s.nextInt();
            String[] c = new String[p];
            String[] a = new String[p];
            int countP = 0;
            int countM = 0;
            double avg ;
            StringBuilder x = new StringBuilder();

            for (int i = 0; i < p; i++) {
                c[i] = s.next();
            }
            s.nextLine();
            for (int i = 0; i < p; i++) {
                a[i] = s.next();
                for (int j = 0; j < a[i].length(); j++) {
                    if (a[i].charAt(j) == 'P') {
                        countP++;
                    }
                    if (a[i].charAt(j) == 'M') {
                        countM++;
                    }
                }
                avg = (double) countP/(a[i].length() - countM);
                if (avg < 0.75) {
                    x.append(c[i]);
                    x.append(" ");
                }
                countP = 0;
                countM = 0;
                avg = 0.0;
            }
            String f = x.toString().stripTrailing();
            System.out.println(f);
        }
    }
}

