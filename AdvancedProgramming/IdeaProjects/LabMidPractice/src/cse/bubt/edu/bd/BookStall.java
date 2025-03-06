package cse.bubt.edu.bd;

        import java.util.ArrayList;
        import java.util.List;

        class BookStall {
            private String name;
            private String address;
            private String contactInfo;
            private double balance;
            private List<Book> bookList;

            public BookStall() {

            }

            public BookStall(String name, String address, String contactInfo, List<Book> bookList) {
                this.name = name;
                this.address = address;
                this.contactInfo = contactInfo;
                this.balance = 0.0;
                this.bookList = bookList;
            }

            public String getName() {
                return name;
            }

            public List<Book> getBookList() {
                return bookList;
            }

            public double getBalance() {
                return balance;
            }

            public void setBalance(double balance) {
                this.balance = balance;
            }

            public void showDetails() {
                System.out.println("Book Stall Name: " + name);
                System.out.println("Address: " + address);
                System.out.println("Contact Info: " + contactInfo);
                System.out.printf("Balance: $%.2f\n", balance);
                System.out.println("Books Available:");
                for (Book book : bookList) {
                    book.showDetails();
                }
                System.out.println();
            }
        }