package blok1.weekend3.Zadania2_tydz3;

import java.util.Scanner;

public class Zadanie8_wstep {

    private static Scanner scan = new Scanner(System.in);

    public static void main(String[]args){

        firstFunction();
        secondFunction();
        thirdFunction();
    }

    private static void firstFunction(){

        for (int i = 1; i <=500 ; i++) {
            if(i%5 ==0) {
                System.out.print(i + " ");
            }
        }
    }

    private static void secondFunction(){

        System.out.println("Insert min and max: ");
        int m = scan.nextInt();
        int n = scan.nextInt();

        for (int i = m; i <=n ; i++) {
            if(i%5 ==0) {
                System.out.print(i + " ");
            }
        }
    }

    private static int thirdFunction(){
        System.out.println("Insert 2 digits: ");
        int x = scan.nextInt();
        int y = scan.nextInt();
        return x+y;


    }

}
