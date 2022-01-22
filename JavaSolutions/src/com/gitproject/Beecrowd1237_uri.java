package com.gitproject;
import java.util.Scanner;

public class Beecrowd1237_uri {

        public static void main(String[] args) {
            Scanner s = new Scanner(System.in);

            while (s.hasNextLine()) {
                String x = s.nextLine();
                String y = s.nextLine();

                System.out.println(LongestCommonSubstring(x,y).length());

            }

        }

        public static String LongestCommonSubstring(String p, String q) {
            int[][] temp = new int[p.length()][q.length()];
            String out = "";

            for (int i = 0; i < p.length(); i++) {
                for (int j = 0; j < q.length(); j++) {
                    if (p.charAt(i) == q.charAt(j)) {
                        if (i == 0 || j == 0) {
                            temp[i][j] = 1;
                        }
                        else {
                            temp[i][j] = temp[i-1][j-1] + 1;
                        }
                        if (temp[i][j] > out.length()) {
                            out = p.substring(i-temp[i][j]+1, i+1);
                        }
                    }
                }
            }
            return out;
        }
    }

