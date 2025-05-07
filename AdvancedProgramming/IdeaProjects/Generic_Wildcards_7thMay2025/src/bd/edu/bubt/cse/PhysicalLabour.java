package bd.edu.bubt.cse;

public class PhysicalLabour extends UneducatedPerson{
    private String licenseId;

    public PhysicalLabour(String name, int age, String typeOfPhysicalWork, String licenseId) {
        super(name, age, typeOfPhysicalWork);
        this.licenseId = licenseId;
    }

    public String getLicenseId() {
        return licenseId;
    }

    public void setLicenseId(String licenseId) {
        this.licenseId = licenseId;
    }
}
