package org.example.Task_Chat.Day2;

public class LoopFor {
    public static void main(String[] args) {
        for (int i = 0; i < 21; i++) {
            if (i % 2 != 0)
                System.out.print(i + " ");
        }
        System.out.println();
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0 && i%5==0) {
                System.out.println("FizzBuzz");
            } else if (i % 3 == 0) {
                System.out.println("Fizz");
            } else if (i % 5 == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println(i);
            }
        }
    }
}
