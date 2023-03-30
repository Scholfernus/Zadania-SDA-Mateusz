package org.example.Task_Chat.Day3;

import java.util.Scanner;

public class ArrayIsPalindromChatSolution {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.println("Wpisz dowolne słowo");
        String word = scanner.nextLine().toLowerCase();

        char[] wordChars = word.toCharArray();
        char[] reverseChars = new char[wordChars.length];

// kopiowanie liter do tablicy w odwrotnej kolejności
        for (int i = wordChars.length - 1, j = 0; i >= 0; i--, j++) {
            reverseChars[j] = wordChars[i];
        }

        boolean isPalindrome = true;
// porównywanie liter z obu tablic
        for (int i = 0; i < wordChars.length; i++) {
            if (wordChars[i] != reverseChars[i]) {
                isPalindrome = false;
                break;
            }
        }

        if (isPalindrome) {
            System.out.println("Słowo czyta się wspak");
        } else {
            System.out.println("Słowo nie czyta się wspak");
        }
    }
}
