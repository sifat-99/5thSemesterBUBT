package bd.edu.bubt.cse;

public class Striker extends SoccarPlayer{
    private int totalSuccessfulDribbles;
    private int totalShotsOnTarget;
    private int totalShotsOffTarget;
    private double shotsOnTargetPercentage;

    public void setTotalSuccessfulDribbles(int totalSuccessfulDribbles) {
        this.totalSuccessfulDribbles = totalSuccessfulDribbles;
    }

    public int getTotalSuccessfulDribbles() {
        return totalSuccessfulDribbles;
    }

    public void setTotalShotsOnTarget(int totalShotsOnTarget) {
        this.totalShotsOnTarget = totalShotsOnTarget;
    }

    public int getTotalShotsOnTarget() {
        return totalShotsOnTarget;
    }

    public void setTotalShotsOffTarget(int totalShotsOffTarget) {
        this.totalShotsOffTarget = totalShotsOffTarget;
    }

    public int getTotalShotsOffTarget() {
        return totalShotsOffTarget;
    }

    public double getShotsOnTargetPercentage() {

        this.shotsOnTargetPercentage = (totalShotsOnTarget/ (double)(totalShotsOnTarget+totalShotsOffTarget))*100;
        return shotsOnTargetPercentage;
    }
}
