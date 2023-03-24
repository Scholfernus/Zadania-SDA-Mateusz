package org.example.Zadanie_Gra_Lets_Guess;

import java.util.Arrays;
import java.util.Scanner;

public class Wisielec_Klaudyna {
    Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        String[] tab = {"pies", "kot", "bocian", "krowa", "chomik"};
        // random();
        String one = tab[random()];
        System.out.println(one);
        int max = 10;
        int error = 0;
        char[] arr = one.toCharArray();
        char[] arrTwo = new char[arr.length];
        System.out.println("To jest gra wisielec :)");
        System.out.println("Zgadnij wylosowane słowo");
        fill(arrTwo);
//        print(arrTwo);
    }

    public static int random() {
        int random = (int) (Math.random() * 5);

        return random;
    }
    public static void fill(char[] cha) {
        for (int i = 0; i < cha.length; i++) {
            cha[i] = '_';
            System.out.print(cha[i] + " ");
        }
    }
//    public static void print(char[] cha) {
//       {
//           for (int i = 0; i < cha.length; i++) {
//               System.out.print(cha[i]+" ");
//           }
//            System.out.print("\n"+ Arrays.toString(cha));
//        }
//    }
}
