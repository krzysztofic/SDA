package blok2.weekend5.Engine;

public class Main {

    public static void main(String[] args) {

        Engine samochod = new Pojazd_1();
        Engine rower = new Pojazd_2();

        samochod.drive(45);
        rower.drive(23);
    }
}
