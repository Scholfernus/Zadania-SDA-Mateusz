package org.example.Task_Chat.Day1;

import java.util.Scanner;

public class FindSumAndAvarege {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Type 5 numbers from 0 to 10");
        int sum = 0;
        double avg;

        int[] tab = new int[5];
        for (int i = 0; i < tab.length; i++) {
            tab[i] = scanner.nextInt();
            sum += tab[i];
        }

        avg = (double) sum / 5;
        System.out.println("Sum of array is : " + sum + " and average is: " + avg);
    }
}
