package blok2.weekend6;

import java.util.Scanner;

/***
 * Case from sixth weekend.
 * Initialize and declare array of long values. Insert the Fibonacci string to the array and return.
 *
 */

public class Array_Fibonacci {

    private static Scanner scan = new Scanner(System.in);
    private long[] FiboTab;


    private int getSizeOfArray(){
        return scan.nextInt();
    }

    public long[] fibonacciArray() {
        System.out.println("Insert the array size: ");
        FiboTab = new long[getSizeOfArray()];

        FiboTab[0] = 0;
        FiboTab[1] = 1;

        for (int i = 2; i < FiboTab.length; i++) {
            FiboTab[i] = FiboTab[i-1] + FiboTab[i-2];
        }
        return FiboTab;
    }

    public void displayArray(){
        for (int i = 0; i < FiboTab.length; i++) {
            System.out.print(FiboTab[i] + " ");
        }

    }
}
