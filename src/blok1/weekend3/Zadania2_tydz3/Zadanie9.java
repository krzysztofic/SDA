package blok1.weekend3.Zadania2_tydz3;

import java.util.Scanner;

public class Zadanie9 {

    private static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {

        triangleBuilder();
    }

    public static void triangleBuilder(){

        System.out.println("Insert length of segmenta a b and c: ");
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();

        int max = a;
        if(b>a){
            max=b;
        }
        if(c>b){
            max=c;
        }

        if((a+b>c) || (a+c>b) || (c+b>a)){
            //oblicz pole

            double p = 0.5*(a+b+c);
            double P = Math.sqrt(p*(p-a)*(p-b)*(p-c));

            System.out.println("Pole trójkąta wynosi: "+ P +" cm.");
        }else{
            System.out.println("Nie można zbudować trójkąta.");
        }
    }


}
