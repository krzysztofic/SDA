package blok1.weekend3.Zadania1;

//zadanie 4 z jkozak.zadania.1

import java.util.Scanner;

public class IncomeTax {

    private static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {




        System.out.println("Wprowadz dochód za rok 2018: ");
        float income = scan.nextFloat();

        if (income <= 3091){
            System.out.println("Brak podatku");
        }else if (income >3091 && income <= 85528){
            float tax = (float) ((income * 0.18) - 556.02);
            System.out.println("Podatek do zapłaty to " + tax);
        }else if (income > 85528){
            float tax = (float) (14839.02 + ((income - 85528) * 0.32));
            System.out.println("Podatek do zapłaty to " + tax);
        }
    }
}
