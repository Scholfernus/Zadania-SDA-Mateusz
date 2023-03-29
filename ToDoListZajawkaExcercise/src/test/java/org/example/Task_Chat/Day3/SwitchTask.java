package org.example.Task_Chat.Day3;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class SwitchTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj ocenę szkolną od 1 do 6:");
        int note = scanner.nextInt();
        switch (note){
            case 1:
                System.out.println("Ocena niedostaeczna - najgorsza nota");
                break;
            case 2:
                System.out.println("Ocena mierna - słaba nota");
                break;
            case 3:
                System.out.println("Ocena dostaeczna - średnia nota");
            break;
            case 4:
                System.out.println("Ocena dobra - dobra nota");
                break;
            case 5:
                System.out.println("\"Ocena bardzo dobra - super nota\"");
                break;
            case 6:
                System.out.println("Ocena celująca - najlepsza nota");
                break;

            default:
                System.out.println("Podałeś niepoprawną liczbę");
                break;
        }
    }
}
