package bd.edu.bubt.cse;

public class Defender extends SoccarPlayer{
    private int totalSuccessfulTackles;
    private int totalUnsuccessfulTackles;
    private int arealWons;
    private double successfulTacklesPercentage;

    public void setTotalSuccessfulTackles(int totalSuccessfulTackles) {
        this.totalSuccessfulTackles = totalSuccessfulTackles;
    }

    public int getTotalSuccessfulTackles() {
        return totalSuccessfulTackles;
    }
    public void setTotalUnsuccessfulTackles(int totalUnsuccessfulTackles) {
        this.totalUnsuccessfulTackles = totalUnsuccessfulTackles;
    }

    public int getTotalUnsuccessfulTackles() {
        return totalUnsuccessfulTackles;
    }
    public void setArealWons(int arealWons) {
        this.arealWons = arealWons;
    }

    public int getArealWons() {
        return arealWons;
    }



    public double getSuccessfulTacklesPercentage() {
         this.successfulTacklesPercentage = (totalSuccessfulTackles/(double)(totalSuccessfulTackles+totalUnsuccessfulTackles))*100;
         return successfulTacklesPercentage;
    }
}
