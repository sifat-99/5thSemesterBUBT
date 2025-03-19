package Vehicle;

public class Main {
    public static void main(String[] args) {
    Car car = new Car(123, 4);
    Bus bus = new Bus(100, 50);
        if (car.speed > bus.speed) {
            System.out.println("Car is faster than Bus");
        } else {
            System.out.println("Bus is faster than Car");
        }
    }

}
