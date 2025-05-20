class Player {
    String name;
    String nationality;

    public Player(String name, String nationality) {
        this.name = name;
        this.nationality = nationality;
    }

    public boolean isLocal(String localCountry) {
        return nationality.equalsIgnoreCase(localCountry);
    }

    @Override
    public String toString() {
        return this.name + " (" + nationality + ")";
    }
}