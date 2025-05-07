package bd.edu.bubt.cse;

public class UneducatedPerson extends Person{
    private String typeOfPhysicalWork;

    public UneducatedPerson(String name, int age, String typeOfPhysicalWork) {
        super(name, age);
        this.typeOfPhysicalWork = typeOfPhysicalWork;
    }

    public String getTypeOfPhysicalWork() {
        return typeOfPhysicalWork;
    }

    public void setTypeOfPhysicalWork(String typeOfPhysicalWork) {
        this.typeOfPhysicalWork = typeOfPhysicalWork;
    }
}
