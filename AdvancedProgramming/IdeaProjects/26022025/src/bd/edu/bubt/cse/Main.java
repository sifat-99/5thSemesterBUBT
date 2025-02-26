package bd.edu.bubt.cse;

public class Main {

    public static void main(String[] args) {
        Employee em = new Employee(200);
        Manager manager = new Manager(200,300);

        System.out.println("Employee Salary: " + em.getSalary());
        System.out.println("Manager Salary: " + manager.getSalary());

        Employee em2 = new Employee();
        Manager manager2 = new Manager();

        System.out.println("Employee2 Salary: " + em2.getSalary());
        System.out.println("Manager2 Salary: " + manager2.getSalary());

    }
}
