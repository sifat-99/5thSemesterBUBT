package bd.edu.bubt.cse;

public abstract class Vehicle implements VehicleFace {
    protected double speed;

    public double getsSpeeds() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }
}
