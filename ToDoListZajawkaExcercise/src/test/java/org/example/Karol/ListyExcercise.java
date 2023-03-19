package org.example.Karol;

import java.util.*;

public class ListyExcercise {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        list.add("Paul");
        list.add("Adam");
        list.add("Marcin");
        list.add("Zenon");
        list.add("Krzysztof");
        list.add("Stefan");

        System.out.println(list);
        list.remove(2);
        System.out.println(list);
        list.add(4, "Krystyna");
        System.out.println(list);
        Collections.sort(list);
        System.out.println(list);
        boolean czy = list.contains("Adam");
        System.out.println(czy);
        for (String names : list)
        System.out.println(names);

        Set<String> imiona = new HashSet<>();
        imiona.add("Paul");
        imiona.add("Adam");
        imiona.add("Marcin");
        imiona.add("Zenon");
        imiona.add("Krzysztof");
        imiona.add("Stefan");
        imiona.add("Adam");
        imiona.add("Zenon");
        System.out.println(imiona);
    }
}
