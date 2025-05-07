package bd.edu.bubt.cse;

public class Enterpreuner extends EducatedPerson{
    private String assets;

    public Enterpreuner(String name, int age, String degree, String assets) {
        super(name, age, degree);
        this.assets = assets;
    }

    public String getAssets() {
        return assets;
    }

    public void setAssets(String assets) {
        this.assets = assets;
    }
}
