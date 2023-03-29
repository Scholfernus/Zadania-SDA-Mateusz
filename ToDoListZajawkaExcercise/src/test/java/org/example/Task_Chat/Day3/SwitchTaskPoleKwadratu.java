package org.example.Task_Chat.Day3;

import java.util.Scanner;

public class SwitchTaskPoleKwadratu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj długość boku: ");
        int bok = scanner.nextInt();
        System.out.println("Co chcesz obliczyć? Wciśnij -p- dla pola oraz -o- dla obwodu: ");
        scanner.nextLine();
        String operator = scanner.nextLine().toLowerCase();
        int poleKwadratu, obwodKwadratu;
        switch (operator) {
            case "p":
                poleKwadratu = bok * bok;
                System.out.printf("Pole kwadratu o długości boku %d wynosi %d cm2: ", bok, poleKwadratu);
                break;
            case "o":
                obwodKwadratu = bok * 4;
                System.out.printf("Obwód kwadratu o długości boku %d wynosi %d cm: ", bok, obwodKwadratu);
            default:
                System.out.println("Podano nieprawidłową wartość. Program zostanie zakończony ");
        }
    }
}
