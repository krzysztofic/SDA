package blok1.weekend3.Petle;

//Zadanie 6 z listy 2

import java.sql.SQLOutput;
import java.util.Random;
import java.util.Scanner;

public class Zadanie6 {

    private static Random rand = new Random();
    private static Scanner scan = new Scanner(System.in);

    public static void main(String[] args){

        int randomNumber = rand.nextInt(100)+1;
        System.out.println("Try to guess the number: ");

        int userNumber = -1;

        while(userNumber != randomNumber){

            userNumber = scan.nextInt();
            if(userNumber > randomNumber){
                System.out.println("Too much..");
            }else if(userNumber < randomNumber){
                System.out.println("Too less");
            }
        }

        System.out.println("U win!");
    }
}
