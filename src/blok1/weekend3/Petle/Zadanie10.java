package blok1.weekend3.Petle;

import java.util.Scanner;

public class Zadanie10 {

    private static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Insert a number ");
        int x = scan.nextInt();

        for (int i = 1; i <=x ; i++) {
            if (x%i == 0 ){
                System.out.print(i+" ");
            }
        }


    }
}
