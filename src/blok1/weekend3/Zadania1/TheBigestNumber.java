package blok1.weekend3.Zadania1;

//zadanie 2 z jkozak.zadania.1

import java.util.Scanner;

public class TheBigestNumber {

    private static Scanner scan = new Scanner(System.in);

    public static int FindMax(int a, int b, int c){
        if(a>b && a>c){
            return a;
        }else if(b>a && b>c){
            return b;
        }else{
            return c;
        }
    }

    public static int FindMin(int a, int b, int c) {
        if (a < b && a < c) {
            return a;
        } else if (b < a && b < c) {
            return b;
        } else {
            return c;
        }
    }


    public static void main(String[] args) {

        System.out.println("Insert 3 digits: ");

            int a = scan.nextInt();
            int b = scan.nextInt();
            int c = scan.nextInt();

            int max = FindMax(a,b,c);
            System.out.println("Największa liczba to: "+max);
            int min = FindMin(a,b,c);
            System.out.println("Najmniejsza liczba to: "+min);
    }


}
