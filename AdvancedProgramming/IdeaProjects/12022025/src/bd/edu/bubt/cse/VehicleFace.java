package bd.edu.bubt.cse;

public interface VehicleFace {
    public static final int controlRoom = 1;
    public abstract void start();
    public abstract void stop();
    public abstract void accelerate();
    public abstract void deAccelerate();
}
