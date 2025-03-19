package Vehicle;

public class Bus implements Vehicle{
    double speed;
    int noOfPassengers;
    Bus(double speed, int noOfPassengers) {
        this.speed = speed;
        this.noOfPassengers = noOfPassengers;
    }

    @Override
    public void getSpeed() {
        System.out.println("Speed is 60 km/hr");
    }
}
