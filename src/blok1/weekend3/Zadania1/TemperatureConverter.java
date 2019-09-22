package blok1.weekend3.Zadania1;

//zadanie 1 z jkozak.zadania.1

import java.util.Scanner;

public class TemperatureConverter {

    public static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Choose conversion type \n" +
                "Celsius to Fahrenheit <insert 1> \n" +
                "Fahrenheit to Celsius <insert 2>");
        int UserChoice = scan.nextInt();

        if (UserChoice ==1){
            ConvertToFahrenheit();
        }else if(UserChoice ==2){
            ConvertToCelsius();
        }else {
            System.out.println("Wrong choice. Try again. Bye!");
        }

    }

    public static void ConvertToFahrenheit(){


        System.out.println("Insert Celsius degrees: ");
        float cel = scan.nextFloat();
        float far = (float) (1.8 * cel + 32.0);
        System.out.println(cel + " *C to " + far + " *F");
    }

    public static void ConvertToCelsius(){
        System.out.println("Insert Fahrenheit degrees: ");
        float cel = scan.nextFloat();
        float far = (cel - 32) * 5 /9;
        System.out.println(far + " *F to " + cel + " *C");
    }

}
