package bd.edu.bubt.individuals;

public class EducatedPerson extends Person {
    protected String degree;

    public EducatedPerson(String name, double age, String degree) {
        super(name, age);
        this.degree = degree;
    }

    public String getDegree() {
        return degree;
    }

    public void setDegree(String degree) {
        this.degree = degree;
    }
}
