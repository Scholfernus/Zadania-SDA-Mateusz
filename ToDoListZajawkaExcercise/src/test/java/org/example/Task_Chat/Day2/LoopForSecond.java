package org.example.Task_Chat.Day2;

import java.util.Scanner;

public class LoopForSecond {
    public static void main(String[] args) {
        int sum = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj długość pętli:");
        int loop = scanner.nextInt();
        if (loop > 0) {
            for (int i = 1; i <= loop; i++) {
                sum += i;
                if (i == loop) {
                    System.out.print(i + " = " + sum);
                } else {
                    System.out.print(i + " + ");
                }
            }
        }else {
            System.out.println("Podana wartość jest mniejsza lub równa zero!");
        }
    }
}
