package blok1.weekend3.OOP.Figury;

public class Prostokat {

    //pola w klasie
    private double  bokA;
    private double  bokB;

    //kontruktor domyślny, bezparametrowy
    public Prostokat(){
        System.out.println("Tworze nowy obiekt...");
    }

    public Prostokat(double bokA, double bokB){

        //czesto przez konwencje nazywamy parametry kontruktora tak samo jak pola
        //dlatego aby uniknać niejednoznacnzości stosujemy słówko kluczowe THIS.
        this.bokA = bokA;
        this.bokB = bokB;

       // jezeli parametry nazywaja sie inaczejn iz pola to nie musimy stosować słówka THIS.
        System.out.println("Tworze prostokąt o wymiarach: "+ bokA+"i "+bokB);

    }

//metody


    //metoda obliczania obwodu prostokąta
    public double obliczObwod(){

        return 2 * bokA + 2* bokB;
    }
    //metoda obliczania pola prostokąta
    public double obliczPole(){

        return bokA * bokB;
    }





}
