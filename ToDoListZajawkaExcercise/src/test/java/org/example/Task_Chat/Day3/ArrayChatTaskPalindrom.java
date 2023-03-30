package org.example.Task_Chat.Day3;

import java.util.Scanner;

public class ArrayChatTaskPalindrom {
    public static void main(String[] args) {
        System.out.println("Wpisz dowolne słowo w celu weryfikacji:");
        Scanner scanner = new Scanner(System.in);
        String sentence = scanner.nextLine();
        sentence = sentence.toLowerCase();
        char[] charArray = sentence.toCharArray();
        char[] reverseCharArray = new char[charArray.length];
        for (int i = charArray.length - 1, j = 0; i >= 0; i--, j++) {
            reverseCharArray[j] = charArray[i];
        }

        boolean isPalindrome = true;
        for (int i = 0; i < charArray.length; i++) {
            if (charArray[i] != reverseCharArray[i]) {
                isPalindrome = false;
                break;
            }
        }
        if (isPalindrome) {
            System.out.println("Słowo czyta się wspak");
        } else {
            System.out.println("Słowo nie czyta się wspak.");
        }
    }
}



