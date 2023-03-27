package org.example.Zadanie_Gra_Lets_Guess;

import java.util.Arrays;
import java.util.Random;

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
        boolean ok = false;
        int lives = 10;
        String[] words3 = {"Dad", "Mom", "Cat", "Dog", "Cow", "Sun", "Son", "Dom"};
        String[] words4 = {"Back", " Bass", "Blue", "Aged", "Busy", "Once", "Save", "Feel", "Bank"};
        String[] words5 = {"Adult", "Where", "Agree", "Error", "After", "Alone", "Brave", "Earth", "Faith"};
        Random random = new Random();
        int index = random.nextInt(8);

        String[] letters = new String[howManyLetters = scanner.nextInt()];
        ok = true;
        if (howManyLetters == 3) {
            for (int i = 0; i < letters.length; i++) {
                letters[i] = "_ ";
                System.out.print("_ ");
            }
            char[] chars = words3[index].toCharArray();
            String guessWord = scanner.nextLine();
            if (guessWord.equals(words3[index])){
                System.out.println("bla bla bla");
            }
//            System.out.print("\n" + words3[index]);

        } else if (howManyLetters == 4) {
            for (int i = 0; i < letters.length; i++) {
                letters[i] = "_ ";
                System.out.print("_ ");
            }
            System.out.print("\n" + words4[index]);
            char[] chars = words4[index].toCharArray();

        } else if (howManyLetters == 5) {
            for (int i = 0; i < letters.length; i++) {
                letters[i] = "_ ";
                System.out.print("_ ");
            }
            System.out.print("\n" + words5[index]);
            char[] chars = words5[index].toCharArray();

            System.out.println("\n" + Arrays.toString(chars));
        }
        System.out.print("\nGuess randed word: type a letter-> ");

        while (ok) {
            String guessWord = scanner.nextLine();
            lives--;
            if (words3[index].contains(guessWord)) {
                System.out.println("You find a letter");
                for (int i = 0; i < letters.length; i++) {
                    if (words3[index].charAt(i) == guessWord.charAt(0)) {
                        letters[i] = guessWord;
                    }
                }
                System.out.println(Arrays.toString(letters));
            } else {
                System.out.println("You type incorrect letter. Try again...");
            }
            if (lives == 0) {
                System.out.println("Game over! You are out of lives.");
                ok = false;
            }

            if (guessWord.equals(words3[index])) {
                System.out.println("You find a letter");
            }
            if (words3[index].contains(guessWord)) {

                System.out.println((words3[index]));

            } else {
                System.out.println("You type incorrect letter. Try again...");

            }
        }
        System.out.println("You win. The game is over");
    }
}

