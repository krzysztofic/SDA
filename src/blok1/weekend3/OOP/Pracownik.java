package blok1.weekend3.OOP;

public class Pracownik {

    //zdefiniuj pola imie, nazwisko, wiek, adres email, pensja
    //zdefiniuj konstruktory przyjmujace
    // - tylko imie nazwisko wiek
    // - imie nazwisko wiek, adres email
    // - przyjmujący wsyzstkie parametry

    private String imie, nazwisko, adres_email;
    private int wiek;
    private double pensja;


    public Pracownik(String imie, String nazwisko, int wiek) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.wiek = wiek;
    }

    public Pracownik(String imie, String nazwisko, String adres_email, int wiek) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.adres_email = adres_email;
        this.wiek = wiek;
    }

    public Pracownik(String imie, String nazwisko, String adres_email, int wiek, double pensja) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.adres_email = adres_email;
        this.wiek = wiek;
        this.pensja = pensja;
    }
}
