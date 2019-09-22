package blok1.weekend3.Petle;

import java.util.Scanner;

public class Zadanie4 {

    private static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {

        int digit;
        int sum = 0;
        do {
            System.out.println("Insert a digit until 0: ");
            digit = scan.nextInt();
            sum += digit;
        } while (digit != 0);
        System.out.println("Thank u!\n" +
                "Sum of your digits is: "+ sum);


    }
}
