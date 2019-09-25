package blok2.weekend5.MIX;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PersonService implements IPersonService {

    private ArrayList<Person> list = new ArrayList<Person>();

    public void addPersonToList(Person person){
        list.add(person);
    }

    public void displayMan(){
        System.out.println("\nMen are: \n");
        for (Person person : list){
            if(person.getSex() == Gender.Man){
                System.out.println(person);
            }
        }
    }

    public void displayWoman(){
        System.out.println("\nWomam are: \n");
        for (Person person : list){
            if(person.getSex() == Gender.Woman){
                System.out.println(person);
            }
        }
    }

    public void displayAge(){
        System.out.println("\nPeople over 18 yo are: \n");
        for (Person person : list){
            if(person.getAge() >= 18){
                System.out.println(person);
            }
        }
    }

    public void displayAgeDividedBy10(){
        System.out.println("\nPeople with age dividable by 10 are: \n");
        for(Person person : list){
            if(person.getAge() %10 ==0){
                System.out.println(person);
            }
        }
    }

    public void displaySumOfAge(){
        int sum = 0;
        System.out.println("\nSum of all people age is: \n");
        for(Person person : list){
            sum += person.getAge();
        }
        System.out.println(sum);
    }

    public void displayNamesWithSi(){
        System.out.println("\nPeople with 'si' in names are: ");
        for(Person person : list){
            if(person.getName().contains("si")){
                System.out.println(person);
            }
        }
    }



}
