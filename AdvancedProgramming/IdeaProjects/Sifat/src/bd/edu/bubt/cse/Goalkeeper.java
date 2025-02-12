package bd.edu.bubt.cse;

public class Goalkeeper extends SoccarPlayer{
    int totalSaves;
    private int totalSuccessfulPenaltySaves;
    private int totalFailedPenaltySaves;
    private double penaltySaveProbability;


    public int getTotalSaves() {
        return totalFailedPenaltySaves+totalFailedPenaltySaves;
    }

    public void setTotalSuccessfulPenaltySaves(int totalSuccessfulPenaltySaves) {
        this.totalSuccessfulPenaltySaves = totalSuccessfulPenaltySaves;
    }

    public int getTotalSuccessfulPenaltySaves() {
        return totalSuccessfulPenaltySaves;
    }

    public void setTotalFailedPenaltySaves(int totalFailedPenaltySaves) {
        this.totalFailedPenaltySaves = totalFailedPenaltySaves;
    }

    public int getTotalFailedPenaltySaves() {
        return totalFailedPenaltySaves;
    }

    public void setPenaltySaveProbability(double penaltySaveProbability) {
        this.penaltySaveProbability = penaltySaveProbability;
    }

    public double getPenaltySaveProbability() {
        this.penaltySaveProbability = (totalSuccessfulPenaltySaves/(double)totalSaves)*100;
        return penaltySaveProbability;
    }
}
