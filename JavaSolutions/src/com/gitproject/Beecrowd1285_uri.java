package com.gitproject;
import java.util.ArrayList;
import java.util.Scanner;

public class Beecrowd1285_uri {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        while (s.hasNext()) {

            int x = Integer.parseInt(s.next());
            int y = Integer.parseInt(s.next());
            int count = 0;

            for (int i = x; i <= y; i++) {
                ArrayList<Integer> j = new ArrayList<>();
                boolean noRepeat = true;
                int temp = i;

                while (temp > 0) {
                    int n = temp % 10;
                    if (j.contains(n)) {
                        noRepeat = false;
                        break;
                    }
                    else {
                        j.add(n);
                    }
                    temp = temp / 10;
                }
                if (noRepeat) {
                    count++;
                }
            }
            System.out.println(count);
        }
    }
}

