package blok1.weekend2.podstawy_cd;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class odczyt {
    public static void main(String[] args) throws FileNotFoundException {

        File plik = new File("ala.txt");

        Scanner odczyt = new Scanner(plik);
        System.out.println(odczyt.nextLine());

    }
}
