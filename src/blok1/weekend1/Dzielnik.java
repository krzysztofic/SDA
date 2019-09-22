package blok1.weekend1;

import java.util.Scanner;


//Napisz program, który przyjmuje od użytkownika dzielnik oraz liczbę,
//a następnie drukuje na ekranie wszystkie liczby mniejsze od zadanej
// liczby podzielne przez zadany dzielnik.

public class Dzielnik {
    public static void main(String[] args) {

/*
        System.out.println("Podaj liczbę: ");
        Scanner scan = new Scanner(System.in);
        double dividend = scan.nextDouble();

        System.out.println("Podaj dzielnik: ");
        Scanner scan1 = new Scanner(System.in);
        double divider = scan1.nextDouble();

        for (int i= (int)dividend-1; i>=0; i--){
            if (i % divider ==0){
                System.out.println(i);
            }
        }
*/

//Napisz program wyznaczający potęgę liczby n i m –obie zadane przez użytkownika
// i drukujący w czytelny sposób wynik na ekranie konsoli.

        System.out.println("Podaj liczbę: ");
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        int m = scan.nextInt();
        int result = n;

        for(int i=1; i <m; i++){
            result *= n;
        }

        System.out.println("Wynik n^m to: "+ result);
    }
}
