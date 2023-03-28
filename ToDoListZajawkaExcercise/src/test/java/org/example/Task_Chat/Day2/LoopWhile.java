package org.example.Task_Chat.Day2;

import java.util.Scanner;

public class LoopWhile {
    public static void main(String[] args) {
        int counter = 0;
        int sum = 0;
        while (sum < 100) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Podaj liczbę całkowitą: ");
            int number = scanner.nextInt();
            counter++;
            sum += number;
        }
        System.out.printf("Użytkownik podał %d liczb, a ich suma wynosi: %d ", counter, sum);
    }
}
