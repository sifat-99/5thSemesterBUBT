package bd.edu.bubt.individuals;

public class IlliteratePerson extends Person {
    protected String physicalWork;

    public IlliteratePerson(String name, double age, String physicalWork) {
        super(name, age);
        this.physicalWork = physicalWork;
    }

    public String getPhysicalWork() {
        return physicalWork;
    }

    public void setPhysicalWork(String physicalWork) {
        this.physicalWork = physicalWork;
    }
}
