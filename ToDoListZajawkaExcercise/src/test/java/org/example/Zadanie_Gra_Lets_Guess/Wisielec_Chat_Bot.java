package org.example.Zadanie_Gra_Lets_Guess;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Wisielec_Chat_Bot {
    public static void main(String[] args) {
        howManyLetters();
    }

    public static void howManyLetters() {
        Scanner scanner = new Scanner(System.in);

        int howManyLetters;
        boolean ok = false;
        int lives = 10;
        String[] words3 = {"Dad", "Mom", "Cat", "Dog", "Cow", "Sun", "Son", "Dom"};
        String[] words4 = {"Back", "Bass", "Blue", "Aged", "Busy", "Once", "Save", "Feel", "Bank"};
        String[] words5 = {"Adult", "Where", "Agree", "Error", "After", "Alone", "Brave", "Earth", "Faith"};
        Random random = new Random();
        int index = random.nextInt(8);

        System.out.print("How many letters should the word have? ");
        howManyLetters = scanner.nextInt();
        scanner.nextLine(); // consume the new line character
        System.out.print("_ ".repeat(howManyLetters));
        String guessWord = scanner.nextLine();

        char[] chars;
        if (howManyLetters == 3) {
            chars = words3[index].toCharArray();
            if (guessWord.equalsIgnoreCase(words3[index])) {
                System.out.println("Congratulations! You won!");
                return;
            }
        } else if (howManyLetters == 4) {
            chars = words4[index].toCharArray();
        } else if (howManyLetters == 5) {
            chars = words5[index].toCharArray();
        } else {
            System.out.println("Invalid input. The word length can only be 3, 4, or 5.");
            return;
        }

        System.out.println("\nGuess the word: type a letter-> ");
        char[] guessedLetters = new char[howManyLetters];
        Arrays.fill(guessedLetters, '_');
        for (int i = 0; i < guessedLetters.length; i++) {
            String guess = scanner.nextLine();
            if (guess.length() != 1) {
                System.out.println("You can only guess one letter at a time. Try again...");
                i--;
                continue;
            }
            boolean letterFound = false;
            for (int j = 0; j < chars.length; j++) {
                if (Character.toLowerCase(chars[j]) == Character.toLowerCase(guess.charAt(0))) {
                    guessedLetters[j] = chars[j];
                    letterFound = true;
                }
            }
            if (letterFound) {
                System.out.println("You found a letter!");
                System.out.println(Arrays.toString(guessedLetters));
                if (Arrays.equals(chars, guessedLetters)) {
                    System.out.println("Congratulations! You won!");
                    return;
                }
            } else {
                lives--;
                System.out.println("You typed an incorrect letter. You have " + lives + " lives left.");
                if (lives == 0) {
                    System.out.println("Game over! The word was: " + new String(chars));
                    return;
                }
            }
        }
    }
}
