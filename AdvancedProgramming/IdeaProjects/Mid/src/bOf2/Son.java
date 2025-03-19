package bOf2;

public class Son extends Father {
    Son(int age, String name) {
        super(age, name);
    }

    @Override
    public void showDetails() {
        System.out.println("Son's Name: " + name + ", Age: " + age);
    }
}
