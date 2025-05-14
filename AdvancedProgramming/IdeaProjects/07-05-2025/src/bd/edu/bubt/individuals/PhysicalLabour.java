package bd.edu.bubt.individuals;

public class PhysicalLabour extends IlliteratePerson {
    protected String licenseId;

    public PhysicalLabour(String name, double age, String physicalWork, String licenseId) {
        super(name, age, physicalWork);
        this.licenseId = licenseId;
    }

    public String getLicenseId() {
        return licenseId;
    }

    public void setLicenseId(String licenseId) {
        this.licenseId = licenseId;
    }
}
