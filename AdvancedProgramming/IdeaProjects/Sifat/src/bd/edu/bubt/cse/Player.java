package bd.edu.bubt.cse;

public class Player extends Main{
    protected String name;
    protected int age;
    protected int jerseyNumber;
    protected int matchPlayed;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setJerseyNumber(int jerseyNumber) {
        this.jerseyNumber = jerseyNumber;
    }

    public int getJerseyNumber() {
        return jerseyNumber;
    }

    public void setMatchPlayed(int matchPlayed) {
        this.matchPlayed = matchPlayed;
    }

    public int getMatchPlayed() {
        return matchPlayed;
    }
}

