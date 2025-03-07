package vehicle;

public class ElectricCar implements Vehicle,Electric{
    protected double remainBattery;
    @Override
    public double getBattery() {
        return remainBattery;
    }

    @Override
    public double getMaxSpeed() {
        return 0;
    }
}
