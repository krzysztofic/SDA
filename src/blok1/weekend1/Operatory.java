package blok1.weekend1;

public class Operatory {
    public static void main(String[] args) {
        String ja = "Slawek";
        String ty = "Slawek";

        boolean porownanie1 = ja ==ty;
        boolean porownanie2 = ja.equals(ty); //lepsza metoda do porownywania obiektow

        System.out.println(porownanie1);
        System.out.println(porownanie2);

//        -------------------------------------------------------

        //z użyciem przypisywania zmiennych

       int a = 3;
       int b = 4;
       int c = 1;
       int d = 5;
       int e = 2;
       String jeden = "cos";
       String dwa = "cos";


        boolean pierwsze = a ==a && a ==b;
        System.out.println(pierwsze);
        boolean drugi = a != d || a == d;
        System.out.println(drugi);
        boolean trzeci = (e+ b) > (c+a);
        System.out.println(trzeci);
        boolean czwarty = jeden.equals(dwa);
        System.out.println(czwarty);
        boolean piaty = jeden == dwa;
        System.out.println(piaty);

        //prościej
        boolean  porównanie = 3==3 && 3==4;
        System.out.println(porównanie);
        boolean porównanie1 = 3 != 5|| 3 == 5;
        System.out.println(porównanie1);
        boolean porównanie2 = (2+4)>(1+3);
        System.out.println(porównanie2);
        boolean porównanie3 = "cos".equals("cos");
        System.out.println(porównanie3);
        boolean porównanie4 = "cos"=="cos";
        System.out.println(porównanie4);





    }
}
