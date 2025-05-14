package bd.edu.bubt.individuals;

public class Rickshawpuller extends PhysicalLabour {
    protected String area;

    public Rickshawpuller(String name, double age, String physicalWork, String licenseId, String area) {
        super(name, age, physicalWork, licenseId);
        this.area = area;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }
}
