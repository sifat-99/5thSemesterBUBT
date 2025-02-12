package bd.edu.bubt.cse;

public class Main {

    public static void main(String[] args) {
	   Car car = new Car() ;
       car.setSpeed(10);
       car.setNoOfWheels(4);

       Bike bike = new Bike();
       bike.setSpeed(20);


       Ship ship = new Ship();
       ship.setSpeed(15);
       ship.setNoOfPropelars(4);
       ship.setNoOfHulls(2);

       Plane plane = new Plane();
       plane.setSpeed(55);
       plane.setWingRotationDegree(45);
       plane.setNoOfThrusts(4);


       VehicleFace vehicle1 = new Plane();
       VehicleFace vehicle2 = new Bike();
       VehicleFace vehicle3 = new Car();

       vehicle1.start();
       vehicle1.stop();
       vehicle1.accelerate();
       vehicle1.deAccelerate();

       vehicle2.start();
       vehicle2.stop();
       vehicle2.accelerate();
       vehicle2.deAccelerate();

       vehicle3.start();
       vehicle3.stop();
       vehicle3.accelerate();
       vehicle3.deAccelerate();
    }
}
