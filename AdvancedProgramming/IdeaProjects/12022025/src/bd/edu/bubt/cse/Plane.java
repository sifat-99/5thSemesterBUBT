package bd.edu.bubt.cse;

public class Plane extends AirVehicle{
    protected int wingRotationDegree;

    public int getWingRotationDegree() {
        return wingRotationDegree;
    }

    public void setWingRotationDegree(int wingRotationDegree) {
        this.wingRotationDegree = wingRotationDegree;
    }

    @Override
    public void accelerate() {
        System.out.println("Plane Accelerating with thrust");

    }

    @Override
    public void deAccelerate() {
        System.out.println("Stopping using wing rotation");
    }
}
