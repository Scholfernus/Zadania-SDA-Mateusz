package org.example.Zadanie_Gra_Lets_Guess;

import java.util.Arrays;

import static org.example.Zadanie_Gra_Lets_Guess.Guess_Number.scanner;

public class Guess_Word {
    public static void main(String[] args) {
        invitation();
        howManyLetters();
    }

    public static void invitation() {
        System.out.println("Hello !.\nThis is a simple game. Guess the word. You have 10 chances.\nLet's go... " +
                " Type how many letters you want to guess: 3,4 or 5 ?");
    }

    public static void howManyLetters() {
        int howManyLetters;
        boolean ok = true;
        int lives = 5;

        String[] letters = new String[howManyLetters = scanner.nextInt()];
        if (howManyLetters ==3) {
            for (int i = 0; i < letters.length; i++) {
                letters[i] = "_ ";
            }
        } else if (howManyLetters == 4) {
            for (int i = 0; i < letters.length; i++) {
                letters[i] = "_ ";
            }
        } else if (howManyLetters == 5) {
            for (int i = 0; i < letters.length; i++) {
                letters[i] = "_ ";
            }
        } else {
            System.out.println("You type incorrect number. Try again...");
        }

        System.out.println(Arrays.toString(letters));
    }
}