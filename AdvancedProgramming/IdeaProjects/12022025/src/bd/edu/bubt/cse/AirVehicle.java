package bd.edu.bubt.cse;

public abstract class AirVehicle extends Vehicle{
    protected int noOfThrusts;

    public int getNoOfThrusts() {
        return noOfThrusts;
    }

    public void setNoOfThrusts(int noOfThrusts) {
        this.noOfThrusts = noOfThrusts;
    }

    @Override
    public void start() {
        System.out.println("Starting with thrusts");
    }

    @Override
    public void stop() {
        System.out.println("Stopping Thrusts");

    }
}
