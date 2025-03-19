package bOf3;

public class Main {
    public static void main(String[] args) {
        Shape shape;

        shape = new Triangle();
        shape.setData(10, 20);
        shape.displayArea();

        shape = new Rectangle();
        shape.setData(10, 20);
        shape.displayArea();
    }
}
