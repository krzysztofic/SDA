package blok1.weekend1;

import static java.lang.Math.*;

public class ZadaniaMath {
    public static void main(String[] args){

        double liczba = 9.0;
        int b = 3;
        double pierwiastek = sqrt(liczba);
        double potega = Math.pow(liczba,b);
        double potega2 = Math.pow(b,liczba);

        System.out.println("Pierwiastek z "+liczba+" wynosi: "+pierwiastek);
        System.out.println("Liczba "+liczba+" podniesiona do potęgi "+b+" to "+potega);
        System.out.println("Liczba "+b+" podniesiona do potęgi "+liczba+" to "+potega2);

    }
}
