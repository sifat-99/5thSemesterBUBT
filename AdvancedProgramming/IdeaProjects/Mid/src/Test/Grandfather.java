package Test;

public class Grandfather {
    int age;
    String name;
    Grandfather(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public void showDetails() {
        System.out.println("Grandfather's Name: " + this.name + ", Age: " + this.age);
    }
}
class Father extends Grandfather{
    Father(int age, String name) {
        super(age, name);
    }

    @Override
    public void showDetails() {
        System.out.println("Father's Name: " + this.name + ", Age: " + this.age);
    }
}

class Son extends Father{
    Son(int age, String name){
        super(age, name);
    }

    @Override
    public void showDetails() {
        System.out.println("Son's Name: " + this.name + ", Age: " + this.age);
    }
}

//class Main{
//    public static void main(String[] args){
//        Grandfather grandfather = new Grandfather(80, "John");
//        Father father = new Father(50, "Tom");
//        Son son = new Son(25, "Jerry");
//
//        grandfather.showDetails();
//        father.showDetails();
//        son.showDetails();
//    }
//}
