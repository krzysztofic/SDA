package blok1.weekend3.OOP.Figury;

public class Kolo {


    private double promien;

    public Kolo(double promien){
        this.promien = promien;
    }

    public double ObliczPole(){
        return (Math.PI * Math.pow(promien,2));
    }

    public double ObliczObwod(){
        return 2*Math.PI*promien;
    }

}
