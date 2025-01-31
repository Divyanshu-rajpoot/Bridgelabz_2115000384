public class Book {
    private String title;
    private String author;
    private double price;

    public Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public void displayDetails() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: $" + price);
    }

    public static void main(String[] args) {
        Book book1 = new Book("Nothing Last Forever", "Sidney Sheldon", 12.99);
        Book book2 = new Book("Oliver twist", "Charles Dickens", 9.50);

        System.out.println("=== Book 1 ===");
        book1.displayDetails();

        System.out.println("\n=== Book 2 ===");
        book2.displayDetails();
    }
}