package bd.edu.bubt.cse;

public abstract class LandVehicle extends Vehicle{
    protected int noOfWheels;

    public int getNoOfWheels() {
        return noOfWheels;
    }

    public void setNoOfWheels(int noOfWheels) {
        this.noOfWheels = noOfWheels;
    }
    @Override
    public void start() {
            System.out.printf("Bhoom Bhoom.....!! at ");
            System.out.println(String.valueOf(getsSpeeds()));
            System.out.println(noOfWheels);
    }

@Override
    public void stop(){
        System.out.println("Zeez...!");
    }

}
