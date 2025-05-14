package bd.edu.bubt.individuals;

public class Entrepreuner extends EducatedPerson {
    protected double asset;

    public Entrepreuner(String name, double age, String degree, double asset) {
        super(name, age, degree);
        this.asset = asset;
    }

    public double getAsset() {
        return asset;
    }

    public void setAsset(double asset) {
        this.asset = asset;
    }
}
