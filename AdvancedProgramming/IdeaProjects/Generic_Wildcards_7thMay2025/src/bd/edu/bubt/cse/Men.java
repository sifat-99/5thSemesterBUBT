package bd.edu.bubt.cse;

public class Men <T>{
    private T person;

    public Men(T person) {
        this.person = person;
    }

    public T getPerson() {
        return person;
    }

    public void setPerson(T person) {
        this.person = person;
    }
}

