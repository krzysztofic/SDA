package blok1.weekend3.Zadania2_tydz3;

import java.util.Scanner;

public class Zadanie8 {

    public static void main(String[] args) {

        myFunction();
    }

    private static void myFunction(){

        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();
        for (int i = 2; i < x ; i++) {
            if (x%2==0){
                System.out.println("Liczba nie jest liczba pierwsza");
            }else if(x%i == 0){
                System.out.println("Liczba nie jest liczba pierwsza");
            }else{
                System.out.println("Liczba jest liczba pierwsza");
            }
        }

    }
}
