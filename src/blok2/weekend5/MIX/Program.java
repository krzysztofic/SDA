package blok2.weekend5.MIX;

import java.util.ArrayList;

public class Program {



    public static void peopleList(){

        Person person_1 = new Person("Artur", "mężczyzna", 15);
        Person person_2 = new Person("Basia", "kobieta", 30);
        Person person_3 = new Person("Paweł", "mężczyzna", 20);
        Person person_4 = new Person("Kasia", "kobieta", 25);
        Person person_5 = new Person("Marcin", "mężczyzna", 101);

        ArrayList<Person> list = new ArrayList();
        list.add(person_1);
        list.add(person_2);
        list.add(person_3);
        list.add(person_4);
        list.add(person_5);

        for (Person i : list) {

            System.out.println(i);

        }



    }


    public static void main(String[] args) {
        peopleList();

    }
}
