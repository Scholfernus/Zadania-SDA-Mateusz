package org.example.Task_Chat;

import java.util.Arrays;
import java.util.Random;

public class FindMinAndMaxNumber {
    public static void main(String[] args) {
        Random random = new Random();
        int []minmax = new int[10];
        for (int i = 0; i < minmax.length; i++) {
            minmax[i] = random.nextInt(100);
        }
        System.out.println(Arrays.toString(minmax));
        Arrays.sort(minmax);
        System.out.println("The minimum number of array is -> " + minmax[0] +
                " the maximum value of the array is -> " + minmax[minmax.length-1]);
    }
}
