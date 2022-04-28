package com.gitproject;


import java.util.Arrays;
import java.util.Scanner;

class Deer implements Comparable<Deer> {
    public String name;
    public int weight;
    public int age;
    public double height;

    public Deer(String name, int weight, int age, double height) {
        this.name = name;
        this.weight = weight;
        this.age = age;
        this.height = height;
    }

    @Override
    public int compareTo(Deer o) {

        if (o.weight == weight) {
            if (o.age == age) {
                if (o.height == height) {
                    return name.compareTo(o.name);
                } else {
                    return height > o.height ? 1 : -1; //ascending
                }
            } else {
                return age > o.age ? 1 : -1;  //ascending
            }
        } else {
            return weight < o.weight ? 1 : -1;  //descending
        }
    }
}


public class Beecrowd1766_uri {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();

        int c = 1;

        while (t-- > 0) {

            int n = s.nextInt();
            int m = s.nextInt();
            s.nextLine();

            Deer[] deers = new Deer[n];
            for (int i = 0; i < n; i++) {
                String[] temp = s.nextLine().split(" ");
                deers[i] = new Deer(temp[0], Integer.parseInt(temp[1]), Integer.parseInt(temp[2]), Double.parseDouble(temp[3]));
            }

            Arrays.parallelSort(deers);
            System.out.printf("CENARIO {%d}\n", c);
            c++;

            for (int i = 0; i < m; i++) {
                System.out.println(i+1 + " - " + deers[i].name);
            }
        }
    }
}

