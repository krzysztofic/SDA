package blok1.weekend3.Petle;

import java.util.Scanner;

public class Zadanie5 {

    private static Scanner scan = new Scanner(System.in);

    public static void main(String[] args){
        int digit;
        int sum =0;
        int i = 0;

        System.out.println("Give me numbers. Program stops When u give 0");
        digit = scan.nextInt();


        int min = digit;
        int max = digit;

        while (digit != 0){
            System.out.println("Insert a digit until 0: ");
            digit = scan.nextInt();
            sum +=digit;
            i++;

            if (digit> max) {
                max = digit;
            }
            if (digit< min){
                min =digit;
            }
        }

        System.out.println("Sum is: "+sum);
        System.out.println("Min digit is: "+min);
        System.out.println("Max digit is: "+max);

        int mySum = min + max;
        System.out.println("Sum max & min is: "+mySum);

        double avarage = (double) sum/i;
        System.out.println("Avarage digit is: "+avarage);



    }
}
