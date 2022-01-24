package com.gitproject;

import java.util.Scanner;

public class Beecrowd1435_uri {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int order = s.nextInt();
        int row, col, line, newLayer, x, y;

        //loop will continue while order is non zero or has another token
        while (order != 0 || s.hasNext()) {

            int[][] matrix = new int [order][order];

            //number of new layers printed with elements greater than 1
            newLayer = order/2;

            //if order is odd number, increment newLayer by 1 or you could use ceiling
            if (order % 2 == 1)
                newLayer++;

            //this variable will point towards the position in the array from where 1 will be printed
            // or incremented, depending on layer number
            x = 0;

            //this variable will point towards the position in the array till which 1 will be printed
            // or incremented, depending on layer number
            y = order - 1;

            for(line = 1; line <= newLayer; line++){
                for(row = x; row <= y; row++){
                    for(col = x; col <= y; col++){
                        matrix[row][col]=line;
                    }
                }
                x++;  //increment x to change starting position of bigger element
                y--;  //decrement y to change ending position of bigger element
            }

            //Print as normal
            for(row = 0; row < order; row++){
                for(col = 0; col < order; col++){

                    if(col == 0)
                        System.out.printf("%3d",matrix[row][col]);
                    else
                        System.out.printf(" %3d",matrix[row][col]);
                }
                System.out.println();
            }
            System.out.println();
            order = s.nextInt();
        }
    }
}