package blok1.weekend3.Petle;

import java.util.Scanner;

public class Zadanie7 {

    private static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Give me some information: \n" +
                "Where do we start (insert left/up corner\n" +
                "How big the rectangle will be (insert width ang height\n" +
                "Finally give me your sign");

        int x = scan.nextInt();
        int y = scan.nextInt();
        int a = scan.nextInt();
        int b = scan.nextInt();
        char z = scan.next().charAt(0);

        // starting point

        for (int j = 1; j <= y; j++) {
            System.out.print(">\n");
        }
        for (int t = 1; t <=a ; t++) {

            System.out.print("> ");
            for (int i = 1; i < x; i++) {
                System.out.print("_");
            }
            for (int c = 1; c <= b; c++) {
                System.out.print(z);
            }
            System.out.print("\n");
        }

    }
}
