package blok1.weekend2.obiektowo_employee;

    public class Employee {
        private String name;
        private String lastName;
        private int age= 33;


    public Employee(String name) {
        this.name = name;
        this.lastName = "Kowalski";

    }

    public Employee(String name, String lastName) {
        this.name = name;
        this.lastName = lastName;

    }

    public Employee(String name, String lastName, int age) {
        this.name = name;
        this.lastName = lastName;
        this.age = age;

        }

        @Override
        public String toString() {
            return "Name: " + this.name + " \nLast Name: " + this.lastName + "\nAge: " + this.age;
        }
}
