package vehicle;

public class Car implements Vehicle,Fuelpower{
    protected double speed = 0;
    protected double maxSpeed=0;
    protected double totalDistance=0;
    protected double totalFuelAbsorbed=0;

    public Car(double speed, double maxSpeed, double totalDistance, double totalFuelAbsorbed) {
        this.speed = speed;
        this.maxSpeed = maxSpeed;
        this.totalDistance = totalDistance;
        this.totalFuelAbsorbed = totalFuelAbsorbed;
    }

    public Car() {
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }
    public void move(double distance, String direction, double fuelneeded, double speed){
        this.totalDistance= this.totalDistance+distance;
        this.totalFuelAbsorbed= this.totalFuelAbsorbed+fuelneeded;
        if (speed>this.maxSpeed)
            this.maxSpeed=speed;
        this.speed=speed;

        System.out.println("The car is moving towards" + direction+"with speed: "+speed+", Required fuel: "+fuelneeded +", distance to be covered: "+distance);

    }

    @Override
    public double getFuelEfficiency() {
        return this.totalDistance/this.totalFuelAbsorbed;
    }

    @Override
    public double getMaxSpeed() {
       return this.maxSpeed;
        }

    public void setMaxSpeed(double maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public double getTotalDistance() {
        return totalDistance;
    }

    public void setTotalDistance(double totalDistance) {
        this.totalDistance = totalDistance;
    }

    public double getTotalFuelAbsorbed() {
        return totalFuelAbsorbed;
    }

    public void setTotalFuelAbsorbed(double totalFuelAbsorbed) {
        this.totalFuelAbsorbed = totalFuelAbsorbed;
    }
}
