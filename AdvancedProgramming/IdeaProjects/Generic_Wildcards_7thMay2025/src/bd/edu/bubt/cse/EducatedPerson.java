package bd.edu.bubt.cse;

public class EducatedPerson extends Person{
    private String degree;

    public EducatedPerson(String name, int age, String degree) {
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
