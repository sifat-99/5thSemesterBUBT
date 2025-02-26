package bd.edu.bubt.cse;

public abstract class Account {
    protected static double balance = 1000;

    public abstract double calculateInterest();

    public double getBalance() {
        return balance;
    }

    public static void setBalance(double balance) {
        Account.balance = balance;
    }

    public double showBalance()
    {
        return balance+calculateInterest();
    }

}
