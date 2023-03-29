package org.example.Task_Chat.Day3;

import java.util.Scanner;

public class ForTask {
    public static void main(String[] args) {
        System.out.println("Podaj liczbę całkowitą: ");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int suma = 0;
        double srednia = 0;
        for (int i = 1; i <= number; i++) {
            suma += i;
            System.out.print(i + " + ");
        }
        srednia = (double) suma/number;
        System.out.println("\nSuma wszystkich liczb z tego przedziału wynosi: " + suma);
        System.out.println("Średnia liczba z tego przediału wynsi: " + srednia);
    }
}
