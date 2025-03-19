package bOf2;

public class Grandfather {
    int age;
    String name;

    Grandfather(int age, String name) {
        this.age = age;
        this.name = name;
    }


    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void showDetails() {
        System.out.println("Grandfather's Name: " + name + ", Age: " + age);
    }
}
