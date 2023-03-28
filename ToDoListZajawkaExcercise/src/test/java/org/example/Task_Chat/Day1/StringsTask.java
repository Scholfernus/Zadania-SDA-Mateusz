package org.example.Task_Chat.Day1;

import java.util.Scanner;

public class StringsTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please write any sentence");
        String sentence = scanner.nextLine();
        System.out.println(sentence);

        int sentenceLength = sentence.length();
        System.out.println("Length of the sentence: " + sentence.length());
        boolean sentenceBlank = sentence.isBlank();
        System.out.println("Is the sentence blank? " + sentenceBlank);
        int wordCount = 1;
        for (char c : sentence.toCharArray()) {
            if (c == ' '){
            wordCount++;
            }
        }
        System.out.println("Number of words in the sentence: " + wordCount);
        System.out.println("Please write any sentence");
        String s = scanner.nextLine();
        String[]words = s.split(" ");
        int countWords = words.length;
        System.out.println("Number of words in the second sentence: " + countWords);
    }
}
