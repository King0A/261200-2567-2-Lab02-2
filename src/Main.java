class Book {
    String title;
    String author;
    Double price;

    public Book() {
        this.title = "Unknown";
        this.author = "Unknown";
        this.price = 0.0;
    }

    public Book(String title, String author, Double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public void displayDetails() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: " + price);
        System.out.println("___________________________________________________");
    }

    public void updatePrice(double newPrice) {
        if (newPrice < 0) {
            System.out.println("ราคาติดลบไม่ได้คับพี่");
        } else {
            this.price = newPrice;
        }
    }

    public void applyDiscount(double discountPercentage) {

        if (discountPercentage <= 0.0 || discountPercentage >= 100.0) {
            System.out.println("Error: Discount must be greater than 0 and less than 100.");
            return;
        }

        double discountAmount = price * (discountPercentage / 100.0);
        price = price - discountAmount;

        System.out.println("Discount applied: " + discountPercentage + "%");
        System.out.println("Updated price: " + price);
    }
}

public class Main {
    public static void main(String[] args) {

        Book unknownBook = new Book();
        unknownBook.displayDetails();

        Book hp1Book = new Book(
                "Harry Potter and the Philosopher's Stone",
                "J.K. Rowling",
                350.00
        );
        hp1Book.displayDetails();

        hp1Book.updatePrice(320.00);
        hp1Book.displayDetails();

        hp1Book.updatePrice(-320.00);
        hp1Book.displayDetails();

        hp1Book.applyDiscount(-20);    // invalid
        hp1Book.applyDiscount(0);      // invalid
        hp1Book.applyDiscount(0.5);    // valid
        hp1Book.applyDiscount(25.00);  // valid
        hp1Book.applyDiscount(50);     // valid
        hp1Book.applyDiscount(100.00); // invalid
        hp1Book.applyDiscount(150);    // invalid

        hp1Book.displayDetails();
    }
}
