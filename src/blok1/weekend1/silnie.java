package blok1.weekend1;

import java.util.Scanner;

public class silnie {
    public static void main(String[] args) {


        ///////////////////////////////////dodawanie kolejnych liczb poprzedzających
/*        System.out.println("Podaj liczbę: ");
        Scanner scan = new Scanner(System.in);
        int liczba = scan.nextInt();
        int answer=0;

        for (int i=0; i<=liczba; i++){
            answer += i;
        }
        System.out.println(answer);*/
        ////////////////////////////////////silnia
/*        System.out.println("Podaj liczbę: ");
        Scanner scan = new Scanner(System.in);
        int liczba = scan.nextInt();
        int answer=1;


        for (int i=1; i<=liczba; i++){
            answer *= i;
        }
        System.out.println(answer);*/
        ////////////////////////////////////na while
        System.out.println("Podaj liczbę: ");
        Scanner scan = new Scanner(System.in);

        int liczba = scan.nextInt();
        int answer =1;
        int i=1;

        while(i <=liczba){
            answer *= i;
            i++;
        }

        System.out.println(answer);


    }
}
