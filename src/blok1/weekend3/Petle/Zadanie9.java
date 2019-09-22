package blok1.weekend3.Petle;

import java.util.Scanner;

public class Zadanie9 {

    private static Scanner scan = new Scanner(System.in);

    public static void main(String[] args){

        System.out.println("Insert a two digits number: ");
        int x = scan.nextInt();


        int wynik = 0;

        while (x != 0) {
            wynik += x%10;
            x /= 10;
        }

        System.out.println("suma cyfr podanej liczby wynosi " + wynik);

    }
}