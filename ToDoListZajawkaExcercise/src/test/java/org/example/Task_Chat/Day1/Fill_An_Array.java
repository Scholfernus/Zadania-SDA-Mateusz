package org.example.Task_Chat.Day1;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class Fill_An_Array {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give 5 numbers");
        int sum = 0;
        int[] array = new int[5];
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
            sum += array[i];
        }
        System.out.println(sum);
    }
}
