package bd.edu.bubt.cse;

public class Savings extends Current{
    private double interest;

    Savings(double amount){
        super(amount);
        this.interest = 7.0;
    }
    Savings(){
        super();
        this.interest = 5.0;
    }
    @Override
    public double getBalance() {
        return super.getBalance()*(this.interest/100)+super.getBalance();
    }

    public double getInterest() {
        return super.getBalance()*(this.interest/100);
    }

    public void setInterest(double interest) {
        this.interest = interest;
    }
}
