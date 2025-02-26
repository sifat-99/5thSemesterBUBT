package vehicle;

public class ElectricCar implements Vehicle,Electric{
    protected double remainBattery;
    @Override
    public double getBettery() {
        return remainBattery;
    }

    @Override
    public double getMaxSpeed() {
        return 0;
    }
}
