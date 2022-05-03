package com.gitproject;

import java.util.*;

public class Beecrowd1251_uri {
    public static void main(String[] args) {
        boolean line = false;
        try (Scanner s = new Scanner(System.in)) {
            while (s.hasNext()) {
                if (line) {
                    System.out.println();
                }
                line = true;
                String input = s.nextLine();
                HashMap<String, Integer> map = new HashMap<>();

                for (Character c : input.toCharArray()) {
                    Integer num = 1;
                    String ascii = String.valueOf(c);
                    if (map.containsKey(ascii)) {
                        num += map.get(ascii);
                    }
                    map.put(ascii, num);
                }
                Map<String, Integer> sorted = sortByValueThenKey(map);
                for (String r: sorted.keySet()) {
                    System.out.println(((int) (r.charAt(0)) + " " + sorted.get(r)));
                }
            }
        }
    }

    public static HashMap<String, Integer>
    sortByValueThenKey(HashMap<String, Integer> hm)
    {
        // Create a list from elements of HashMap
        List<Map.Entry<String, Integer> > list = new LinkedList<>(hm.entrySet());

        // Sort the list using lambda expression
        list.sort((i1, i2) ->
                i1.getValue().equals(i2.getValue()) ?
                        i2.getKey().compareTo(i1.getKey()) : i1.getValue().compareTo(i2.getValue()));

        // put data from sorted list to hashmap
        HashMap<String, Integer> temp = new LinkedHashMap<>();
        for (Map.Entry<String, Integer> aa : list) {
            temp.put(aa.getKey(), aa.getValue());
        }
        return temp;
    }
}
