package bd.edu.bubt.cse;

public abstract class LandVehicle extends Vehicle{
    protected int noOfWheels;

    public int getNoOfWheels() {
        return noOfWheels;
    }

    public void setNoOfWheels(int noOfWheels) {
        this.noOfWheels = noOfWheels;
    }

    public void start(){
        System.out.println("Bhoom Bhoom.....!!");
    }

    public void stop(){
        System.out.println("Zeez...!");
    }
}
