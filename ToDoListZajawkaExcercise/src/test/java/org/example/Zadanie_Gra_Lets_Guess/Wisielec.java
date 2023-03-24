package org.example.Zadanie_Gra_Lets_Guess;

import java.util.Arrays;

public class Wisielec {
    public static void main(String[] args) {
        System.out.println("     I");
        System.out.println("      I");
        System.out.println("     /I");
        System.out.println("    / I");
        System.out.println("      I");
        System.out.println("     /I");
        System.out.println("    / I");
        System.out.println("__________________");
        System.out.println(" ");
        int[] myArray = new int[10];
        Arrays.fill(myArray, 22); // fills the array with zeros
        System.out.println(Arrays.toString(myArray));
        Arrays.fill(myArray,3,6,100);
        System.out.println(Arrays.toString(myArray));

    }
}
