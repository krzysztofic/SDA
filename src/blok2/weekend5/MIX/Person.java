package blok2.weekend5.MIX;

public class Person {

    private String name, sex;
    private int age;

    public Person(String name, String sex, int age) {
        this.name = name;
        this.sex = sex;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public String getSex() {
        return sex;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString(){
        return this.name + " ,wiek " + this.age;
    }

}
