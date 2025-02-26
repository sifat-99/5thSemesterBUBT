package bd.edu.bubt.cse;

public class Main {

    public static void main(String[] args) {
        Savings savings= new Savings();
        Current current = new Current();
        System.out.println("Current total Balance: "+current.showBalance());
        System.out.println("Saving total Balance: "+savings.showBalance());
    }
}
