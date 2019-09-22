package blok1.weekend3.Petle;

import java.util.Scanner;

public class Zadanie8 {

    private static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Insert height x (x must be > 0): ");
        int x  = scan.nextInt();
        String y = "*";
        int n=0;


        if (x<=0){
            System.out.println("x must be > 0");
            System.exit(0);
        }

//i = kolejne pietro
//j = ile ma byc gwiazdek
//k = jakie ma byc wciecie



        for (int i = 1; i <= x ; i++) {

            for (int k = i; k <=x ; k++) {
                System.out.print(" ");
            }

            for (int j = 1; j <= i+n ; j++) {
                System.out.print(y);

            }
            n++;
            System.out.print("\n");
        }

    }

}



