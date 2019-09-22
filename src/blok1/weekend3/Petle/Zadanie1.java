package blok1.weekend3.Petle;

//Zadania2.petle

import java.util.Scanner;

public class Zadanie1 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int liczba = scan.nextInt();

        for (int i = 0; i <=liczba ; i++) {
            if(i%2>0){
                System.out.println(i+ " ");
            }
        }
    }
}
