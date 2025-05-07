package bd.edu.bubt.cse;

public class JobHolder extends EducatedPerson{
    private String jobOrganization;

    public JobHolder(String name, int age, String degree, String jobOrganization) {

        super(name, age, degree);
        this.jobOrganization = jobOrganization;
    }

    public String getJobOrganization() {
        return jobOrganization;
    }

    public void setJobOrganization(String jobOrganization) {
        this.jobOrganization = jobOrganization;
    }
}
