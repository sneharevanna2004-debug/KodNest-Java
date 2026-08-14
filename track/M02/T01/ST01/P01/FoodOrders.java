
    import java.util.Scanner;

class FoodOrder {
    String item;
    int quantity;

    // First constructor: stores item and sets quantity to 1
    FoodOrder(String item) {
        this.item = item;
        this.quantity = 1;
    }

    // Second constructor: stores both item and quantity
    FoodOrder(String item, int quantity) {
        this.item = item;
        this.quantity = quantity;
    }

    void display() {
        System.out.println("Order: " + item + ", Quantity: " + quantity);
    }
}

public class FoodOrders {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read item and quantity
        String item = scanner.nextLine();
        int quantity = scanner.nextInt();

        // 1. Order using only item
        FoodOrder order1 = new FoodOrder(item);

        // 2. Order using item and quantity
        FoodOrder order2 = new FoodOrder(item, quantity);

        // Display both orders
        order1.display();
        order2.display();
    }
}

