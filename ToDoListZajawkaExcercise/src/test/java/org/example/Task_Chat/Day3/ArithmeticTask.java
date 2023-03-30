package org.example.Task_Chat.Day3;

import java.util.Scanner;

public class ArithmeticTask {
    public static void main(String[] args) {
//        System.out.println("W tym zadaniu będziesz proszony o podawanie liczb całkowitych:");
        System.out.print("Podaj liczbę całkowitą: ");
        Scanner scanner = new Scanner(System.in);
        int nextInt = scanner.nextInt();
        int sum = 0, avg = 0;
        int count = 1;
        while (nextInt != 0) {
            System.out.print("Podaj liczbę całkowitą: ");
            int i = scanner.nextInt();
            sum += i;
            count++;
            avg = sum / count;
            if (i==0){
                System.out.printf("Suma wprowadzonych licz = %d\nŚrednia podanych liczb wynosi = %d \nPodałeś %d liczb", sum, avg, count);
            break;
            }
        }
    }

}

