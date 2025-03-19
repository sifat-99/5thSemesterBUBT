package Test;

public class Vehicle {
    double speed;
    int noOfPassengers;
    Vehicle(double speed, int noOfPassengers) {
        this.speed = speed;
        this.noOfPassengers = noOfPassengers;
    }

    public double getSpeed() {
        return speed;
    }

    public int getNoOfPassengers() {
        return noOfPassengers;
    }
}

class Car extends Vehicle{
    Car(double speed, int noOfPassengers) {
        super(speed, noOfPassengers);
    }

    @Override
    public double getSpeed() {
        return super.getSpeed();
    }
}

class Bus extends Vehicle{
    Bus(double speed, int noOfPassengers) {
        super(speed, noOfPassengers);
    }

    @Override
    public double getSpeed() {
        return super.getSpeed();
    }
}
//
//class Main{
//    public static void main(String[] args){
//        Car car = new Car(100, 4);
//        Bus bus = new Bus(60, 40);
//
//        if (car.getSpeed() > bus.getSpeed()) {
//            System.out.println("Car is faster than Bus");
//        } else {
//            System.out.println("Bus is faster than Car");
//        }
//
//    }
//
//}


