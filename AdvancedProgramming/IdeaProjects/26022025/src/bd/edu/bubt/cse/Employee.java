package bd.edu.bubt.cse;

public class Employee{
    private int Salary;

    Employee(int amount){
        this.Salary = amount;
    }
    Employee(){
        this.Salary = 300;
    }

    public void setSalary(int salary) {
        Salary = salary;
    }

    public int getSalary() {
        return Salary;
    }

}
