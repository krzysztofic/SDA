package blok1.weekend2.obiektowo_employee;

public class Company {
    public static void main(String[] args) {
        Employee emp1 = new Employee("Tomek","Tworek",23);
        Employee emp2 = new Employee("Jacek","Nowak");
        Employee emp3 = new Employee("Andrzej");

        System.out.println(emp1.toString());
        System.out.println(emp2.toString());
        System.out.println(emp3.toString());

    }
}