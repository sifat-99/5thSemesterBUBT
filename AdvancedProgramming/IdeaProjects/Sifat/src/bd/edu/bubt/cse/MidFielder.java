package bd.edu.bubt.cse;

public class MidFielder extends SoccarPlayer{
    private int totalSuccessfulPasses;
    private int totalUnSuccessfulPasses;
    private int totalInterception;
    private double passAccuracy;

    public void setTotalSuccessfulPasses(int totalSuccessfulPasses) {
        this.totalSuccessfulPasses = totalSuccessfulPasses;
    }

    public int getTotalSuccessfulPasses() {
        return totalSuccessfulPasses;
    }

    public void setTotalUnSuccessfulPasses(int totalUnSuccessfulPasses) {
        this.totalUnSuccessfulPasses = totalUnSuccessfulPasses;
    }
    public int getTotalUnSuccessfulPasses() {
        return totalUnSuccessfulPasses;
    }

    public void setTotalInterception(int totalInterception) {
        this.totalInterception = totalInterception;
    }

    public int getTotalInterception() {
        return totalInterception;
    }


    public double getPassAccuracy() {
        this.passAccuracy = (totalSuccessfulPasses/(double)(totalSuccessfulPasses+totalUnSuccessfulPasses))*100;
        return passAccuracy;
    }
}
