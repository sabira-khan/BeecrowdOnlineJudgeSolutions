package com.gitproject;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Beecrowd1763_uri {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        Map<String,String> app = new HashMap<>();
        app.put("brasil","Feliz Natal!");
        app.put("alemanha", "Frohliche Weihnachten!");
        app.put("austria", "Frohe Weihnacht!");
        app.put("coreia", "Chuk Sung Tan!");
        app.put("espanha", "Feliz Navidad!");
        app.put("grecia", "Kala Christougena!");
        app.put("estados-unidos", "Merry Christmas!");
        app.put("inglaterra", "Merry Christmas!");
        app.put("australia", "Merry Christmas!");
        app.put("portugal", "Feliz Natal!");
        app.put("suecia", "God Jul!");
        app.put("turquia", "Mutlu Noeller");
        app.put("argentina", "Feliz Navidad!");
        app.put("chile", "Feliz Navidad!");
        app.put("mexico", "Feliz Navidad!");
        app.put("antardida", "Merry Christmas!");
        app.put("canada", "Merry Christmas!");
        app.put("irlanda", "Nollaig Shona Dhuit!");
        app.put("belgica", "Zalig Kerstfeest!");
        app.put("italia", "Buon Natale!");
        app.put("libia", "Buon Natale!");
        app.put("siria", "Milad Mubarak!");
        app.put("marrocos", "Milad Mubarak!");
        app.put("japao", "Merii Kurisumasu!");

        while (s.hasNext()) {
            String name = s.next();
            System.out.println(app.getOrDefault(name, "--- NOT FOUND ---"));

        }
    }
}