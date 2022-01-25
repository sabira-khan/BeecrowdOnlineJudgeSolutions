package com.gitproject;
import java.util.Scanner;

    public class Beecrowd1542_uri {
        public static void main(String[] args) {
            Scanner s = new Scanner(System.in);
            int num_old_pages = s.nextInt();
            int num_speed_up_days;
            int num_new_pages;

            while (num_old_pages != 0) {
                num_speed_up_days = s.nextInt();
                num_new_pages = s.nextInt();

                int day_difference = num_new_pages - num_old_pages;

                int book = (num_new_pages * num_speed_up_days * num_old_pages) / day_difference;

                System.out.println(book == 1? book + " pagina" : book + " paginas") ;
                num_old_pages = s.nextInt();
            }

        }
    }

