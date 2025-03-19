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

class Father extends Grandfather {
    Father(int age, String name) {
        super(age, name);
    }

    @Override
    public void showDetails() {
        System.out.println("Father's Name: " + name + ", Age: " + age);
    }
}

class Son extends Father {
    Son(int age, String name) {
        super(age, name);
    }

    @Override
    public void showDetails() {
        System.out.println("Son's Name: " + name + ", Age: " + age);
    }
}

class Main {
    public static void main(String[] args) {
        Grandfather grandfather = new Grandfather(70, "John");
        Father father = new Father(45, "Tom");
        Son son = new Son(25, "Jerry");
        grandfather.showDetails();
        father.showDetails();
        son.showDetails();
    }
}
