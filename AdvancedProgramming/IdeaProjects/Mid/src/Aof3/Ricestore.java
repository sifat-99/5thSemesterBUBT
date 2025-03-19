package Aof3;

public class Ricestore extends Store{
    @Override
    void get_price() {
        System.out.println("Price of the rice is 50");
    }

    @Override
    void display_info() {
        System.out.println("Rice is available in the store");
    }
}
