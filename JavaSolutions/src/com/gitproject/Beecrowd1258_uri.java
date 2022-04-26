package com.gitproject;

//this was a good exercise, learnt a lot.

import java.util.Arrays;
import java.util.Scanner;

class Student implements Comparable<Student> {
    public String color;
    public String size;
    public String name;

    public Student(String color, String size, String name) {
        this.color = color;
        this.size = size;
        this.name = name;
    }

    @Override
    public int compareTo(Student student) {
        int value1 = color.compareTo(student.color);  //ascending color
        if (value1 == 0) {
            int value2 = student.size.compareTo(size);  //descending size
            if (value2 == 0) {
                return name.compareTo(student.name);  //ascending name
            }
            else {
                return value2;
            }
        }
        return value1;
    }
}

public class Beecrowd1258_uri {
    public static void main(String[] args)  {

        Scanner s = new Scanner(System.in);
        int t = s.nextInt();


        while (t != 0) {
            s.nextLine();
            Student[] students = new Student[t];

            for (int i = 0; i < t; i++) {

                String name = s.nextLine();

                String[] line = s.nextLine().split(" ");
                Student temp = new Student(null, null, null);
                temp.color = line[0];
                temp.size = line[1];
                temp.name = name;
                students[i] = temp;
            }

            Arrays.sort(students);
            for (int i = 0; i < t; i++) {
                System.out.println(students[i].color + " " + students[i].size + " " + students[i].name);
            }
            t = s.nextInt();
            if (t != 0)
                System.out.println();
        }
    }
}