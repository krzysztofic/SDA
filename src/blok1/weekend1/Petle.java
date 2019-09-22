package blok1.weekend1;

import java.util.Scanner;

public class Petle {
    public static void main(String[] args) {

/*        System.out.println("Podaj liczbe całkowitą: ");
        Scanner scan = new Scanner(System.in);

        int scannerToExplode = scan.nextInt();
        int i = scannerToExplode;  //w while iniclalizacja zmiennej przed petla
        while ( i >= 0) {

            if (i != 0) {
                System.out.println("Bomba wybuchnie za: " + i);
            } else {
                System.out.println("BOOOOOM!");
            }
            i--;
        }*/
        /////////////////////////////////////////////////przeróbka na do while
        System.out.println("Podaj liczbe całkowitą: ");
        Scanner scan = new Scanner(System.in);



        int scannerToExplode = scan.nextInt();

        do {
            System.out.println(scannerToExplode);
            scannerToExplode--;
        }while (scannerToExplode> 0);
             System.out.println("BOOOOOM!");

    }
}
