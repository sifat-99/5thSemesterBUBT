package cse.bubt.edu.bd;

        import java.util.ArrayList;
        import java.util.List;

        class Customer {
            private String name;
            private String nationalID;
            private String deliveryAddress;
            private String contactInfo;
            private List<Book> purchasedBookList;
            private BookStall currentStall;

            public Customer() {

            }

            public Customer(String name, String nationalID, String deliveryAddress, String contactInfo) {
                this.name = name;
                this.nationalID = nationalID;
                this.deliveryAddress = deliveryAddress;
                this.contactInfo = contactInfo;
                this.purchasedBookList = new ArrayList<>();
                this.currentStall = null;
            }

            public void visitBookStall(BookStall bookStall) {
                this.currentStall = bookStall;
            }

            public void purchase(Book book) {
                if (currentStall == null) {
                    System.out.println("Please visit a book stall first.");
                    return;
                }
                if (!currentStall.getBookList().contains(book)) {
                    System.out.println("Book not available in this stall.");
                    return;
                }
                if (book.getNumberOfCopiesAvailable() <= 0) {
                    System.out.println("No copies available.");
                    return;
                }

                book.setNumberOfCopiesAvailable(book.getNumberOfCopiesAvailable() - 1);
                currentStall.setBalance(currentStall.getBalance() + book.getPrice());
                purchasedBookList.add(book);
                System.out.println(name + " purchased " + book.getName());
            }

            public void showPersonalInfo() {
                System.out.println("Customer Name: " + name);
                System.out.println("National ID: " + nationalID);
                System.out.println("Delivery Address: " + deliveryAddress);
                System.out.println("Contact Info: " + contactInfo);
            }

            public void showDetails() {
                showPersonalInfo();
                System.out.println("Purchased Books:");
                for (Book book : purchasedBookList) {
                    book.showDetails();
                }
                System.out.println();
            }
        }