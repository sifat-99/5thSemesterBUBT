package bd.edu.bubt.individuals;

public class JobHolder extends EducatedPerson {
    protected String nameOfOrganization;

    public JobHolder(String name, double age, String degree, String nameOfOrganization) {
        super(name, age, degree);
        this.nameOfOrganization = nameOfOrganization;
    }

    public String getNameOfOrganization() {
        return nameOfOrganization;
    }

    public void setNameOfOrganization(String nameOfOrganization) {
        this.nameOfOrganization = nameOfOrganization;
    }
}
