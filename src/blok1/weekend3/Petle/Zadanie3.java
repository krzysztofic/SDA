package blok1.weekend3.Petle;

import java.util.Scanner;

public class Zadanie3 {

    private static Scanner scan = new Scanner(System.in);

    public static void main(String[] args){

        System.out.println("Insert digit: ");
        int digit = scan.nextInt();

        int i;
        for(i = 0; Math.pow(i, 2) < digit; i++) {
            System.out.println(Math.pow(i, 2));
        }

    }
}

