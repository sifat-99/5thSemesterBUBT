package cse.bubt.edu.bd;

        class Book {
            private String name;
            private String author;
            private int numberOfCopiesAvailable;
            private double price;

            public Book() {
                this.name = "";
                this.author = "";
                this.numberOfCopiesAvailable = 0;
                this.price = 0.0;
            }

            public Book(String name, String author, int numberOfCopiesAvailable, double price) {
                this.name = name;
                this.author = author;
                this.numberOfCopiesAvailable = numberOfCopiesAvailable;
                this.price = price;
            }

            public String getName() {
                return name;
            }

            public String getAuthor() {
                return author;
            }

            public int getNumberOfCopiesAvailable() {
                return numberOfCopiesAvailable;
            }

            public double getPrice() {
                return price;
            }

            public void setNumberOfCopiesAvailable(int numberOfCopiesAvailable) {
                this.numberOfCopiesAvailable = numberOfCopiesAvailable;
            }

            public void showDetails() {
                System.out.println("Book Name: " + name);
                System.out.println("Author: " + author);
                System.out.println("Copies Available: " + numberOfCopiesAvailable);
                System.out.printf("Price: $%.2f\n", price);
                System.out.println();
            }
        }