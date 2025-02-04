
public class Product {
    static double discount = 5.0;
    private String productName;
    private double price;
    private int quantity;

    final int productID;

    public Product(int productID , String productName, double price, int quantity) {
        this.productID = productID;
        this.productName = productName;
        this.price = price;
        this.quantity = quantity;
    }

    public static void updateDiscount(double newDiscount) {
        discount = newDiscount;
        System.out.println("Updated Discount percentage: " + discount);
    }

    public void displayDetails() {
        if (this instanceof Product) {
            System.out.println("Product Id: "+ productID);
            System.out.println("Product Name: " + productName);
            System.out.println("Price: " + price);
            System.out.println("Quantity: " + quantity);
            System.out.println("Discount percentage: " + discount);
        }
    }

    public static void main(String[] args) {
        Product product1 = new Product(001, "headphones", 2000, 15);
        Product product2= new Product(002, "Laptop", 60000, 5);
        product1.displayDetails();
        product2.displayDetails();
        Product.updateDiscount(15.0);
    }
}
