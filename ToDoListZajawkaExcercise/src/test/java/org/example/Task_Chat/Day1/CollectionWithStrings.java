package org.example.Task_Chat.Day1;

import java.util.ArrayList;
import java.util.Scanner;

public class CollectionWithStrings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give a sentence:");
        String sentence = scanner.nextLine();
        String[] wordsArray = sentence.split(" ");
        ArrayList<String> words = new ArrayList<>();
        for (String word : wordsArray) {
            words.add(word);
        }
        for (int i = words.size()-1; i > -1; i--) {
            System.out.print(words.get(i) + " ");
        }
    }
}
