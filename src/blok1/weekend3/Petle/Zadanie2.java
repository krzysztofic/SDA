package blok1.weekend3.Petle;

//Zadania2.petle

import java.util.Scanner;
import java.util.stream.IntStream;

public class Zadanie2 {

    private static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Insert first digit: ");
        int digit_1 = scan.nextInt();
        System.out.println("Insert second digit: ");
        int digit_2 = scan.nextInt();
        int sum = 0;

        //the smartest solution
        sum = IntStream.rangeClosed(digit_1,digit_2).sum();
        System.out.println(sum);

        // first case "for"

        int sum_a = 0;
        int i;
        for (i = digit_1; i <=digit_2 ; i++) {
            sum_a = sum_a + i;
        }
        System.out.println(sum_a);


        // second case "while"
        int sum_b = 0;
        int y = digit_1;
        while (y<=digit_2){
            sum_b = sum_b+y;
            y++;
        }
        System.out.println(sum_b);

        // second case "do while"
        int sum_c = 0;
        int z = digit_1;
        do{
            sum_c = sum_c+z;
            z++;
        }while(z <= digit_2);
        System.out.println(sum_c);

    }
}
