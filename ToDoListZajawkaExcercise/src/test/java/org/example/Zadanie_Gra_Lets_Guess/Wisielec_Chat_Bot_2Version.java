package org.example.Zadanie_Gra_Lets_Guess;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Wisielec_Chat_Bot_2Version {
    public static void main(String[] args) {
        howManyLetters();
    }

    public static void howManyLetters() {
        Scanner scanner = new Scanner(System.in);

        int howManyLetters;
        boolean ok = false;
        int lives = 10;
        String[] words3 = {"Dad", "Mom", "Cat", "Dog", "Cow", "Sun", "Son", "Dom"};
        String[] words4 = {"Back", " Bass", "Blue", "Aged", "Busy", "Once", "Save", "Feel", "Bank"};
        String[] words5 = {"Adult", "Where", "Agree", "Error", "After", "Alone", "Brave", "Earth", "Faith"};
        Random random = new Random();
        int index = random.nextInt(8);

        System.out.print("How many letters should the word have? ");
        howManyLetters = scanner.nextInt();
        scanner.nextLine(); // consume the new line character
        String guessWord = "";
        if (howManyLetters == 3) {
            guessWord = words3[index];
        } else if (howManyLetters == 4) {
            guessWord = words4[index];
        } else if (howManyLetters == 5) {
            guessWord = words5[index];
        }

        char[] chars = guessWord.toCharArray();
        char[] guessedLetters = new char[howManyLetters];
        Arrays.fill(guessedLetters, '_');
        System.out.println(Arrays.toString(guessedLetters));
        while (lives > 0) {
            System.out.print("\nGuess the word: type a letter-> ");
            String guess = scanner.nextLine();
            if (guess.length() != 1) {
                System.out.println("You can only guess one letter at a time. Try again...");
                continue;
            }
            boolean letterFound = false;
            for (int j = 0; j < chars.length; j++) {
                if (chars[j] == guess.charAt(0)) {
                    guessedLetters[j] = guess.charAt(0);
                    letterFound = true;
                }
            }
            if (letterFound) {
                System.out.println("You found a letter");
                System.out.println(Arrays.toString(guessedLetters));
            } else {
                System.out.println("You typed an incorrect letter. You have " + --lives + " lives left.");
            }
            if (Arrays.equals(chars, guessedLetters)) {
                System.out.println("Congratulations! You have guessed the word.");
                break;
            }
        }
        if (lives == 0) {
            System.out.println("You have run out of lives. The word was: " + guessWord);
        }
    }


}
