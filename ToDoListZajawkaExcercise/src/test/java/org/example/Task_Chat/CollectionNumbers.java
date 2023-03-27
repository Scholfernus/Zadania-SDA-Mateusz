package org.example.Task_Chat;

import java.lang.reflect.Array;
import java.util.*;

public class CollectionNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> userNumbers = new ArrayList<>();
        System.out.println("Give any numbers from 0 to 100, if you type number -1, it means, that's the end of Collection");
        int end = -1;
        int sum = 0;
        double avg;
        int userInput = scanner.nextInt();
        while (userInput != end) {
            userNumbers.add(userInput);
            userInput = scanner.nextInt();
        }
        for (var s : userNumbers
        ) {
            sum += s;
        }

        if (userNumbers.size() > 0) {
            int min = userNumbers.get(0);
            int max = userNumbers.get(0);
            for (int number : userNumbers) {
                if (number < min) {
                    min = number;
                }
                if (number > max) {
                    max = number;
                }
            }
            avg = (double) sum / userNumbers.size();
            System.out.println("List: " + userNumbers);
            System.out.println("Minimum: " + min);
            System.out.println("Maximum: " + max);
            System.out.println("Sum of the numbers: " + sum);
            System.out.println("Average of the numbers: " + avg);
        }else {
            System.out.println("The list is empty");
        }
    }
}