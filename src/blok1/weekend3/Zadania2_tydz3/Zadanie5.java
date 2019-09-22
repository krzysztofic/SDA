package blok1.weekend3.Zadania2_tydz3;


//Napisz program, który za pomocą instrukcji do ... while sumuje
//liczby nieparzyste w przedziale od 1 do 100.

public class Zadanie5 {

    public static void main(String[] args) {

        int i =0;
        int sum =0;

        do{
            i++;
            if( i%2 !=0){
                sum += i;
            }

        }while(i <= 100);
        System.out.print(sum);
    }
}
