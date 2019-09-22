package blok1.weekend3.Zadania2;

import java.util.Scanner;

public class Zadanie11 {
    private static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Wprowadź liczbę ");
        int liczba = scan.nextInt();

        for (int i = 2; i < liczba; i++) {
            if (liczba % i != 0) {
                System.out.print("Liczba jest liczbą pierwszą");
            }
        }
    }
}