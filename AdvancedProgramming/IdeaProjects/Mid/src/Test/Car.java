//package Test;
//
//public class Car {
//    double speed;
//    int no_of_passenger;
//
//    Car(double speed, int no_of_passenger) {
//        this.speed = speed;
//        this.no_of_passenger = no_of_passenger;
//    }
//
//    public double getSpeed() {
//        return speed;
//    }
//}
//
//class Bus extends Car{
//    Bus(double speed, int no_of_passenger) {
//        super(speed, no_of_passenger);
//    }
//
//    @Override
//    public double getSpeed() {
//        return super.getSpeed();
//    }
//}
//
//class Main{
//    public static void main(String[] args) {
//        Car car = new Car(70, 4);
//        Bus bus = new Bus(60, 30);
//
//        if(car.getSpeed() > bus.getSpeed()){
//            System.out.println("Car is faster than Bus");
//        }
//        else{
//            System.out.println("Bus is faster than Car");
//        }
//    }
//}
