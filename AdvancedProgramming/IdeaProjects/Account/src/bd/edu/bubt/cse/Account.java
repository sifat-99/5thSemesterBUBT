package bd.edu.bubt.cse;

public class Account {
    private double balance;

    Account(){
        this.balance= 1000;
    }

    Account(double balance) {
        this.balance = balance;
    }
    
    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}
