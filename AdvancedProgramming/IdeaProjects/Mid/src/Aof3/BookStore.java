package Aof3;

public  class BookStore extends Store{
    @Override
    void get_price() {
        System.out.println("Price of the book is 1000");
    }

    @Override
    void display_info() {
        System.out.println("Book is available in the store");
    }
}
