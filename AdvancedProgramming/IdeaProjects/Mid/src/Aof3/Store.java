package Aof3;

public abstract class Store {

    abstract void get_price();
    abstract void display_info();


    public void showItem(){
        System.out.println("Item is available in the store");
    }
}
