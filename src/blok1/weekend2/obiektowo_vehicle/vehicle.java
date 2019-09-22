package blok1.weekend2.obiektowo_vehicle;

public class vehicle {
    private int wheelCounter;
    private String color;
    private int speed = 100;

    public vehicle(int wheelCounter, String color, int speed) {
        this.wheelCounter = wheelCounter;
        this.color = color;
        this.speed = speed;
    }

    public vehicle(int wheelCounter, String color) {
        this.wheelCounter = wheelCounter;
        this.color = color;
    }

    @Override
    public String toString() {
       // return super.toString();   //slowo kluczowe do klasy z ktorej dziedziczymy (Object)
       return "Vehicle have "+
               this.wheelCounter+
               " wheels, is " + color + " and can ride " + speed;

    }
}
