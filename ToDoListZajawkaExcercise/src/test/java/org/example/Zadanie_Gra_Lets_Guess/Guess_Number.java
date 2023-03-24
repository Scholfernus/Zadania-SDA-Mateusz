package org.example.Zadanie_Gra_Lets_Guess;

import java.util.Arrays;
import java.util.Scanner;

public class Guess_Number {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        invitation();
        howManyNumbers();
//        guessNumber();

    }

    public static void invitation() {
        System.out.println("Hello !.\nThis is a simple game. Guess the numbers. You have 5 chances.\nLet's go... " +
                " Type how many numbers you want to guess: 3,4 or 5 ?");
    }

    public static void howManyNumbers() {
        int howMany;
        boolean y = true;
        int lives = 5;

        int[] numbers = new int[howMany = scanner.nextInt()];
        if (howMany>2 && howMany<5) {
            for (int i = 0; i < numbers.length; i++) {
                numbers[i] = (int) (Math.random() * 10);
            }
        }
        else {
            System.out.println("You type incorrect number. Try again...");

        }
        System.out.println(Arrays.toString(numbers));
        while (y) {
            System.out.print("Guess randed numbers: -> ");
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

    private static String checkNumber(int index, int given, int[] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            if (given == numbers[i]) {
                if (i == index) {
                    return "HOT";
                } else {
                    return "WARM"; //jeśli jest dobry indeks
                }
            }
        }
        return "COLD"; //jeśli nic się nie zgadza
    }

    private static boolean isEnd(String[] results) {
        for (String result : results) {
            if (!result.equals("HOT")) { //warunek boolean
                return false;
            }
        }

        return true;
    }
}


