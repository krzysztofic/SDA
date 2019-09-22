package blok1.weekend3.Zadania2;

/*
Dzień 2 tydzień 3
zadanie 4 z jkozak.zadania.2
*/

import java.util.Scanner;

public class Zadanie4 {

    private static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {

        int suma = 0;
        int liczba = -1;


        while(liczba != 0 ){
            System.out.println("Give me number ");
            liczba = scan.nextInt();
            suma +=liczba;
        }


        System.out.println("Suma wprowadzonych liczb równa sie: " + suma);

    }
}
