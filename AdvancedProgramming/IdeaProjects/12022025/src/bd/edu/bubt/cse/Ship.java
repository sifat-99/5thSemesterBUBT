package bd.edu.bubt.cse;

public class Ship extends WaterVehicle{
    protected  int noOfHulls;

    public int getNoOfHulls() {
        return noOfHulls;
    }

    public void setNoOfHulls(int noOfHulls) {
        this.noOfHulls = noOfHulls;
    }

    @Override
    public void accelerate() {
        System.out.println(" Ship Acceleration of water vehicle");
    }

    @Override
    public void deAccelerate() {

        System.out.printf("Deacceleration of Water Vehicle with ");
        System.out.printf(String.valueOf(getNoOfHulls()));
        System.out.println(" Hulls");

    }
}
