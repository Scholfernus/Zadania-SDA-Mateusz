package org.example.Zadanie_Gra_Lets_Guess;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Guess_Number_Chat {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        invitation();
        howManyNumbers();
    }
    public static void howManyNumbers() {
        int howMany;
        boolean y = false;
        int lives = 5;

        Set<Integer> numbers = new HashSet<>();
        do {
            System.out.println("Type how many numbers you want to guess: 3, 4 or 5?");
            howMany = scanner.nextInt();
        } while (howMany < 3 || howMany > 5);

        while (numbers.size() < howMany) {
            numbers.add((int) (Math.random() * 10));
        }

        System.out.println(numbers);

        while (!y) {
            System.out.print("Guess random numbers: -> ");
            int[] guessingNumbers = new int[howMany];
            for (int i = 0; i < guessingNumbers.length; i++) {
                guessingNumbers[i] = scanner.nextInt();
            }
            String[] results = new String[howMany];
            for (int i = 0; i < howMany; i++) {
                results[i] = checkNumber(i, guessingNumbers[i], numbers);
            }
            System.out.printf(Arrays.toString(guessingNumbers) + "\n");
            lives--;
            System.out.println(Arrays.toString(results));
            if (isEnd(results) || lives == 0) {
                System.out.println("The game is over");
                break;
            }
            System.out.printf("Pozostało Ci %d prób !!!\n", lives);
        }
    }
    private static String checkNumber(int index, int given, Set<Integer> numbers) {
        if (numbers.contains(given)) {
            if (numbers.toArray()[index].equals(given)) {
                return "HOT";
            } else {
                return "WARM";
            }
        } else {
            return "COLD";
        }
    }
    private static boolean isEnd(String[] results) {
        for (String result : results) {
            if (!result.equals("HOT")) { //warunek boolean
                return false;
            }
        }
        return true;
    }
    public static void invitation() {
        System.out.println("Hello !.\nThis is a simple game. Guess the numbers. You have 5 chances.\nLet's go... " +
                " Type how many numbers you want to guess: 3,4 or 5 ?");
    }
}
