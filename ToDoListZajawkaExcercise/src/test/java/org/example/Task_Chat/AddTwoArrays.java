package org.example.Task_Chat;

import java.util.Arrays;
import java.util.Scanner;

public class AddTwoArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers1 = new int[5];
        int[] numbers2 = new int[5];
        int[] sumNumbers = new int[5];
        System.out.println("Type 5 numbers from 0 to 10 press Enter");
        for (int i = 0; i < numbers1.length; i++) {
            numbers1[i] = scanner.nextInt();
        }
        System.out.println("Type 5 numbers from 0 to 10 press Enter");
        for (int i = 0; i < numbers2.length; i++) {
            numbers2[i] = scanner.nextInt();
        }
        for (int i = 0; i < numbers1.length; i++) {

            sumNumbers[i] = numbers1[i] + numbers2[i];
        }
        System.out.println(Arrays.toString(sumNumbers));
    }

}
