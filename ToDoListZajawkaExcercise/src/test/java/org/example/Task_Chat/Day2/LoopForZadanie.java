package org.example.Task_Chat.Day2;

import java.util.Arrays;
import java.util.Scanner;

public class LoopForZadanie {
    public static void main(String[] args) {
        System.out.println("Podaj liczbę całkowitą większą od zera:");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        if (n <= 0) {
            System.out.println("Podana liczba nie jest większa od zera!");
        } else {
            for (int i = 1; i < n; i++) {
                System.out.print(i * i);
                System.out.println();
            }
        }
        System.out.println("Podaj ciąg liczb całkowitych oddzielonych przecinkami:");
        String input = scanner.nextLine();
        String[] numbersAsString = input.split(",");
        int[] numbers = new int[numbersAsString.length];
        int sum = 0;
        for (int i = 0; i < numbersAsString.length; i++) {
            try {
                numbers[i] = Integer.parseInt(numbersAsString[i].trim());
                sum += numbers[i];
            } catch (NumberFormatException e) {
                System.out.println(numbersAsString[i] + " nie jest liczbą całkowitą.");
            }
        }
        System.out.println("Liczby: " + Arrays.toString(numbers));
        System.out.println("Suma: " + sum);
    }
}
