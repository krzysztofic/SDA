package blok1.weekend3.OOP.Figury;

public class ProgramProstokat {

    public static void main(String[] args) {

        // czyt:
        // duzyProstokat jest obiektem typu Prostkat  lub
        // duzyProstokat jest instancją typu Prostokąt
        Prostokat duzyProstokat = new Prostokat();

        //kontruktor z parametrami 4 i 5 (wielkosc bokow prostokąta)
        Prostokat wiekszyProstokat = new Prostokat(4,5);
        Prostokat malyProstokat = new Prostokat(2,3);

        double obwod = wiekszyProstokat.obliczObwod();
        System.out.println(obwod);

        System.out.println("DUŻY");
        System.out.println(wiekszyProstokat.obliczObwod());
        System.out.println(wiekszyProstokat.obliczPole());

        System.out.println("MAlY");
        System.out.println(malyProstokat.obliczObwod());
        System.out.println(malyProstokat.obliczPole());


        Kwadrat k = new Kwadrat(4);
        k.ObliczPole();
        k.ObliczObwod();

        Kwadrat mojKwadrat = new Kwadrat(6);
        mojKwadrat.ObliczObwod();
        mojKwadrat.ObliczPole();

        Kolo kol = new Kolo(6);
        kol.ObliczObwod();
        kol.ObliczPole();



    }
}
