package bd.edu.bubt.cse;

public  class Bike extends LandVehicle {
    protected int kickStartHeight;

    public void accelerate() {
        System.out.println("Bike is accelerating with the kickstart");

    }


    public void deAccelerate() {
        System.out.println("Bike is deAccelerating with the handbreak");
    }
}
