
    import java.util.Scanner;

class DeliveryCalculator {
    int calculateCharge(int distance) {
        return distance * 5;
    }

    int calculateCharge(int distance, int expressFee) {
        return distance * 5 + expressFee;
    }
}

public class DeliveryCharge {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int distance = scanner.nextInt();
        int expressFee = scanner.nextInt();

        DeliveryCalculator calc = new DeliveryCalculator();

        // Call the one-parameter overload
        int standardCharge = calc.calculateCharge(distance);

        // Call the two-parameter overload
        int expressCharge = calc.calculateCharge(distance, expressFee);

        // Print both returned charges
        System.out.println("Standard Charge: " + standardCharge);
        System.out.println("Express Charge: " + expressCharge);
    }
}
