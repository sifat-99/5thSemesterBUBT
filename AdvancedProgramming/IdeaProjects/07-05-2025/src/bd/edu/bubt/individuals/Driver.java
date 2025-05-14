package bd.edu.bubt.individuals;

public class Driver extends PhysicalLabour {
    protected String vehicleName;

    public Driver(String name, double age, String physicalWork, String licenseId, String vehicleName) {
        super(name, age, physicalWork, licenseId);
        this.vehicleName = vehicleName;
    }

    public String getVehicleName() {
        return vehicleName;
    }

    public void setVehicleName(String vehicleName) {
        this.vehicleName = vehicleName;
    }
}
