package org.example.Task_Chat.Day2;

public class LoopForStars {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < i + 1; j++) {

                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = 5; i > 0; i--) {
            for (int j = 0; j < i -1; j++) {

                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = 1; i < 21; i++) {
            System.out.print(i + " ");
            System.out.print(i*i);
            System.out.println();
        }

    }
}
