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
        boolean ok = true;
        int lives = 10;
        String[] words3 = {"Dad", "Mom", "Cat", "Dog", "Cow", "Sun", "Son", "Dom"};
        String[] words4 = {"Back", " Bass", "Blue", "Aged", "Busy", "Once", "Save", "Feel", "Bank"};
        String[] words5 = {"Adult", "Where", "Agree", "Error", "After", "Alone", "Brave", "Earth", "Faith"};
        Random random = new Random();
        int index = random.nextInt(8);

        String[] letters = new String[howManyLetters = scanner.nextInt()];
        if (howManyLetters == 3) {
            for (int i = 0; i < letters.length; i++) {
                letters[i] = "_ ";
                System.out.print("_ ");
            }
            char[] chars = words3[index].toCharArray();
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
            if (guessWord.equals(words3[index])) {
                System.out.println("You find a letter");
            }
            if (words3[index].contains(guessWord)) {

                System.out.println((words3[index]));

            } else {
                System.out.println("You type incorrect letter. Try again...");

            }
        }


//            int[] guessingNumbers = new int[howManyLetters];
//            for (int i = 0; i < guessingNumbers.length; i++) {
//                guessingNumbers[i] = scanner.nextInt();
//            }
//            String[] results = new String[howManyLetters];
//            for (int i = 0; i < howManyLetters; i++) {
//                results[i] = checkNumber(i, guessingNumbers[i], letters);
//            }
//            System.out.printf(Arrays.toString(guessingNumbers) + "\n");
//            lives--;
//            System.out.println(Arrays.toString(results));
//            if (isEnd(results) || lives==0) {
//                System.out.println("The game is over");
//                break;
//            }
//            System.out.printf("Pozostało Ci %d prób !!!\n", lives);     }
//    }
//    private static String checkNumber(int index, int given, int[] numbers) {
//        for (int i = 0; i < numbers.length; i++) {
//            if (given == numbers[i]) {
//                if (i == index) {
//                    return "HOT";
//                } else {
//                    return "WARM"; //jeśli jest dobry indeks
//                }
//            }
//        }
//        return "COLD"; //jeśli nic się nie zgadza
//    }
//    private static boolean isEnd(String[] results) {
//        for (String result : results) {
//            if (!result.equals("HOT")) { //warunek boolean
//                return false;
//            }
//        }
//
//        return true;
    }
}

