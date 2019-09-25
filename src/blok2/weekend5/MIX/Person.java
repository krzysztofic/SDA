package blok2.weekend5.MIX;

public class Person {

    private String name;
    private int age;
    private Gender sex;

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setSex(Gender sex) {
        this.sex = sex;
    }

    public Person(String name, Gender sex, int age) {
        this.name = name;
        this.sex = sex;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public Gender getSex() {
        return sex;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString(){
        return this.name + ", wiek " + this.age;
    }

}
