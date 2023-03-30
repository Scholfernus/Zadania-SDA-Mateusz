package org.example.Task_Chat.Day3;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class StringsChatTaskCountNumbert<K, V> {
    public static void main(String[] args) {
        System.out.println("Wpisz dowolne zdanie, obliczę ile jest poszczególnych liter: ");
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        line = line.toLowerCase();
        line.trim();
        char[] array = line.toCharArray();
        line.length();
        System.out.println(array.length);
        Map<Character, Integer> letterCount = new HashMap<>();
        for (char c : line.toCharArray()) {
            if (Character.isLetter(c)) {
                letterCount.put(c, letterCount.getOrDefault(c, 0) + 1);
            }
        }
        for (char c : letterCount.keySet()) {
            int count = letterCount.get(c);
            System.out.printf("Litera '%c' wystąpiła %d x%n", c, count);
        }
        //Altenatywne rozwiązanie
//        System.out.println("Liczba wystąpień każdej litery: ");
//        for (Map.Entry<Character, Integer> entry : letterCounts.entrySet()) {
//            System.out.printf("%s: %d%n", entry.getKey(), entry.getValue());
//        }
    }
}
