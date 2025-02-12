package bd.edu.bubt.cse;

public abstract class Vehicle implements VehicleFace {
    protected int speed;

    public int getsSpeeds() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }
}
