package blok2.weekend5.Tablice;

import java.util.Random;

public class Table {

    public static void main(String[] args) {

    //Stwórz tablicę 10 elementową:\n" +
    //"Wypełnioną kolejnymi liczbami 0 - 9:

        int table[] = new int[10];
        int i;

        for (i = 0; i <10 ; i++) {
            table[i]=i;
            System.out.print(+table[i]+" ");
        }
        System.out.println();


        //Co druga liczba zwiększana o poprzednika:

        for (i = 0; i <table.length; i++) {

            table[i]=i;
            if(i%2 !=0){
                table[i]= i+(i-1);
            }
            System.out.print(+table[i]+" ");
        }

        System.out.println();

        //Losowe wartości: (rand.nextInt(to from) + from)

        for (i = 0; i <table.length; i++) {

            Random rand = new Random();

            int j = rand.nextInt(99)+1;
            table[i]=j;

            System.out.print(+table[i]+" ");
        }

        System.out.println();
        //Wszystkie od końca

        for (i = table.length-1; i>=0; i--) {

        table[i]=i;

            System.out.print(table[i]+" ");
        }

        System.out.println();
        //Wszystkie nieparzyste

        for (i = 0; i <table.length ; i++) {
            if(i%2 !=0){
                System.out.print(+table[i]+ " ");
            }
        }


        System.out.println();
        //Sumę wszystkich poprzednich wartości dla każdego elementu
        int sum = 0;

        for (i = 0; i <table.length ; i++) {

            sum += table[i];
                System.out.print(sum+ " ");
        }




    }
}
