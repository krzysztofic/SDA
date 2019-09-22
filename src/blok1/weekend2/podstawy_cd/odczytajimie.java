package blok1.weekend2.podstawy_cd;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class odczytajimie {
    public static void main(String[] args) throws FileNotFoundException {

        File plik = new File("imie.txt");

        PrintWriter printWriter = new PrintWriter(plik);

        Scanner consoleScan = new Scanner(System.in);
        String name = consoleScan.nextLine();

        printWriter.println(name);
        printWriter.close();

        Scanner fileScan = new Scanner(plik);
        System.out.println(fileScan.nextLine());





    }
}
