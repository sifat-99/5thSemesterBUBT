package bd.edu.bubt.cse;

public class Rickshawpuller extends PhysicalLabour{
    private String area;

    public Rickshawpuller(String name, int age, String typeOfPhysicalWork, String licenseId, String area) {
        super(name, age, typeOfPhysicalWork, licenseId);
        this.area = area;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }
}
