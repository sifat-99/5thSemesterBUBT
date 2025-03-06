import java.util.ArrayList;
import java.util.List;

// Book class
class Book {
    String name;
    String author;
    int numberOfCopiesAvailable;
    double price;

    // Parameterized constructor
    public Book(String name, String author, int numberOfCopiesAvailable, double price) {
        this.name = name;
        this.author = author;
        this.numberOfCopiesAvailable = numberOfCopiesAvailable;
        this.price = price;
    }

    // Default constructor
    public Book() {
        this.name = "Unknown";
        this.author = "Unknown";
        this.numberOfCopiesAvailable = 0;
        this.price = 0.0;
    }

    // Method to show book details
    public void showDetails() {
        System.out.println("Book Name: " + name);
        System.out.println("Author: " + author);
        System.out.println("Copies Available: " + numberOfCopiesAvailable);
        System.out.println("Price: $" + price);
        System.out.println("-----------------------------");
    }
}

// BookStall class
class BookStall {
    String name;
    String address;
    String contactInfo;
    double balance;
    List<Book> bookList;

    // Parameterized constructor
    public BookStall(String name, String address, String contactInfo, double balance) {
        this.name = name;
        this.address = address;
        this.contactInfo = contactInfo;
        this.balance = balance;
        this.bookList = new ArrayList<>();
    }

    // Default constructor
    public BookStall() {
        this.name = "Unknown";
        this.address = "Unknown";
        this.contactInfo = "Unknown";
        this.balance = 0.0;
        this.bookList = new ArrayList<>();
    }

    // Method to add a book to the stall
    public void addBook(Book book) {
        bookList.add(book);
    }

    // Method to show stall details
    public void showDetails() {
        System.out.println("Stall Name: " + name);
        System.out.println("Address: " + address);
        System.out.println("Contact Info: " + contactInfo);
        System.out.println("Balance: $" + balance);
        System.out.println("Books Available:");
        for (Book book : bookList) {
            book.showDetails();
        }
        System.out.println("-----------------------------");
    }
}

// Customer class
class Customer {
    String name;
    String nationalID;
    String deliveryAddress;
    String contactInfo;
    List<Book> purchasedBookList;

    // Parameterized constructor
    public Customer(String name, String nationalID, String deliveryAddress, String contactInfo) {
        this.name = name;
        this.nationalID = nationalID;
        this.deliveryAddress = deliveryAddress;
        this.contactInfo = contactInfo;
        this.purchasedBookList = new ArrayList<>();
    }

    // Default constructor
    public Customer() {
        this.name = "Unknown";
        this.nationalID = "Unknown";
        this.deliveryAddress = "Unknown";
        this.contactInfo = "Unknown";
        this.purchasedBookList = new ArrayList<>();
    }

    // Method to purchase a book
    public void purchase(Book book) {
        if (book.numberOfCopiesAvailable > 0) {
            purchasedBookList.add(book);
            book.numberOfCopiesAvailable--;
            System.out.println(name + " purchased: " + book.name);
        } else {
            System.out.println("Sorry, " + book.name + " is out of stock.");
        }
    }

    // Method to visit a book stall
    public void visitBookStall(BookStall bookStall) {
        System.out.println(name + " is visiting " + bookStall.name);
    }

    // Method to show customer details
    public void showPersonalInfo() {
        System.out.println("Customer Name: " + name);
        System.out.println("National ID: " + nationalID);
        System.out.println("Delivery Address: " + deliveryAddress);
        System.out.println("Contact Info: " + contactInfo);
        System.out.println("Purchased Books:");
        for (Book book : purchasedBookList) {
            book.showDetails();
        }
        System.out.println("-----------------------------");
    }
}

// Main class
public class EBookFair {
    public static void main(String[] args) {
        // Create 3 book stalls
        BookStall stall1 = new BookStall("Stall A", "123 Main St", "555-1234", 1000.0);
        BookStall stall2 = new BookStall("Stall B", "456 Elm St", "555-5678", 1500.0);
        BookStall stall3 = new BookStall("Stall C", "789 Oak St", "555-9101", 2000.0);

        // Add 5 books to each stall
        for (int i = 1; i <= 5; i++) {
            stall1.addBook(new Book("Book A" + i, "Author A" + i, 10, 20.0 + i));
            stall2.addBook(new Book("Book B" + i, "Author B" + i, 10, 25.0 + i));
            stall3.addBook(new Book("Book C" + i, "Author C" + i, 10, 30.0 + i));
        }

        // Create 5 customers
        Customer customer1 = new Customer("John Doe", "ID123", "101 Maple St", "555-1111");
        Customer customer2 = new Customer("Jane Smith", "ID456", "202 Pine St", "555-2222");
        Customer customer3 = new Customer("Alice Johnson", "ID789", "303 Birch St", "555-3333");
        Customer customer4 = new Customer("Bob Brown", "ID101", "404 Cedar St", "555-4444");
        Customer customer5 = new Customer("Charlie Davis", "ID112", "505 Redwood St", "555-5555");

        // Simulate customers visiting stalls and purchasing books
        customer1.visitBookStall(stall1);
        customer1.purchase(stall1.bookList.get(0));
        customer1.purchase(stall1.bookList.get(1));
        customer1.purchase(stall1.bookList.get(2));

        customer2.visitBookStall(stall2);
        customer2.purchase(stall2.bookList.get(0));
        customer2.purchase(stall2.bookList.get(1));
        customer2.purchase(stall2.bookList.get(2));

        customer3.visitBookStall(stall3);
        customer3.purchase(stall3.bookList.get(0));
        customer3.purchase(stall3.bookList.get(1));
        customer3.purchase(stall3.bookList.get(2));

        customer4.visitBookStall(stall1);
        customer4.purchase(stall1.bookList.get(3));
        customer4.purchase(stall1.bookList.get(4));
        customer4.purchase(stall2.bookList.get(0));

        customer5.visitBookStall(stall2);
        customer5.purchase(stall2.bookList.get(3));
        customer5.purchase(stall2.bookList.get(4));
        customer5.purchase(stall3.bookList.get(0));

        // Show final state of stalls and customers
        System.out.println("\nFinal State of Stalls:");
        stall1.showDetails();
        stall2.showDetails();
        stall3.showDetails();

        System.out.println("\nFinal State of Customers:");
        customer1.showPersonalInfo();
        customer2.showPersonalInfo();
        customer3.showPersonalInfo();
        customer4.showPersonalInfo();
        customer5.showPersonalInfo();
    }
}