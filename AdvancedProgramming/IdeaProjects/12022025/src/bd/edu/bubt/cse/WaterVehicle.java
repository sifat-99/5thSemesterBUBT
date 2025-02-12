package bd.edu.bubt.cse;

public abstract class WaterVehicle extends Vehicle{
    protected int noOfPropelars;

    public int getNoOfPropelars() {
        return noOfPropelars;
    }

    public void setNoOfPropelars(int noOfPropelars) {
        this.noOfPropelars = noOfPropelars;
    }

    @Override
    public void start() {
        System.out.printf("Water Vehicle is running in water at speed of ");
        System.out.println(String.valueOf(getsSpeeds()));
        System.out.printf("It has ");
        System.out.printf(String.valueOf(getNoOfPropelars()));
        System.out.println(" Propelers");
    }

    @Override
    public void stop() {
        System.out.println("Water vehicle is stoping with stopping engine");
    }
}
