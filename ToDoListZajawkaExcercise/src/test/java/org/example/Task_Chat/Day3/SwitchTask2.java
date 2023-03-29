package org.example.Task_Chat.Day3;

import java.util.Scanner;

public class SwitchTask2 {
    public static void main(String[] args) {
        int wynik = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj pierwszą liczbę: ");
        int one = scanner.nextInt();
        System.out.println("Podaj drugą liczbę: ");
        int two = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Podaj operator + - * / ");
        String operator = scanner.nextLine();
        switch (operator){
            case "+":
                wynik = one + two;
                System.out.printf("Suma liczby %d i liczby %d wynosi -> %d",one,two,wynik);
                break;
            case "-":
                wynik = one - two;
                System.out.printf("Różnica liczby %d i liczby %d wynosi -> %d",one,two,wynik);
                break;
            case "*":
                wynik = one * two;
                System.out.printf("Iloraz liczby %d i liczby %d wynosi -> %d",one,two,wynik);
                break;
            case "/":
                wynik = one / two;
                System.out.printf("Iloczyn liczby %d i liczby %d wynosi -> %d",one,two,wynik);
                break;
            default:
                System.out.println("Podałeś niepoprawny znak");
                break;
        }
    }
}
