package Vehicle;

public class Car implements Vehicle {
    double speed;
    int noOfPassengers;
    Car(double speed, int noOfPassengers) {
        this.speed = speed;
        this.noOfPassengers = noOfPassengers;
    }
    @Override
    public void getSpeed() {
        System.out.println("Speed is 100 km/hr");

    }
    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public int getNoOfPassengers() {
        return noOfPassengers;
    }

    public void setNoOfPassengers(int noOfPassengers) {
        this.noOfPassengers = noOfPassengers;
    }
}
