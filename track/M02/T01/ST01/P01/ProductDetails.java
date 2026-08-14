
    import java.util.Scanner;

class Product {
    String name;
    double price;

    // Parameterized constructor using 'this'
    Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    void display() {
        System.out.println("Product: " + name);
        System.out.println("Price: " + price);
    }
}

public class ProductDetails {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read product name and price with correct types
        String name = scanner.next();
        double price = scanner.nextDouble();

        // Create Product object
        Product p = new Product(name, price);

        // Call display
        p.display();
    }
}

