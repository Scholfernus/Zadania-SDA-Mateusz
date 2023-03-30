package org.example.Task_Chat;

import java.util.Scanner;

public class StringsChatTaskPalindrom {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Wpisz dowolne słowow w celu weryfikacji:");
        while (scanner.hasNext()) {

            String word = scanner.nextLine();
            word.toLowerCase();
            if (word.equals("end")) {
                break;
            }
            boolean isPalindrome = true;
            for (int i = 0; i < word.length() / 2; i++) {
                char currentChar = word.charAt(i);
                char otherChar = word.charAt(word.length() - i - 1);
                if (currentChar != otherChar) {
                    isPalindrome = false;
                    break;
                }
            }
            if (isPalindrome) {
                System.out.printf("Słowo %s jest palindromem.", word);
            } else {
                System.out.printf("Słowo %s nie jest palindromem.", word);
            }
        }
    }
}