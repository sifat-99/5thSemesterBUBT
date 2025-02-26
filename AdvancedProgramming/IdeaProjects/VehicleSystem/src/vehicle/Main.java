package vehicle;

public class Main {

    public static void main(String[] args) {
	Car car1 = new Car();
    car1.move(70,"North",5,60);
    car1.move(60,"South",12,30);
    car1.move(50,"East",30,90);
    car1.move(40,"South",5,60);
        System.out.println("car 1 information: ");
        System.out.println("Current Speed: "+car1.getSpeed());
        System.out.println("Total fuel absorved: "+car1.getTotalFuelAbsorbed());
        System.out.println("Max Speed: "+car1.getMaxSpeed());
        System.out.println("Total distance: "+car1.getTotalDistance());
        System.out.println("Total fuelefficiency: "+car1.getFuelEfficiency());
    }
}
