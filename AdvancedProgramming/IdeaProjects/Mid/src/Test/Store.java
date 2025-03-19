package Test;

public abstract class Store {
    public void showItem(){
        System.out.println("Item shown");
    }
    abstract double get_Price();
    abstract void displayInfo();
}

class Bookstore extends Store{
    double price;
    String bookName;
    Bookstore(double price, String bookName){
        this.price = price;
        this.bookName = bookName;
    }
    @Override
    double get_Price() {
        return price;
    }

    @Override
    void displayInfo() {
        System.out.println("Book Name: " + bookName + ", Price: " + price);
    }
}
class RiceStore extends Store{
    double price;
    String riceName;
    RiceStore(double price, String riceName){
        this.price = price;
        this.riceName = riceName;
    }
    @Override
    double get_Price() {
        return price;
    }

    @Override
    void displayInfo() {
        System.out.println("Rice Name: " + riceName + ", Price: " + price);
    }
}
