package blok1.weekend1;

import java.util.Scanner;

public class tablica {
    public static void main(String[] args) {

/*Napisz program, w którym zadeklarujesz i utworzysz pięcioelementową tablicę odpowiedniego typu.
 W pętli pobierzesz od użytkownika 5 imion i je w niej zapiszesz. Następnie wyświetl na ekranie powiadomienia
 "Witaj imie_z_tablicy" dla każdego z podanych parametrów.*/

/*        Scanner scan = new Scanner(System.in);
        String[] names = new String[5];

        for(int i=0; i<names.length;i++){
           names [i]= scan.nextLine();
        }
        for(int i=0; i<names.length;i++) {
            System.out.println("Witaj "+names[i]);
        }*/

///////////////////////////////////////////////////////////////////////
/*Utwórz tablicę typu intprzechowującą n elementów -gdzie n jest parametrem pobieranym
od użytkownika. Następnie wypełnij ją liczbami od 1 do n i wyświetl zawartość na
ekranie przy pomocy pętli while.*/

//1
        int[] numbers = new int[]{1,3,5,10};
//2
        System.out.println("0: "+ numbers[0]);
        System.out.println("1: "+ numbers[1]);
        System.out.println("2: "+ numbers[2]);
        System.out.println("3: "+ numbers[3]);

//3
        for(int i =0; i<numbers.length; i++) {
            System.out.println(numbers[i]);
        }
//4 parzyste

        System.out.println();
        for(int i =0; i<numbers.length; i++) {
            if (numbers[i] % 2 == 0) {
                System.out.println(i+ ": "+numbers[i]);
            }
        }
//5 odwrotnosc
        System.out.println();
        for (int i=numbers.length-1; i>=0; i--){
            System.out.println(i+ ": " +  numbers[i]);
        }

    }
}
