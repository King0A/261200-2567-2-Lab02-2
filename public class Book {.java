public class Book {
    private String title;
    private String author;
    private double price;

    public Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    // Method to apply discount
    public void applyDiscount(double discountPercentage) {
        if (discountPercentage > 0.00 && discountPercentage < 100.00) {
            double discountAmount = price * (discountPercentage / 100);
            price -= discountAmount;
            System.out.println("Discount of " + discountPercentage + "% applied. New price: $" + price);
        } else {
            System.out.println("Invalid discount percentage. It must be greater than 0.00 and less than 100.00.");
        }
    }

    // Getters and setters for title, author, and price
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public static void main(String[] args) {
        Book book = new Book("Sample Book", "Author Name", 100.00);
        book.applyDiscount(-20);   // Invalid
        book.applyDiscount(0);     // Invalid
        book.applyDiscount(0.5);   // Valid
        book.applyDiscount(25.00); // Valid
        book.applyDiscount(50);    // Valid
        book.applyDiscount(100.00);// Invalid
        book.applyDiscount(150);   // Invalid
    }
}