package blok1.weekend3.Zadania1;

//zadanie 3 z jkozak.zadania.1

import java.util.Scanner;

public class BMI {

    private static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Wprowadz swoją wagę: ");
        float userweight = scan.nextFloat();
        System.out.println("Wprowadz swój wzrost: ");
        float usergrowth = scan.nextFloat();
        float bmi = userweight / (float) Math.pow(usergrowth, 2);

        System.out.println(String.format("Twoje BMI to: %.2f", bmi));

        if (bmi < 18.5) {
            System.out.println("Niedowaga");
        } else if (bmi >= 18.5 && bmi < 24.5) {
            System.out.println("Waga ok");
        } else if (bmi >= 24.5 && bmi < 27) {
            System.out.println("Nadwaga");
        } else if (bmi >= 27 && bmi < 29) {
            System.out.println("Otylosc I stopnia");
        }

    }
}
