package org.example.Zadanie_Gra_Guess_Your_Number;

import java.util.Random;
import java.util.Scanner;

public class Patryk_Example {
    public static void main(String[] args) {
        //Witamy i pytamy gracza ile liczb chciałby zgadywać:
        System.out.println("Welcome to Master Mind. How many numbers?");

        //inicjujemy skaner przy pomocy, którego będziemy wczytywać liczby od użytkownika:
        Scanner scanner = new Scanner(System.in);
        //deklarujemy zmienną count, którą wpisze użytkownik z klawiatury komputera:
        int count = scanner.nextInt();

        // inicjujemy 3 tablice, które przyjmują "długość" count:
        // tablica "randomNumbers rozmiaru count będzie generować losowo cyfry:
        int[] randomNumbers = new int[count];
        // tablica rozmiaru count będzie pobierać wpisane liczby od gracza:
        int[] givenNumbers = new int[count];
        // tablica "results" będzie porównywać 2 wyniki
        String[] results = new String[count];

        // tworzymy tablicę "randomNumbers rozmiaru count, która będzie generować losowo cyfry:

        for (int i = 0; i < randomNumbers.length; i++) {
            randomNumbers[i] = i;
        }
        //Sprawdzamy czy wygenerowane cyfry nie powtarzają się
        Random random = new Random();
        int randomIndex;
        int randomValue;

        for (int i = 0; i < count; i++) {
            randomIndex = random.nextInt(randomNumbers.length);
            randomValue = randomNumbers[randomIndex];
            randomNumbers[randomIndex] = randomNumbers[i];
            randomNumbers[i] = randomValue;
        }
        //Tworzymy pętle "do while", która pobiera od użytkownika cyfry (gracz ma za zadanie odgadnąć zbiór liczb):
        do {
            System.out.println("Give your numbers in line:"); //todo przerobić na while
            for (int i = 0; i < count; i++) {
                givenNumbers[i] = scanner.nextInt();
            }
            // porównujemy pobrane cyfry z cyframi tablicy randomNumbers: wykorzystujemy  metodę checkNumber
            for (int i = 0; i < count; i++) {
                results[i] = checkNumber(i, givenNumbers[i], randomNumbers);
            }
            // drukujemy wyniki
            System.out.print("Your result: ");
            for (int i = 0; i < count; i++) {
                System.out.print(results[i] + " ");
            }
            System.out.println();
        } while (!isEnd(results));
    }

    // funkcja sprawdza i porównuje wpisane cyfry od gracza z wylosowanymi i drukuje wynik HOT, WARM, COLD:
    private static String checkNumber(int index, int given, int[] random) {
        for (int i = 0; i < random.length; i++) {
            if (given == random[i]) {
                if (i == index) {
                    return "HOT";
                } else {
                    return "WARM"; //jeśli jest dobry indeks
                }
            }
        }

        return "COLD"; //jeśli nic się nie zgadza
    }

    // metoda sprawdza czy wszystkie otrzymane wyniki są wartościami "HOT" i kończy program (Grę).
    private static boolean isEnd(String[] results) {
        for (String result : results) {
            if (!result.equals("HOT")) { //warunek boolean
                return false;
            }
        }

        return true;
    }
}
