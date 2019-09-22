package blok1.weekend3.Zadania2_tydz3;

import java.util.Scanner;

public class Zadanie4 {

    private static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {

        /*System.out.println("Draw your line: (with spaces) ");
        String line = scan.nextLine();

        char[] chars = line.toCharArray();
        int i = 0;
        while(i <= chars.length-1){
           i++;
        }
        System.out.println("Number of singns in your line is: "+i);
*/
        System.out.println("Draw your line: (without spaces) ");
        String line1 = scan.nextLine();

        int i=0;
        char[] chars = line1.toCharArray();

         while(i <=chars.length-1 ) {
             i++;
        }

        for (int j = 0; j <=chars.length-1 ; j++) {
            if(chars[j]== ' '){
                i--;
            }
        }
        System.out.println("Number of singns in your line is: "+i);


    }
}
