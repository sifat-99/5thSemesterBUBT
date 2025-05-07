package bd.edu.bubt.cse;

public class Driver extends PhysicalLabour{
    private String vehicleName;

    public Driver(String name, int age, String typeOfPhysicalWork, String licenseId, String vehicleName) {
        super(name, age, typeOfPhysicalWork, licenseId);
        this.vehicleName = vehicleName;
    }

    public String getVehicleName() {
        return vehicleName;
    }

    public void setVehicleName(String vehicleName) {
        this.vehicleName = vehicleName;
    }
}
