package blok1.weekend1;

import java.sql.SQLOutput;

public class IFY {
    public static void main(String[] args) {

        //podstawowe ify i elsy ----------------------------------------------------------------------

        if (2 > 3) {
            System.out.println("2>3 -> ok");
        } else {
            System.out.println("error");
        }
        if (4 < 5) {
            System.out.println("4<5 -> ok");
        } else {
            System.out.println("error");
        }
        if (2 - 2 == 0) {
            System.out.println("2-2==0 -> ok");
        } else {
            System.out.println("error");
        }
        if (true) {
            System.out.println("true");
        } else {
            System.out.println("error");
        }
        if (9 % 2 == 0) {
            System.out.println("9%2==0 -> ok");
        } else {
            System.out.println("error");
        }
        if (9 % 3 == 0) {
            System.out.println("9%3==0 -> ok");
        } else {
            System.out.println("error");
        }

        //switch  ---------------------------------------------------------------------------

        int zmienna = 1;
        switch (zmienna) {
            case 1:
                System.out.println("Działa!(1)");
                break;
            case 2:
                System.out.println("Działa!(2) ");
                break;
            default:
                System.out.println("nie ma takiej zmiennej");
                break;
        }

        int zmienna1 = 4 % 2;
        switch (zmienna1) {
            case 1:
                System.out.println("Działa!(1)");
                break;
            case 0:
                System.out.println("Działa!(0)");
                break;
            default:
                System.out.println("Nie ma takiej opcji");
                break;
        }




    }
}

