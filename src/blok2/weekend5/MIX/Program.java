package blok2.weekend5.MIX;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Program {

    public static void main(String[] args) {

        IPersonService personService = new PersonService();

            personService.addPersonToList(new Person("Artur", Gender.Man, 15));
            personService.addPersonToList(new Person("Basia", Gender.Woman, 30));
            personService.addPersonToList(new Person("Paweł", Gender.Man, 20));
            personService.addPersonToList(new Person("Kasia", Gender.Woman, 25));
            personService.addPersonToList(new Person("Marcin", Gender.Man, 101));


            personService.displayMan();
            personService.displayWoman();
            personService.displayAge();
            personService.displayAgeDividedBy10();
            personService.displaySumOfAge();
            personService.displayNamesWithSi();



    }
}
