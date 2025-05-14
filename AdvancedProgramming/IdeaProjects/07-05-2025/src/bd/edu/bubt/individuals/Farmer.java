package bd.edu.bubt.individuals;

public class Farmer extends IlliteratePerson {
    protected String foodGrowns;

    public Farmer(String name, double age, String physicalWork, String foodGrowns) {
        super(name, age, physicalWork);
        this.foodGrowns = foodGrowns;
    }

    public String getFoodGrowns() {
        return foodGrowns;
    }

    public void setFoodGrowns(String foodGrowns) {
        this.foodGrowns = foodGrowns;
    }
}
