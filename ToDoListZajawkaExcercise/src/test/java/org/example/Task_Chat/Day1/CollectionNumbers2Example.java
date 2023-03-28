package org.example.Task_Chat.Day1;

import java.util.*;

public class CollectionNumbers2Example {
    public static void main(String[] args) {
        Random random = new Random();
        ArrayList<Integer> randomNumbers = new ArrayList<>();
        System.out.println("Random numbers will fill the Collection");
        int end = 50;
        int sum = 0;
        double avg;
        int randomInput = random.nextInt(100);
        while (randomInput != end) {
            randomNumbers.add(randomInput);
            randomInput = random.nextInt(100);
        }
        for (var s : randomNumbers
        ) {
            sum += s;
        }
            int min = Collections.min(randomNumbers);
            int max = Collections.max(randomNumbers);
            avg = (double) sum / randomNumbers.size();
            System.out.println("List: " + randomNumbers);
            System.out.println("Minimum: " + min);
            System.out.println("Maximum: " + max);
            System.out.println("Sum of the numbers: " + sum);
            System.out.println("Average of the numbers: " + avg);
    }
}
