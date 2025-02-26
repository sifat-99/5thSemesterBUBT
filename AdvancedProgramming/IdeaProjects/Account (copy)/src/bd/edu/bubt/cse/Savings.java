package bd.edu.bubt.cse;

public class Savings extends Current{
    private double interest;
    Savings(){
        this.interest = 5.0;
    }
    @Override
    public double calculateInterest() {
        return super.getBalance()*(this.interest/100);
    }

    public double getInterest() {
        return super.getBalance()*(this.interest/100);
    }

    public void setInterest(double interest) {
        this.interest = interest;
    }
}
