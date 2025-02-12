package bd.edu.bubt.cse;

class SoccarPlayer extends Player{
    private int totalGoalsScored;
    private int totalAssists;
    private int totalRedCars;
    private int totalYellowCards;
    private double averageGoalScoredPerMatch;
    private double averageAssistsPerMatch;

    public void setTotalGoalsScored(int totalGoalsScored) {
        this.totalGoalsScored = totalGoalsScored;
    }

    public int getTotalGoalsScored() {
        return totalGoalsScored;
    }
    public void setTotalAssists(int totalAssists) {
        this.totalAssists = totalAssists;
    }

    public int getTotalAssists() {
        return totalAssists;
    }

    public void setTotalRedCars(int totalRedCars) {
        this.totalRedCars = totalRedCars;
    }

    public int getTotalRedCars() {
        return totalRedCars;
    }

    public void setTotalYellowCards(int totalYellowCards) {
        this.totalYellowCards = totalYellowCards;
    }

    public int getTotalYellowCards() {
        return totalYellowCards;
    }

    public double getAverageGoalScoredPerMatch() {
        this.averageGoalScoredPerMatch = (double)totalGoalsScored/super.matchPlayed;
        return averageGoalScoredPerMatch;
    }

    public double getAverageAssistsPerMatch() {
        this.averageAssistsPerMatch = (double)totalAssists/super.matchPlayed;        return averageAssistsPerMatch;
    }
}