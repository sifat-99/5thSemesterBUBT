package bd.edu.bubt.cse;

public class Farmer extends UneducatedPerson{
    private String foodGrown;

    public Farmer(String name, int age, String typeOfPhysicalWork, String foodGrown) {
        super(name, age, typeOfPhysicalWork);
        this.foodGrown = foodGrown;
    }

    public String getFoodGrown() {
        return foodGrown;
    }

    public void setFoodGrown(String foodGrown) {
        this.foodGrown = foodGrown;
    }
}
