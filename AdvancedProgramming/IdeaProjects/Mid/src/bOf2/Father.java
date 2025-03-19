package bOf2;

public class Father extends Grandfather {
    Father(int age, String name) {
        super(age, name);
    }

    @Override
    public void showDetails() {
        System.out.println("Father's Name: " + name + ", Age: " + age);
    }
}
