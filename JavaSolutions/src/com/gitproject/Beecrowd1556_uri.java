package com.gitproject;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Beecrowd1556_uri {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        while (s.hasNext()) {
            String input = s.next();
            TreeSet<String> subseq_list = new TreeSet<>();
            sequence(subseq_list, input);
            for (String str : subseq_list) {
                System.out.println(str);
            }
            System.out.println();
        }
    }

    public static void sequence(Set<String> subseq_list, String str)
    {
        if (str.length() == 0) {
            return;
        }
        if (!subseq_list.contains(str)) {
            subseq_list.add(str);
            for (int i = 0; i < str.length(); i++) {
                String temp = str;
                temp = temp.substring(0, i) + temp.substring(i + 1);
                sequence(subseq_list, temp);
            }
        }
    }
}

