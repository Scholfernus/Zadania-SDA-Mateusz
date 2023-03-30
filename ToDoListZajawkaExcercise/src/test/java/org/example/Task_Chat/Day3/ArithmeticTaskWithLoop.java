package org.example.Task_Chat.Day3;

import java.util.Scanner;

public class ArithmeticTaskWithLoop {
    public static void main(String[] args) {
        System.out.println("W tym zadaniu będziesz proszony o podawanie liczb całkowitych:");
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int count = 0;
        int nextInt;
        do {
            System.out.print("Podaj liczbę całkowitą: ");
            nextInt = scanner.nextInt();
            sum += nextInt;
            count++;
        } while (nextInt != 0);
        count--;
        double avg = count == 0 ? 0 :(double) sum / (double) count;
        System.out.printf("Suma wprowadzonych liczb = %d\nŚrednia podanych liczb wynosi = %d \nPodałeś %d liczb", sum, avg, count);
    }
}
