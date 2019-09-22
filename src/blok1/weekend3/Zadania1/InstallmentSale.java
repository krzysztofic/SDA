package blok1.weekend3.Zadania1;

import java.sql.SQLOutput;
import java.util.Scanner;

public class InstallmentSale {

    private static Scanner scan = new Scanner(System.in);
    private static double interest;


    public static void main(String[] args) {

        System.out.println("Insert price to pay: ");
        float price = scan.nextFloat();
        System.out.println("Insert number of instalments: ");
        float installments = scan.nextFloat();

        float Rate = (price  / installments);
        double monthlyRate = (Rate + (Rate * interest));

        if (installments < 6){
            System.out.println("Something is incorrect. Ask your store service.");
        }else if (installments >=6 && installments <=12){
            interest =  0.025d;
            System.out.println(String.format("Monthly rate is %.2f", monthlyRate));
        }else if (installments >=13 && installments <=24) {
            interest =  0.05d;
            System.out.println(String.format("Monthly rate is %.2f", monthlyRate));
        }else if (installments >=25 && installments <=48) {
            interest =  0.1d;
            System.out.println(String.format("Monthly rate is %.4f", monthlyRate));
        }else{
            System.out.println("Try again.");
        }
    }
}
