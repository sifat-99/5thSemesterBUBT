package bd.edu.bubt.cse;

public class Main {

    public static void main(String[] args) {
        Account account = new Account();
        Current current = new Current();
        Savings savings= new Savings();
        System.out.println("Saving total Balance: "+savings.getBalance());
        System.out.println("Profit: " + savings.getInterest());
        Savings savings2 = new Savings(2000);
        System.out.println("Saving total Balance: "+savings2.getBalance());
        System.out.println("Profit: " + savings2.getInterest());
    }
}