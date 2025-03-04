package cse.bubt.edu.bd;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Book> allBooks = new ArrayList<>();
        for (int i = 1; i <= 15; i++) {
            allBooks.add(new Book("Book " + i, "Author " + i, 5, 100.0 * i));
        }

        List<Book> stall1Books = new ArrayList<>(allBooks.subList(0, 5));
        List<Book> stall2Books = new ArrayList<>(allBooks.subList(5, 10));
        List<Book> stall3Books = new ArrayList<>(allBooks.subList(10, 15));

        BookStall stall1 = new BookStall("Stall 1", "Address 1", "Contact 1", stall1Books);
        BookStall stall2 = new BookStall("Stall 2", "Address 2", "Contact 2", stall2Books);
        BookStall stall3 = new BookStall("Stall 3", "Address 3", "Contact 3", stall3Books);

        List<Customer> customers = new ArrayList<>();
        for (int i = 1; i <= 5; i++) {
            customers.add(new Customer("Customer " + i, "ID" + i, "Address " + i, "Contact " + i));
        }

        for (Customer customer : customers) {
            customer.visitBookStall(stall1);
            customer.purchase(stall1.getBookList().get(0));

            customer.visitBookStall(stall2);
            customer.purchase(stall2.getBookList().get(0));

            customer.visitBookStall(stall3);
            customer.purchase(stall3.getBookList().get(0));
        }

        System.out.println("=== Stall Details ===");
        stall1.showDetails();
        stall2.showDetails();
        stall3.showDetails();

        System.out.println("=== Book Details ===");
        for (Book book : allBooks) {
            book.showDetails();
        }

        System.out.println("=== Customer Details ===");
        for (Customer customer : customers) {
            customer.showDetails();
        }
    }
}