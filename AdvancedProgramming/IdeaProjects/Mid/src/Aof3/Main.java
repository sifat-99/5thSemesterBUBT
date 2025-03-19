package Aof3;

public class Main {
    public static void main(String[] args) {
        BookStore bookStore = new BookStore();
        Ricestore ricestore = new Ricestore();
        bookStore.showItem();
        bookStore.get_price();
        bookStore.display_info();

        ricestore.showItem();
        ricestore.get_price();

        ricestore.display_info();
    }
}
