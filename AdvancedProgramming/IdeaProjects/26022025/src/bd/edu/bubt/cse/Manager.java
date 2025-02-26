package bd.edu.bubt.cse;

public class Manager extends Employee{
    private  int bonus;
    Manager(){
        super();
        this.bonus = 100;
    }
    Manager(int bonus, int salary){
        super(salary);
        this.bonus = bonus;
    }

    @Override
    public int getSalary() {
        return super.getSalary()+ this.bonus;
    }

    public void setBonus(int bonus) {
        this.bonus = bonus;
    }

    public int getBonus() {
        return bonus;
    }


}
