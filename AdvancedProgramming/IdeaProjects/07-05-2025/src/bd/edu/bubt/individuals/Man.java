package bd.edu.bubt.individuals;

public class Man <T extends Person>{
    private T person;

    public Man(T person) {
        this.person = person;
    }

    public T getPerson() {
        return person;
    }

    public void setPerson(T person) {
        this.person = person;
    }
}
